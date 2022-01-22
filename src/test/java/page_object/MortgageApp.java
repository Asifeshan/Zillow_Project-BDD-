package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MortgageApp extends NavigationBar{
   // private static final By FindAnAgentTitle = By.xpath("//h1[text()='Find an Agent']");
    private static final By MobileNumberBar = By.xpath("//div/form[1]/div[1]/input[contains(@class,'zg-sonar-widget_form__input')]");
    private static final By TextAppButton = By.xpath("//div/form[1]/div[1]/button[contains(@class,'zg-sonar-widget_form__submit')]");
    private static final By SuccessMessage = By.xpath("//div/div[contains(@class,'zg-sonar-widget_form__success')]");

    private static final Logger LOGGER = LogManager.getLogger(MortgageApp.class);

    public MortgageApp(WebDriver driver) {
        super(driver);
    }

//    public MortgageApp waitForPageToLoad() throws Exception{
//        try {
//            ActOn.wait(driver, FindAnAgentTitle).waitForElementToBeVisible();
//            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//            return this;
//        }catch (Exception e)
//        {
//            System.out.println("Human verification Button Exception");
//        }
//        return this;
//
//    }

    public MortgageApp clicksMobileNumber() throws Exception{
        try {
            ActOn.wait(driver, MobileNumberBar).waitForElementToBeVisible();
            ActOn.element(driver, MobileNumberBar).click();
            LOGGER.debug("User Clicks On Mobile Number Bar");

        } catch (Exception e)
        {
            System.out.println("Human verification Button Exception");
        }
        return this;
    }
    public MortgageApp TypeMobileNumber(String value) throws Exception{
        try {
            ActOn.wait(driver, MobileNumberBar).waitForElementToBeVisible();
            ActOn.element(driver, MobileNumberBar).setValue(value);
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            LOGGER.debug("User Input Phone Number");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public MortgageApp clicksTextApp() throws Exception{
        try {
            ActOn.wait(driver, TextAppButton).waitForElementToBeVisible();
            ActOn.element(driver, TextAppButton).click();
            LOGGER.debug("User Clicks On Text App Button");

        } catch (Exception e)
        {
            System.out.println("Human verification Button Exception");
        }
        return this;
    }
    public MortgageApp DisplaySuccessMessage() throws Exception{
        try {
            ActOn.wait(driver, SuccessMessage).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, SuccessMessage).elementIsDisplayed();
            LOGGER.debug("User Can see the Success Message");

        } catch (Exception e)
        {
            System.out.println("Human verification Button Exception");
        }
        return this;
    }
    }

//        ActOn.wait(driver, DownloadZillowAppHeader).waitForElementToBeVisible();
//        AssertThat.elementAssertions(driver, DownloadZillowAppHeader).elementIsDisplayed();
//        //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        return this;
//    }
