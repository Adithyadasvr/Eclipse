package Base;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

public class Homepage {

    WebDriver driver;
    WebDriverWait wait;

    public Homepage(WebDriver driver)
    {
        this.driver = driver;

        wait = new WebDriverWait(
                driver, Duration.ofSeconds(15));
    }

    // Find all links

    public List<WebElement> getAllLinks()
    {
        return driver.findElements(
                By.cssSelector("a[href]"));
    }

    // Count total links

    public void linkCount()
    {
        List<WebElement> links = getAllLinks();

        System.out.println(
                "Total number of links: " + links.size());
    }

    // Find broken links

    public void brokenLinks()
    {
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link : links)
        {
            String url = link.getAttribute("href");

            if(url != null && !url.isEmpty() &&
               (url.startsWith("http://") || url.startsWith("https://")))
            {
                try
                {
                    HttpURLConnection con = (HttpURLConnection)
                            URI.create(url).toURL().openConnection();

                    con.setRequestMethod("GET");
                    con.setConnectTimeout(5000);
                    con.setReadTimeout(5000);

                    int code = con.getResponseCode();

                    if(code >= 400)
                    {
                        System.out.println("Broken link: " + url + " Status: " + code);
                    }

                    con.disconnect();
                }
                catch(Exception e)
                {
                    System.out.println("Broken link: " + url);
                }
            }
        }
    }
    // Click a link that opens in a new tab

    public void clickNewTabLink()
    {
        List<WebElement> links = getAllLinks();

        for(WebElement link : links)
        {
            String target = link.getAttribute("target");

            if("_blank".equalsIgnoreCase(target))
            {
                wait.until(
                    ExpectedConditions.elementToBeClickable(link));

                link.click();

                System.out.println("New tab link clicked");

                return;
            }
        }

        System.out.println("No new tab link found");
    }

    // Switch to new tab

    public void switchNewTab(String parent)
    {
        wait.until(d ->
                d.getWindowHandles().size() > 1);

        Set<String> windows = driver.getWindowHandles();

        for(String window : windows)
        {
            if(!window.equals(parent))
            {
                driver.switchTo().window(window);

                break;
            }
        }

        System.out.println(
                "New tab title: " + driver.getTitle());
    }

    // Verify page title

    public void verifyTitle()
    {
        String title = driver.getTitle();

        System.out.println("Page title: " + title);

        Assert.assertFalse(
                title.isBlank(),
                "Page title is empty");
    }

    // Verify URL using assertion

    public void verifyURL()
    {
        String url = driver.getCurrentUrl();

        System.out.println("Current URL: " + url);

        Assert.assertTrue(
                url.startsWith("https://"),
                "URL verification failed");
    }

    // Switch back to parent window

    public void switchParent(String parent)
    {
        driver.switchTo().window(parent);

        System.out.println(
                "Parent URL: " + driver.getCurrentUrl());
    }

    // Click Enroll Now

    public void enrollNow()
    {
        By locator = By.xpath(
                "//a[contains(translate(normalize-space(.),"
                + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
                + "'abcdefghijklmnopqrstuvwxyz'),"
                + "'enroll now')]"
                + " | //button[contains(translate(normalize-space(.),"
                + "'ABCDEFGHIJKLMNOPQRSTUVWXYZ',"
                + "'abcdefghijklmnopqrstuvwxyz'),"
                + "'enroll now')]"
        );

        List<WebElement> buttons =
                driver.findElements(locator);

        for(WebElement button : buttons)
        {
            if(button.isDisplayed() && button.isEnabled())
            {
                ((JavascriptExecutor) driver)
                    .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        button);

                button.click();

                System.out.println("Enroll Now clicked");

                return;
            }
        }

        System.out.println(
                "Enroll Now button not found");
    }

    // Fill available form fields

    public void fillForm()
    {
        List<WebElement> fields = driver.findElements(
                By.cssSelector(
                    "input:not([type='hidden'])"
                    + ":not([type='submit'])"
                    + ":not([type='button'])"
                    + ":not([type='checkbox'])"
                    + ":not([type='radio']), textarea"
                ));

        int count = 0;

        for(WebElement field : fields)
        {
            String value = field.getAttribute("value");

            if(!field.isDisplayed() ||
               !field.isEnabled() ||
               (value != null && !value.isEmpty()))
            {
                continue;
            }

            String type = field.getAttribute("type");

            String name = field.getAttribute("name");

            String placeholder =
                    field.getAttribute("placeholder");

            String details =
                    ((name == null ? "" : name) + " "
                    + (placeholder == null ? "" : placeholder))
                    .toLowerCase();

            if("email".equalsIgnoreCase(type) ||
               details.contains("email"))
            {
                field.sendKeys("test@example.com");
            }
            else if(details.contains("phone") ||
                    details.contains("mobile"))
            {
                field.sendKeys("9876543210");
            }
            else if(details.contains("name"))
            {
                field.sendKeys("Test User");
            }
            else
            {
                field.sendKeys("Test Data");
            }

            count++;
        }

        System.out.println(
                "Number of fields filled: " + count);
    }

    // Take screenshot and save inside project folder

    public void screenshot() throws IOException
    {
        File source = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        File destination = new File(
                System.getProperty("user.dir")
                + "/screenshots/ToolsQA.png");

        File parent = destination.getParentFile();

        if(parent != null)
        {
            parent.mkdirs();
        }

        java.nio.file.Files.copy(
                source.toPath(),
                destination.toPath(),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING);

        System.out.println(
                "Screenshot saved: "
                + destination.getAbsolutePath());
    }
}