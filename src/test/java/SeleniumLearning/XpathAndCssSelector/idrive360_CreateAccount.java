package SeleniumLearning.XpathAndCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class idrive360 {
@Test
    public void createAccount() throws InterruptedException {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(5000);

        chromeDriver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(5000);
        chromeDriver.findElement(By.cssSelector("input[formcontrolname=\"fname\"]")).sendKeys("Neeru");
        chromeDriver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Pareek");
        chromeDriver.findElement(By.xpath("//input[contains(@id,\"email\")]")).sendKeys("neeru.pareek@gmail.com");
        chromeDriver.findElement(By.cssSelector("input[id^=\"password\"]")).sendKeys("Admin@123");
        chromeDriver.findElement(By.cssSelector("input[id$=\"cname\"]")).sendKeys("meta");
        //This one is not working
        chromeDriver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("8898889999");
        chromeDriver.findElement(By.xpath("//button[text()=\"Create My Account\"]")).click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        chromeDriver.quit();
    }
}
