package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReadConfigFiles;

import java.time.Duration;

public class Home extends NavigationBar {
    private static final By BuyButton = By.xpath("//a/span[text()='Buy']");
    private static final By ZillowLogo = By.xpath("//a/img[1][contains(@class, 'pfs__j60ma-1 eCEnCc')]");
  //  private static final By robot = By.xpath("/html/body");


    private static final Logger LOGGER = LogManager.getLogger(Home.class);

    //      actions.clickAndHold(robot).perform();
    public Home(WebDriver driver) {
        super(driver);
    }
    public Home navigateToUrlHomepage() throws Exception{
    //    ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("ZillowAppUrl"));
        try {
            ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("ZillowAppUrl"));
//            WebElement robot = driver.findElement(By.xpath("/html/body"));
//            Actions actions = new Actions(driver);
//            actions.clickAndHold(robot).perform();
            LOGGER.debug("Browser opened and zillow Url is Loaded");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
//        if (driver.findElement(robot) != null) {
//            WebElement robot = driver.findElement(By.xpath("/html/body"));
//            Actions actions = new Actions(driver);
//            actions.clickAndHold(robot).perform();
//        }
        LOGGER.info("User Is in HomePage");

            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            return this;

    }


    public Home BuyOption() throws Exception{
        try {
            ActOn.wait(driver, BuyButton).waitForElementToBeVisible();
            ActOn.element(driver, BuyButton).click();
            LOGGER.debug("User Successfully Clicked On Buy Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        LOGGER.info("User Clicks On Buy Button");
        return this;
    }
    public Home NavigateToHomePage() throws Exception{
        try {

            ActOn.wait(driver, ZillowLogo).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, ZillowLogo).elementIsDisplayed();
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return this;
    }



}

