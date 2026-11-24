package Task;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class task {

    ChromeDriver Driver;
    WebDriverWait wait;

    @BeforeTest
    public void a() {

        Driver = new ChromeDriver();

        Driver.manage().window().maximize();

        wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void b() {

        Driver.get("https://rishiherbalindia.linker.store/");
    }

    @Test
    public void c() throws Exception {

        // =====================================================
        // STEP 1 - OPEN WEBSITE
        // =====================================================

        Driver.get("https://rishiherbalindia.linker.store/");


        // =====================================================
        // STEP 2 - MY ACCOUNT -> REGISTER
        // =====================================================

        WebElement myAccount = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[contains(normalize-space(),'My Account')]")
                )
        );

        Actions actions = new Actions(Driver);

        // Hover My Account
        actions.moveToElement(myAccount).perform();

        // Click Register
        WebElement register = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[contains(normalize-space(),'Register')]")
                )
        );

        register.click();


        // =====================================================
        // REGISTER YOUR DETAILS
        // =====================================================
        //
        // Put your registration details here.
        //
        // Example:
        //
        // Driver.findElement(By.xpath("YOUR_NAME_XPATH"))
        //       .sendKeys("Your Name");
        //
        // Driver.findElement(By.xpath("YOUR_EMAIL_XPATH"))
        //       .sendKeys("your@email.com");
        //
        // Driver.findElement(By.xpath("YOUR_PASSWORD_XPATH"))
        //       .sendKeys("YourPassword");
        //
        // Driver.findElement(By.xpath("YOUR_REGISTER_BUTTON_XPATH"))
        //       .click();
        //
        // =====================================================


        // =====================================================
        // STEP 3 - LOGIN
        // =====================================================

        Driver.get("https://rishiherbalindia.linker.store/");

        // Find My Account
        myAccount = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[contains(normalize-space(),'My Account')]")
                )
        );

        // Hover My Account
        actions.moveToElement(myAccount).perform();

        // Click Log In
        WebElement loginLink = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[contains(normalize-space(),'Log In')]")
                )
        );

        loginLink.click();


        // =====================================================
        // ENTER LOGIN DETAILS
        // =====================================================

        WebElement email = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='Enter email']")
                )
        );

        email.sendKeys("YOUR_EMAIL");


        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='Password']")
                )
        );

        password.sendKeys("YOUR_PASSWORD");


        // Click Login button

        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(normalize-space(),'Login')]")
                )
        );

        loginButton.click();


        // =====================================================
        // STEP 4 - SEARCH
        // Herbal agro Growth Booster
        // =====================================================

        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='Search Product']")
                )
        );

        searchBox.sendKeys("Herbal agro Growth Booster");

        searchBox.submit();


        // Wait for product
        WebElement product = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[contains(normalize-space(),'Herbal agro Growth Booster')]")
                )
        );

        product.click();


        // =====================================================
        // STEP 5 - ADD PRODUCT TO WISHLIST
        // =====================================================

        WebElement wishlist = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(
                            "//*[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'add to wishlist')"
                            + " or contains(@title,'wishlist')]"
                        )
                )
        );

        wishlist.click();


        // =====================================================
        // STEP 6
        // SKIN & HAIR CARE -> FAIRNESS CREAM
        // =====================================================

        Driver.get("https://rishiherbalindia.linker.store/");


        // Click SKIN

        WebElement skin = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[normalize-space()='SKIN']")
                )
        );

        skin.click();


        // Click Fairness Cream

        WebElement fairnessCream = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(
                            "//*[contains(normalize-space(),'Fairness Cream')]"
                        )
                )
        );

        fairnessCream.click();


        // Select first product

        WebElement firstProduct = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(
                            "(//*[contains(@class,'product')])[1]"
                        )
                )
        );

        firstProduct.click();


        // Add to wishlist

        WebElement wishlist2 = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(
                            "//*[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'add to wishlist')"
                            + " or contains(@title,'wishlist')]"
                        )
                )
        );

        wishlist2.click();


        // =====================================================
        // STEP 7
        // ALL -> HEALTH -> SAFETY
        // =====================================================

        Driver.get("https://rishiherbalindia.linker.store/");


        // Click ALL

        WebElement all = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[normalize-space()='All']")
                )
        );

        all.click();


        // Go back to home/category page if necessary

        Driver.get("https://rishiherbalindia.linker.store/");


        // Click HEALTH

        WebElement health = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[normalize-space()='HEALTH']")
                )
        );

        health.click();


        // Go back

        Driver.get("https://rishiherbalindia.linker.store/");


        // Click SAFETY

        WebElement safety = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[normalize-space()='SAFETY']")
                )
        );

        safety.click();


        // =====================================================
        // STEP 8
        // SCROLL TO BOTTOM -> ABOUT US
        // =====================================================

        Driver.get("https://rishiherbalindia.linker.store/");


        ((org.openqa.selenium.JavascriptExecutor) Driver)
                .executeScript(
                    "window.scrollTo(0, document.body.scrollHeight);"
                );


        WebElement aboutUs = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[contains(normalize-space(),'About Us')]")
                )
        );

        aboutUs.click();


        // =====================================================
        // STEP 9
        // SCREENSHOT OF PRIVACY POLICY ELEMENT
        // =====================================================

        Driver.get("https://rishiherbalindia.linker.store/");


        ((org.openqa.selenium.JavascriptExecutor) Driver)
                .executeScript(
                    "window.scrollTo(0, document.body.scrollHeight);"
                );


        WebElement privacyPolicy = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath(
                            "//a[contains(normalize-space(),'Privacy Policy')]"
                        )
                )
        );


        File source = privacyPolicy.getScreenshotAs(
                OutputType.FILE
        );


        File destination = new File(
                "C:\\Users\\Public\\privacy_policy.png"
        );


        source.renameTo(destination);


        System.out.println(
                "Privacy Policy screenshot saved successfully."
        );


        // =====================================================
        // STEP 10
        // CHECK RESPONSE CODE
        // =====================================================

        URL url = new URL(
                "https://rishiherbalindia.linker.store/"
        );


        HttpURLConnection connection =
                (HttpURLConnection) url.openConnection();


        connection.setRequestMethod("GET");


        int responseCode =
                connection.getResponseCode();


        System.out.println(
                "Response Code = " + responseCode
        );


        if (responseCode == 200) {

            System.out.println(
                    "Website is working successfully."
            );

        } else {

            System.out.println(
                    "Website response code = "
                    + responseCode
            );
        }


        connection.disconnect();
    }


    // =====================================================
    // AFTER METHOD
    // =====================================================

    @AfterMethod
    public void d() {

        System.out.println(
                "Test execution completed."
        );
    }


    // =====================================================
    // AFTER TEST
    // =====================================================

    @AfterTest
    public void e() {

        if (Driver != null) {

            Driver.quit();
        }
    }
}