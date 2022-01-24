package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Help extends NavigationBar{
    private static final By HelpButton = By.xpath("//a/span[text()='Help']");
    private static final By ZillowLogoHelp = By.xpath("/html/body/header/div[1]/a/img");
    private static final By SubmitARequestButton = By.xpath("//a[text()='Submit a request']");
//    private static final By SubmitARequestHeader = By.xpath("//*[@id='user-nav']/a");
    private static final Logger LOGGER = LogManager.getLogger(Help.class);

    public Help(WebDriver driver) {
        super(driver);
    }

    public Help ClicksOnHelpButton() throws Exception{
        try {
        ActOn.wait(driver, HelpButton).waitForElementToBeVisible();
        ActOn.element(driver, HelpButton).click();
            LOGGER.debug("User Clicks On Help Button");
            }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
    public Help NavigatedToHelpPage() throws Exception{
        try {
        ActOn.wait(driver, ZillowLogoHelp).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver, ZillowLogoHelp).elementIsDisplayed();
            LOGGER.debug("User Successfully Navigated To Help Page");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }

    public Help clickSubmitRequestButton() throws Exception{
        try {
            ActOn.wait(driver, SubmitARequestButton).waitForElementToBeVisible();
            ActOn.element(driver, SubmitARequestButton).click();
            LOGGER.debug("User Successfully Clicked On Submit A request Button");

        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
   // *************Captcha Appears With this step*********//
//    public Help NavigateToSubmitARequestPage() {
//        AssertThat.elementAssertions(driver, SubmitARequestHeader).elementIsDisplayed();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        return this;
//    }
}
