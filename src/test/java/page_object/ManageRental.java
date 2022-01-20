package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageRental extends NavigationBar{
    private static final By ManageRentalButton = By.xpath("//*[@id='manage-rentals']/a/span[text()='Manage Rentals']");
    private static final By ManageRentalPageTitle = By.id("LandingPage-Title");
    private static final By ListingButton = By.xpath("//a/button[text()='Post your first listing free']");
    private static final By WelcomeToZillowLogo = By.xpath("//h2[text()='Welcome to Zillow']");


    private static final Logger LOGGER = LogManager.getLogger(ManageRental.class);
    public ManageRental(WebDriver driver) {
        super(driver);
    }

//    public ManageRental waitForPageToLoad() throws Exception{
//        try {
//            ActOn.wait(driver, ManageRentalPageTitle).waitForElementToBeVisible();
//            LOGGER.debug("User Enters Manage Rental Page");
//        }catch (Exception e)
//        {
//            System.out.println("Human verification Button Appears");
//        }
//        return this;
//    }
    public ManageRental ClicksOnManageRentalButton() throws Exception{
        try {
            ActOn.wait(driver, ManageRentalButton).waitForElementToBeVisible();
            ActOn.element(driver, ManageRentalButton).click();
            LOGGER.debug("User Clicks On Manage Rental Button");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public ManageRental NavigatedToManageRentalPage() throws Exception{
        try {
            ActOn.wait(driver, ManageRentalPageTitle).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, ManageRentalPageTitle).elementIsDisplayed();
            LOGGER.debug("User Is Navigated To Manage Rental Page");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public ManageRental clicksListingButton() throws Exception{
        try {
            ActOn.wait(driver, ListingButton).waitForElementToBeVisible();
            ActOn.element(driver, ListingButton).click();
            LOGGER.debug("User Clicks On Listing Button");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public ManageRental SeeSignInPage() throws Exception{
        try {
            ActOn.wait(driver, WelcomeToZillowLogo).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, WelcomeToZillowLogo).elementIsDisplayed();
            LOGGER.debug("User Successfully Navigated To Sign In Page");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }


}
