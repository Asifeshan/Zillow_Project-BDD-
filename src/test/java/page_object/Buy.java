package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buy extends NavigationBar {
    private static final By SortByButton = By.xpath("//button[text()='Homes for You']");
    private static final By HighToLowButton = By.xpath("//button[text()='Price (High to Low)']");
    private static final By ZillowLogo = By.xpath("//*[@id='page-header-container']/header/nav/div[1]/a/img[1]");
    private static final By AreaSearchBar = By.xpath("//form/div[1]/input[contains(@aria-owns,'react-autowhatever-1')]");
    private static final By AreaSearchButton = By.cssSelector("#srp-search-box > form > div.searchBtnContainer.zillow-searchbox-content-container > button > svg");

    private static final Logger LOGGER = LogManager.getLogger(Buy.class);


    public Buy(WebDriver driver) {
        super(driver);
    }


    public Buy SortByButton()throws Exception{
        try {
            ActOn.wait(driver, SortByButton).waitForElementToBeVisible();
            ActOn.element(driver, SortByButton).click();
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            LOGGER.debug("User Clicks On SortBy Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public Buy MouseHoverToHighToLow()throws Exception{
        try {
            ActOn.wait(driver, HighToLowButton).waitForElementToBeVisible();
            ActOn.element(driver, HighToLowButton).mouseHover();
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            LOGGER.debug("User Mouse Hover To High To Low Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public Buy PriceHighToLow()throws Exception{
        try {
            ActOn.wait(driver, HighToLowButton).waitForElementToBeVisible();
            ActOn.element(driver, HighToLowButton).click();
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            LOGGER.debug("User Clicks On High to low Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public Buy LuxuryHomes()throws Exception{
        try {
            ActOn.wait(driver, ZillowLogo).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, ZillowLogo).elementIsDisplayed();
            LOGGER.debug("User Can see Luxury Homes");
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public Buy UserEntersArea(String Area)throws Exception{
        try {
            ActOn.wait(driver, AreaSearchBar).waitForElementToBeVisible();
            ActOn.element(driver, AreaSearchBar).setValue(Area);
            LOGGER.debug("User Enters Area");
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public Buy AreaSearchButtonClick()throws Exception{
        try {
            ActOn.wait(driver, AreaSearchButton).waitForElementToBeVisible();
            ActOn.element(driver, AreaSearchButton).click();
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            LOGGER.debug("User Clicks On High to low Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }

}
