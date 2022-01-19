package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SearchHome extends NavigationBar{

    private static final By Buy = By.xpath("//a/span[text()='Buy']");
    private static final By HomeForSellButton = By.xpath("//a/span[text()='Homes for sale']");
    private static final By SearchBar = By.xpath("//div[1]/input[contains(@class, 'react-autosuggest__input')]");
    private static final By SearchButton = By.cssSelector("#srp-search-box > form > div.searchBtnContainer.zillow-searchbox-content-container > button > svg");
    private static final By AddressTitleValidation = By.xpath("//h1[text()='19836 Carpenter Ave,']");
    private static final By HomeValueButton = By.xpath("//a[text()='Home value']");
    private static final By ZestimateValidation = By.xpath("//p/button[text()='Zestimate']");
    private static final By HomeDetails = By.xpath("//a[text()='Home details']");
    private static final By FactsAndFeatureValidation = By.xpath("//h4[text()='Facts and features']");
    private static final By NeighbourHoodDetailsButton = By.xpath("//a[text()='Neighborhood details']");
    private static final By NeighbourHoodValidation = By.xpath("//h4[text()='Neighborhood: Hollis']");
    private static final Logger LOGGER = LogManager.getLogger(SearchHome.class);

    public SearchHome(WebDriver driver) {
        super(driver);
    }

    public SearchHome ClickOnHomeForSaleByMouseHoverToBuy() throws Exception{
        try {

            ActOn.wait(driver, Buy).waitForElementToBeVisible();
            ActOn.element(driver, Buy).mouseHover();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            LOGGER.debug("User Mouse Hover to Buy");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
    public SearchHome ClicksOnHomeForSale() throws Exception{
        try {
            ActOn.wait(driver, HomeForSellButton).waitForElementToBeVisible();
            ActOn.element(driver, HomeForSellButton).click();
            LOGGER.debug("User Clicks On Home For Sale");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
    public SearchHome userInPut(String Address) throws Exception{
        try {

            ActOn.wait(driver, SearchBar).waitForElementToBeVisible();
            ActOn.element(driver, SearchBar).setValue(Address);
            LOGGER.debug("User type address in Search Bar");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;


    }
    public SearchHome ClicksOnSearchButton() throws Exception{
        try {
            ActOn.wait(driver, SearchButton).waitForElementToBeVisible();
            ActOn.element(driver, SearchButton).click();
            LOGGER.debug("User Clicks On Search Button");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
    public SearchHome IsNavigatedToSpecificHomeAddress() throws Exception{
        try {
            ActOn.wait(driver, AddressTitleValidation).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, AddressTitleValidation).elementIsDisplayed();
            LOGGER.debug("User Successfully Navigated To Specific Address");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
    public SearchHome ClicksOnHomeValue() throws Exception{
        try {
            ActOn.wait(driver, HomeValueButton).waitForElementToBeVisible();
            ActOn.element(driver, HomeValueButton).click();
            LOGGER.debug("User CAn see the price of the Specific Home");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;


    }
    public SearchHome CanSeeTheHomeValueZestimate() throws Exception{
        try {

            ActOn.wait(driver, ZestimateValidation).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, ZestimateValidation).elementIsDisplayed();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            LOGGER.debug("User Successfully see the Home Price");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }

        return this;


    }
    public SearchHome ClicksOnHomeDetails() throws Exception{
        try {
            ActOn.wait(driver, HomeDetails).waitForElementToBeVisible();
            ActOn.element(driver, HomeDetails).click();
            LOGGER.debug("User Clicks On Home Details");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
    public SearchHome CanSeeTheFactsAndFeature() throws Exception{
        try {
            ActOn.wait(driver, FactsAndFeatureValidation).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, FactsAndFeatureValidation).elementIsDisplayed();
            LOGGER.debug("User Can see facts And Feature");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
    public SearchHome ClicksOnNeighborHoodDetails() throws Exception{
        try {
            ActOn.wait(driver, NeighbourHoodDetailsButton).waitForElementToBeVisible();
            ActOn.element(driver, NeighbourHoodDetailsButton).click();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            LOGGER.debug("User Clicks On NeighbourHood Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
    public SearchHome CanSeeTheNeighborHoodHoodDetails() throws Exception{
        try {
            ActOn.wait(driver, NeighbourHoodValidation).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, NeighbourHoodValidation).elementIsDisplayed();
            LOGGER.debug("User Successfully See The Neighbourhood Info");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
}
