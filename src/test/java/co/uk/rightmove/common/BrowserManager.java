package co.uk.rightmove.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BrowserManager extends DriverManager{

    public WebDriver initChrome(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public WebDriver initEdge(){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    public WebDriver initChromeHeadless(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable gpu", "--headless");
        return new ChromeDriver(options);
    }


    public void launchBrowser(String browser){
        switch (browser){
            case "chrome": driver =initChrome();
            break;
            case "edge": driver = initEdge();
            break;
            case "headless":driver = initChromeHeadless();
            break;
            default: driver = initChrome();
            break;
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }


    public void closeBrowser(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
