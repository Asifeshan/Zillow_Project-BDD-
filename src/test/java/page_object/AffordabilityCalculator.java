package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AffordabilityCalculator extends NavigationBar{
//    private static final By FindAnAgentTitle = By.xpath("//h1[text()='Find an Agent']");
    private static final By AnnualIncomeBar = By.id("annualIncome");
    private static final By MonthlyDebtBar = By.id("monthlyDebts");
    private static final By DownPaymentBar = By.id("downPayment");
    private static final By PaymentButton = By.id("payment-tab");
    private static final By FullReport = By.xpath("//a[contains(@target, '_blank')]");
    private static final By AfforfdAmountLocator = By.xpath("//div/div/main/div/div/div/div/h1[text()='You can afford ']");
    private static final By yourPayment = By.cssSelector("#payment-panel > div > div > div > svg > g > g:nth-child(5) > text:nth-child(2)");
    private static final By MonthlyBudgetLocator = By.xpath("//div/div/main/div/div/div/div/h2[1][text()='Monthly Budget']");

    private static final Logger LOGGER = LogManager.getLogger(AffordabilityCalculator.class);

    public AffordabilityCalculator(WebDriver driver) {
        super(driver);
    }

//    public AffordabilityCalculator waitForPageToLoad() throws Exception{
//        try {
//            ActOn.wait(driver, FindAnAgentTitle).waitForElementToBeVisible();
//        }catch (Exception e)
//        {
//            System.out.println("Human verification Button Appears");
//        }
//        return this;
//    }

    public AffordabilityCalculator typeAnnualIncome(String value) throws Exception{
        try {
            ActOn.wait(driver, AnnualIncomeBar).waitForElementToBeVisible();
            ActOn.element(driver, AnnualIncomeBar).setValue(value);
            LOGGER.debug("User Input value in Annual Income Bar");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AffordabilityCalculator typeMonthlyDebt(String value) throws Exception{
        try {

            ActOn.wait(driver, MonthlyDebtBar).waitForElementToBeVisible();
            ActOn.element(driver, MonthlyDebtBar).setValue(value);
            LOGGER.debug("User Input value in Monthly Debt Bar");
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AffordabilityCalculator typeDownPayment(String value)throws Exception {
        try {

            ActOn.wait(driver, DownPaymentBar).waitForElementToBeVisible();
            ActOn.element(driver, DownPaymentBar).setValue(value);
            LOGGER.debug("User Input value in Down Payment Bar");
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AffordabilityCalculator paymentButtonClick()throws Exception {
        try {
            ActOn.wait(driver, PaymentButton).waitForElementToBeVisible();
            ActOn.element(driver, PaymentButton).click();
            LOGGER.debug("User Clicks On Payment Button");
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AffordabilityCalculator SeeFullReport()throws Exception {
        try {

            ActOn.wait(driver, FullReport).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, FullReport).elementIsDisplayed();
            LOGGER.debug("User Can Successfully See the Full Report");
            //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AffordabilityCalculator SeeMonthlyBudget()throws Exception {
        try {

//        String currentWindowHandle = driver.getWindowHandle();
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String windowHandle : windowHandles){
//            if (!currentWindowHandle.equals(windowHandle));
//        }
            ActOn.wait(driver, MonthlyBudgetLocator).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, MonthlyBudgetLocator).elementIsDisplayed();
            LOGGER.debug("User Can Successfully See THe Monthly Budget");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }

    public AffordabilityCalculator validatingAffordableAmount(String expectedValue)throws Exception {
        try {
//                    String currentWindowHandle = driver.getWindowHandle();
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String windowHandle : windowHandles){
//            if (!currentWindowHandle.equals(windowHandle));
//        }
            //     ActOn.browser(driver).openBrowser("https://www.zillow.com/mortgage/calculator/affordability/advanced-report/?annualIncome=100000&monthlyDebts=500&customPayment=false&monthlyPayment=1850&monthlyPaymentMax=3700&downPayment=50000&dti=36&rate=3.353&term=360&includeTaxesInsurance=true&propertyTaxRate=1.2&annualHomeownersInsurance=800&includePMI=true&monthlyHOA=0");
            ActOn.wait(driver, AfforfdAmountLocator).waitForElementToBeVisible();
            String AffordabilityAmount = ActOn.element(driver, AfforfdAmountLocator).getTextValue();
            // now I will do the comparison
            Assert.assertEquals(expectedValue, AffordabilityAmount);
            LOGGER.debug("User Successfully Validate Affordability Amount");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }

    public AffordabilityCalculator ClicksFullreport() throws Exception{
        try {
            ActOn.wait(driver, FullReport).waitForElementToBeVisible();
            ActOn.element(driver, FullReport).click();
            LOGGER.debug("User Clicks On Full Report");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }

    public AffordabilityCalculator validatePaymentAmount(String payment) throws Exception{
        try {
            ActOn.wait(driver, yourPayment).waitForElementToBeVisible();
            String yourPaymentAmount = ActOn.element(driver, yourPayment).getTextValue();
            // now I will do the comparison
            Assert.assertEquals(payment, yourPaymentAmount);
            LOGGER.debug("User Successfully Validate Your Payment Amount");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
}
