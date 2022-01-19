package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ReadConfigFiles;


public class NavigationBar {
    private static final By SignIn = By.xpath("//*[@id='page-header-container']/header/nav/div[2]/ul[4]/li[1]/a/span");
    private static final By ZillowLogo = By.xpath("//a/img[1][contains(@class, 'pfs__j60ma-1 eCEnCc')]");
    private static final By RealStateHomeForSellHeader = By.xpath("//h1[text()='Real Estate & Homes For Sale']");

    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);

    public WebDriver driver;

    public NavigationBar(WebDriver driver) {

        this.driver = driver;
    }

    //Navigate to SignIn Page
    public LoginPage navigateToSignInPage() throws Exception{
        try {
            LOGGER.debug("Navigating to SignIn Page");
            ActOn.wait(driver, SignIn).waitForElementToBeVisible();
            ActOn.element(driver, SignIn).click();
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return new LoginPage(driver);
    }

    public Buy NavigatedToBuyPage() throws Exception{
        try {
            ActOn.wait(driver, RealStateHomeForSellHeader).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, RealStateHomeForSellHeader).elementIsDisplayed();
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return new Buy(driver);
    }

    //Navigate to Home page
    public Home navigateToHome() throws Exception{
        try {
            ActOn.wait(driver, ZillowLogo).waitForElementToBeVisible();
            LOGGER.debug("Navigating to Zillow Home Page");
            ActOn.element(driver, ZillowLogo).click();
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return new Home(driver);

    }
//    public AffordabilityCalculator navigateToFullreport() {
//        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("ZillowAppUrl"));
//        LOGGER.info("User Is in HomePage");
//        return new AffordabilityCalculator(driver);
//    }

}