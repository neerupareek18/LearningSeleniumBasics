package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium04 {

    public void navigateMethods() throws MalformedURLException {
        //drawback of get -- can't go back/forward
        //that is why, use navigate

        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.navigate().to("https://app.vwo.com/");
        chromeDriver.navigate().to(new URL("https://google.com"));

        //The URLs won't work without the protocol, important to give http, https

        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();

        chromeDriver.quit();
    }
}
