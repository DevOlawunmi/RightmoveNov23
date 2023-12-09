package co.uk.rightmove.pages;

import co.uk.rightmove.common.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PropertyDetailsPage extends BasePage{
    public PropertyDetailsPage(WebDriver driver){
        DriverManager.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
