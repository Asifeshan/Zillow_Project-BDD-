package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ReadConfigFiles;


public class NavigationBar {
    private static final By FindAnAgentTitle = By.xpath("//h1[text()='Find an Agent']");
    private static final By AffordabilityCalculatorButton = By.linkText("Affordability calculator");
    private static final By AffordabilityCalculatorHeader = By.xpath("//h1[text()='Affordability Calculator']");
    private static final By SignIn = By.xpath("//*[@id='page-header-container']/header/nav/div[2]/ul[4]/li[1]/a/span");
    private static final By ZillowLogo = By.xpath("//a/img[1][contains(@class, 'pfs__j60ma-1 eCEnCc')]");
    private static final By RealStateHomeForSellHeader = By.xpath("//h1[text()='Real Estate & Homes For Sale']");
    private static final By AgentFinderButton = By.xpath("//a/span[text()='Agent finder']");
    private static final By AgentFinderTab = By.xpath("//a/span[text()='Agent finder']");
    private static final By AgentResourceCenterTab = By.xpath("//a/span[text()='Agent resource center']");
    private static final By ZillowPrimierAgentLogo = By.cssSelector("#header > div.main-nav-container.container > a > svg");
    private static final By LenderResourceCenter = By.xpath("//a/span[text()='Lender resource center']");
    private static final By MortgageAppButton = By.linkText("Mortgages app");
    private static final By DownloadZillowAppHeader = By.id("heading-v4CjHK");
    private static final By Buy = By.xpath("//a/span[text()='Buy']");
    private static final By HomeLoansButton = By.xpath("//a/span[text()='Home Loans']");

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
    public AffordabilityCalculator MouseHoverToAffordabilityCalculatorButton() throws Exception{
        try {
            ActOn.wait(driver, HomeLoansButton).waitForElementToBeVisible();
            ActOn.element(driver, HomeLoansButton).mouseHover();
            LOGGER.debug("User Mouse Hover to HomeLoan Button");
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (AffordabilityCalculator) this;
    }

    public AffordabilityCalculator AffordabilityCalculatorButtonClick() throws Exception{
        try {
            ActOn.wait(driver, AffordabilityCalculatorButton).waitForElementToBeVisible();
            ActOn.element(driver, AffordabilityCalculatorButton).click();
            LOGGER.debug("User clicks on Affordability Calculator Button");

            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (AffordabilityCalculator) this;
    }
    public AffordabilityCalculator NavigateToAffordabilityCalculatorPage() throws Exception{
        try {
            ActOn.wait(driver, AffordabilityCalculatorHeader).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, AffordabilityCalculatorHeader).elementIsDisplayed();
            LOGGER.debug("User Successfully Navigated to Affordability Calculator Page");
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (AffordabilityCalculator) this;
    }
    public AffordabilityCalculator NavigateToFullReportTab() throws Exception{
        try {
            ActOn.browser(driver).openBrowser("https://www.zillow.com/mortgage/calculator/affordability/advanced-report/?annualIncome=100000&monthlyDebts=500&customPayment=false&monthlyPayment=1850&monthlyPaymentMax=3700&downPayment=50000&dti=36&rate=3.353&term=360&includeTaxesInsurance=true&propertyTaxRate=1.2&annualHomeownersInsurance=800&includePMI=true&monthlyHOA=0");
            LOGGER.debug("User Navigated To Full Report Tab");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (AffordabilityCalculator) this;
    }
    public AgentFinder ClicksOnAgentFinderButton()throws Exception {
        try {

            ActOn.wait(driver, AgentFinderButton).waitForElementToBeVisible();

            ActOn.element(driver, AgentFinderButton).click();
            LOGGER.debug("User Clicks On Agent Finder Button");
            //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (AgentFinder) this;
    }

    public AgentFinder NavigatedToAgentFinderPage() throws Exception{
        try {
            ActOn.wait(driver, FindAnAgentTitle).waitForElementToBeVisible();

            AssertThat.elementAssertions(driver, FindAnAgentTitle).elementIsDisplayed();
            LOGGER.debug("User Successfully Navigated To Agent Finder Page");
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (AgentFinder) this;
    }
    public AgentTraining MouseHoverToAgentFinder() throws Exception{
        try {

            ActOn.wait(driver, AgentFinderTab).waitForElementToBeVisible();
            ActOn.element(driver, AgentFinderTab).mouseHover();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            LOGGER.debug("User Mouse Hover To Agent Finder Tab");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (AgentTraining) this;
    }

    public AgentTraining ClicksOnAgentResourceCenter() throws Exception{
        try {
            ActOn.wait(driver, AgentResourceCenterTab).waitForElementToBeVisible();
            ActOn.element(driver, AgentResourceCenterTab).click();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            LOGGER.debug("User Clicks On Agent Resource Center Tab");

        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (AgentTraining) this;

    }
    public AgentTraining NavigatedToAgentResourcesPage() throws Exception{
        try {
            ActOn.wait(driver, ZillowPrimierAgentLogo).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, ZillowPrimierAgentLogo).elementIsDisplayed();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            LOGGER.debug("User Successfully Navigated To Agent Resource Page");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (AgentTraining) this;

    }
    public LanderResource MouseHoverLenderResourcesCenter() throws Exception{
        try {
            ActOn.wait(driver, HomeLoansButton).waitForElementToBeVisible();
            ActOn.element(driver, HomeLoansButton).mouseHover();
            LOGGER.debug("User Mouse Hover to HomeLoan Button");
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (LanderResource) this;
    }

    public LanderResource ClickLenderResourcesCenter() throws Exception{
        try {
            ActOn.wait(driver, LenderResourceCenter).waitForElementToBeVisible();
            ActOn.element(driver, LenderResourceCenter).click();
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            LOGGER.debug("User Clicked on Lander resource center");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return (LanderResource) this;
    }
    public MortgageApp MouseHoverToMortgageApp() throws Exception{
        try {
            ActOn.wait(driver, HomeLoansButton).waitForElementToBeVisible();
            ActOn.element(driver, HomeLoansButton).mouseHover();
            LOGGER.debug("User Mouse Hover to Home Loan Button");

        } catch (Exception e)
        {
            System.out.println("Human verification Button Exception");
        }
        return (MortgageApp) this;

    }

    //        ActOn.wait(driver, HomeLoansButton).waitForElementToBeVisible();
//        ActOn.element(driver, HomeLoansButton).mouseHover();
//        //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        return this;
//    }
    public MortgageApp clicksMortgagesApp() throws Exception{
        try {
            ActOn.wait(driver, MortgageAppButton).waitForElementToBeVisible();
            ActOn.element(driver, MortgageAppButton).click();
            LOGGER.debug("User Clicks On Mortgage App Button");

        } catch (Exception e)
        {
            System.out.println("Human verification Button Exception");
        }
        return (MortgageApp) this;
    }
    //        ActOn.wait(driver, MortgageAppButton).waitForElementToBeVisible();
//        ActOn.element(driver, MortgageAppButton).click();
//        //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        return this;
//    }
    public MortgageApp NavigateToMortgagesAppPage() throws Exception{
        try {
            ActOn.wait(driver, DownloadZillowAppHeader).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, DownloadZillowAppHeader).elementIsDisplayed();
            LOGGER.debug("User Is navigated to Mortgage App Page");

        } catch (Exception e)
        {
            System.out.println("Human verification Button Exception");
        }
        return (MortgageApp) this;
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
        return (SearchHome) this;

    }

}