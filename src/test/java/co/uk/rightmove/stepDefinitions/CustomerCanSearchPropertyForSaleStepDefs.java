package co.uk.rightmove.stepDefinitions;

import co.uk.rightmove.pages.BasePage;
import co.uk.rightmove.pages.HomePage;
import co.uk.rightmove.pages.SearchCriteriaPage;
import co.uk.rightmove.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CustomerCanSearchPropertyForSaleStepDefs extends BasePage {

    HomePage homepage = new HomePage(driver);
    SearchCriteriaPage searchCriteriaPage = new SearchCriteriaPage(driver);
    SearchResultPage searchResultPage = new SearchResultPage(driver);
    @Given("I navigate to the homepage")
    public void i_navigate_to_the_homepage() {

    launchURL();

    }

    @When("I enter {string} in the search field")
    public void i_enter_in_the_search_field(String location) {
        homepage.enterLocation(location);

    }

    @And("I accept all cookies")
    public void iAcceptAllCookies() {
        homepage.clickAcceptCookies();
    }

    @When("I click on For Sale button")
    public void i_click_on_for_sale_button() {
        homepage.clickForSaleButton();

    }

    @When("I ensure that the search criteria page is displayed")
    public void i_ensure_that_the_search_criteria_page_is_displayed() {
    boolean res=  searchCriteriaPage.IsSearchCriteriaPageDisplayed();
        Assert.assertTrue(res);
    }

    @When("I select radius {string} of the location")
    public void i_select_radius_of_the_location(String radius) {
    searchCriteriaPage.selectSearchRadius(radius);
    }

    @When("I select minimum price of {string}")
    public void i_select_minimum_price_of(String minPrice) {
    searchCriteriaPage.selectMinimumPrice(minPrice);
    }

    @When("I select maximum price of {string}")
    public void i_select_maximum_price_of(String string) {

    }

    @When("I select minimum number of bedrooms as {string}")
    public void i_select_minimum_number_of_bedrooms_as(String string) {

    }

    @When("I select maximum number of bedrooms as {string}")
    public void i_select_maximum_number_of_bedrooms_as(String maxBedrooms) {
        searchCriteriaPage.selectMaxBedrooms(maxBedrooms);
    }

    @When("I select {string} as property type")
    public void i_select_as_property_type(String property) {
        searchCriteriaPage.selectPropertyType(property);

    }

    @When("I select {string} as added to site option")
    public void i_select_as_added_to_site_option(String string) {

    }

    @When("I click on Find properties button")
    public void i_click_on_find_properties_button() {
        searchCriteriaPage.clickSubmitButton();

    }

    @When("I verify that the search result page is displayed")
    public void i_verify_that_the_search_result_page_is_displayed() {
       boolean res = searchResultPage.isSearchResultPageDisplayed();
       Assert.assertTrue(res);

    }

    @When("I click on the second result")
    public void i_click_on_the_second_result() {
    searchResultPage.clickSecondProperty();
    }

    @Then("the details of the selected property are displayed")
    public void the_details_of_the_selected_property_are_displayed() {

    }



}
