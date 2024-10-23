package SeleniumLearning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium03 {

    @Test
    public void testMethod(){
        ChromeDriver chromeDriver;
        chromeDriver = new ChromeDriver(); //Session ID is created, create fresh copy of chrome drive
        //This is a post request to /session

        chromeDriver.get("https://katalon.com/");//Session id -- Navigate to the given url

        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println(chromeDriver.getTitle());
        System.out.println(chromeDriver.getPageSource());

        Assert.assertTrue(chromeDriver.getPageSource().contains("Katalon is your all-in-one test automation solution."));

        chromeDriver.quit(); //Close all the tabs in the browser, session Id gets null
    }
}
