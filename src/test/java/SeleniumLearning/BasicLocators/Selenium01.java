package SeleniumLearning;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium01 {
    /*
Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
Find the Email id** and enter the email as admin@admin.com
Find the pass inputbox** and enter passwrod as admin.
Find and Click on the submit button
Verify that the error message is shown "Your email, password, IP address or location did not match"
     */

    @Description("Verify that with the invalid cred, app.vwo.com gives error")
    @Test
    public void Basiclocators() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--guest");
        chromeOptions.addArguments("--window-size=800,600");

        WebDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://app.vwo.com/");

        //Order to use the locators when they are uniquely identified:
        //If any value seems to be dynamic/changing -- that locator is not used and switch to next

        //id, name, className, tagName,
        //linkText, partialLinkText -- only work with <a> tags
        // Advance -- cssSelectot, xpath

        WebElement email = chromeDriver.findElement(By.id("login-username"));
        email.sendKeys("abc@wingify.com");

        WebElement pass = chromeDriver.findElement(By.name("password"));
        pass.sendKeys("Admin@123");

        WebElement submit = chromeDriver.findElement(By.id("js-login-btn"));
        submit.click();

        Thread.sleep(5000);

        WebElement errorMsg = chromeDriver.findElement(By.className("notification-box-description"));

        Assert.assertTrue(errorMsg.getText().equalsIgnoreCase("Your email, password, IP address or location did not match"));

        chromeDriver.quit();
    }

}
