package co.uk.rightmove.pages;

import co.uk.rightmove.common.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver driver)
    {
        DriverManager.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".propertyCard-address.property-card-updates")
    private List<WebElement> results;


    public boolean isSearchResultPageDisplayed(){
        return driver.getCurrentUrl().contains("find.html");
    }


    public PropertyDetailsPage clickSecondProperty(){
        results.get(1).click();
        return new PropertyDetailsPage(driver);
    }
}
