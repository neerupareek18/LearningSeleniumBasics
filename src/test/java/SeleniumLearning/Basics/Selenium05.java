package SeleniumLearning;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium05 {
    public void driverOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--window-size=800,600");
        chromeOptions.addArguments("--guest");

        //Proxy or VPN can also be added --
        //Proxy, VPN are used as bridge to connect to internet, to prevent the data/information

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("<IP Address>");
        chromeOptions.setCapability("proxy",proxy);

        WebDriver chromeDriver = new ChromeDriver();
    }
}
