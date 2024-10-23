package SeleniumLearning;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    public void testMethod(){
        //In Selenium 3, we used to set the path of the webdriver
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        //In Selenium4 -- Opera is removed, no use of setProperty command

        //OOPs Concepts used -- Upcasting, Dynamic dispatch

        //Class Hierarchy
        //Object->SearchContext Interface (find element/s methods)->WebDriver Interface extends SC->
        //Remote WebDriver class (implements WD)->Chrome,Firefox,Safari, etc.etc.

        //If they don't follow the implements and extends, then every driver will have different functions to gte for ex
        //Interface is used to maintain the same function names accross every class which implements them

        SearchContext chromeDriver = new ChromeDriver(); //It is possible - Dynamic Dispatch


    }
}
