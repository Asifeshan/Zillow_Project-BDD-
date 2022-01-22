package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends NavigationBar {
//    private static final By ZillowLogo = By.xpath("//a/img[1][contains(@class, 'pfs__j60ma-1 eCEnCc')]");
//    private static final By SignIn = By.xpath("//*[@id='page-header-container']/header/nav/div[2]/ul[4]/li[1]/a/span");
    private static final By Email = By.id("reg-login-email");
    private static final By Password = By.id("inputs-password");
    private static final By SignInButton = By.xpath("//input[contains(@class, 'StyledButton')]");
    private static final By PageHeader = By.xpath("//h2[text()='Welcome to Zillow']");


    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class);
    public LoginPage(WebDriver driver) {
        super(driver);
    }
//    public LoginPage waitForPageToLoad() throws Exception{
//        try {
//            ActOn.wait(driver, ZillowLogo).waitForElementToBeVisible();
//            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//        }catch (Exception e)
//        {
//            System.out.println("Human verification Button Appears");
//        }
//        return this;
//    }
//    public LoginPage ClickSignIn() throws Exception{
//        try {
//
//            ActOn.wait(driver, SignIn).waitForElementToBeVisible();
//            ActOn.element(driver, SignIn).click();
//            LOGGER.debug("User Clicks In Sign IN Button");
//            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//        }catch (Exception e)
//        {
//            System.out.println("Human verification Button Appears");
//        }
//        return this;
//    }
    public LoginPage UserEntersEmail() throws Exception{
        try {
            String email = "my.work14625@gmail.com";
            ActOn.wait(driver, Email).waitForElementToBeVisible();
            ActOn.element(driver, Email).setValue(email);
            LOGGER.debug("User Enters Email");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public LoginPage UserEntersPassword() throws Exception{
        try {
            String password = "Coffee@2000";
            ActOn.wait(driver, Password).waitForElementToBeVisible();
            ActOn.element(driver, Password).setValue(password);
            LOGGER.debug("User Enters password");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public LoginPage ClickLoginButton() throws Exception{
        try {
            ActOn.wait(driver, SignInButton).waitForElementToBeVisible();
            ActOn.element(driver, SignInButton).click();
            LOGGER.debug("User Clicks On Sign In Button");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }

    public LoginPage TypeEmail(String value) throws Exception{
        try {
            ActOn.wait(driver, Email).waitForElementToBeVisible();
            ActOn.element(driver, Email).setValue(value);
            LOGGER.debug("User Enters Email");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public LoginPage TypePassword(String value) throws Exception{
        try {

            ActOn.wait(driver, Password).waitForElementToBeVisible();
            ActOn.element(driver, Password).setValue(value);
            LOGGER.debug("User Enters password");
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public LoginPage typeValidEmail() throws Exception{
        try {
            String validEmail ="my.work14625@gmail.com";
            ActOn.wait(driver, Email).waitForElementToBeVisible();
            ActOn.element(driver, Email).setValue(validEmail);
            LOGGER.debug("User Enters Valid Email");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public LoginPage typeInValidPassword() throws Exception{
        try {
            String invalidPassword ="Coffee@3000";
            ActOn.wait(driver, Password).waitForElementToBeVisible();
            ActOn.element(driver, Password).setValue(invalidPassword);
            LOGGER.debug("User Enters InvalidPassword");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public LoginPage userStillOnSignInPage()throws Exception{
        try {
            ActOn.wait(driver, PageHeader).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, PageHeader).elementIsDisplayed();
            LOGGER.debug("User Is not navigated and still on sign in page");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }

}