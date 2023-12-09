package co.uk.rightmove.pages;

import co.uk.rightmove.common.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCriteriaPage extends BasePage{
    public SearchCriteriaPage(WebDriver driver)
    {
        DriverManager.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(id = "minPrice")
    private WebElement minimumPrice;

    @FindBy(id = "radius")
    private WebElement searchRadius;

    @FindBy(id = "maxBedrooms")
    private WebElement maxBeds;

    @FindBy(id = "displayPropertyType")
    private WebElement pptyType;

    @FindBy (id = "submit")
    private WebElement submitButton;

    public boolean IsSearchCriteriaPageDisplayed(){
     return  driver.getCurrentUrl().contains("search.html");
    }


    public void selectSearchRadius(String radius){
        selectElementByText(searchRadius,radius);
    }

    public void selectMinimumPrice(String minPrice){
        selectElementByValue(minimumPrice, minPrice );
    }

    public void selectMaxBedrooms(String maxBedrooms){
        selectElementByText(maxBeds,maxBedrooms);
    }

    public void selectPropertyType(String property){
        selectElementByText(pptyType,property);
    }

    public SearchResultPage clickSubmitButton(){
        submitButton.click();
        return new SearchResultPage(driver);
    }
}


