package Test;

import org.testng.annotations.Test;

import Base.Baseclass;
import Base.Homepage;

public class HomeTest extends Baseclass {

    @Test
    public void test() throws Exception
    {
        Homepage ob = new Homepage(driver);

        // 1. Find total number of links
        ob.linkCount();

        // 2. Identify broken links
        ob.brokenLinks();

        // 3. Store parent window ID
        String parent = driver.getWindowHandle();

        // 4. Click a link that opens in a new tab
        ob.clickNewTabLink();

        // 5. Switch to new tab
        ob.switchNewTab(parent);

        // 6. Verify page title
        ob.verifyTitle();

        // 7. Verify URL using assertion
        ob.verifyURL();

        // 8. Switch back to parent window
        ob.switchParent(parent);

        // 9. Click Enroll Now
        ob.enrollNow();

        // 10. Fill form fields
        ob.fillForm();

        // 11. Take screenshot
        ob.screenshot();
    }
}