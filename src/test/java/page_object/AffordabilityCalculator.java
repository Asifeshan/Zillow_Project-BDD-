package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AffordabilityCalculator extends NavigationBar{

    private static final By AnnualIncomeBar = By.id("annualIncome");
    private static final By MonthlyDebtBar = By.id("monthlyDebts");
    private static final By DownPaymentBar = By.id("downPayment");
    private static final By PaymentButton = By.id("payment-tab");
    private static final By FullReport = By.xpath("//a[contains(@target, '_blank')]");
    private static final By AfforfdAmountLocator = By.xpath("//div/div/main/div/div/div/div/h1[text()='You can afford ']");
    private static final By yourPayment = By.cssSelector("#payment-panel > div > div > div > svg > g > g:nth-child(5) > text:nth-child(2)");
    private static final By MonthlyBudgetLocator = By.xpath("//div/div/main/div/div/div/div/h2[1][text()='Monthly Budget']");
    private static final By AdvanceButton = By.xpath("//div[1]/div/div[1]/form/button[1][text()='Advanced']");
//    private static final By DebtToIncomeBar = By.id("dti");
//    private static final By InterestRateBAr = By.id("rate");
    private static final By LoanTermBar = By.id("term");
    private static final By IncludeTaxButton = By.id("form-1_includeTaxesInsurance");
    private static final By PropertyTaxBar = By.id("propertyTaxRate");
    private static final By HomeInsuranceBar = By.id("annualHomeownersInsurance");
    private static final By IncludePMIButton = By.id("form-1_includePMI");
    private static final By HOADuesBar = By.id("monthlyHOA");

    private static final Logger LOGGER = LogManager.getLogger(AffordabilityCalculator.class);

    public AffordabilityCalculator(WebDriver driver) {
        super(driver);
    }

    public AffordabilityCalculator typeAnnualIncome(String value) throws Exception{
        try {
            ActOn.wait(driver, AnnualIncomeBar).waitForElementToBeVisible();
            ActOn.element(driver, AnnualIncomeBar).setValue(value);
            LOGGER.debug("User Input value in Annual Income Bar");
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

    public AffordabilityCalculator AdvanceButtonClick()throws Exception {
        try {
            ActOn.wait(driver, AdvanceButton).waitForElementToBeVisible();
            ActOn.element(driver, AdvanceButton).click();
            LOGGER.debug("User Clicks On Advance Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
//    public AffordabilityCalculator typeDebtToIncome(String value) throws Exception{
//        try {
//
//            ActOn.wait(driver, DebtToIncomeBar).waitForElementToBeVisible();
//            ActOn.element(driver, DebtToIncomeBar).getElement().clear();
//            ActOn.element(driver, DebtToIncomeBar).setValue(value);
//            LOGGER.debug("User Input value in Debt To Income Bar");
//        }catch (Exception e)
//        {
//            System.out.println("Human verification Button Appears");
//        }
//        return this;
//    }
//
//    public AffordabilityCalculator typeInterestRAte(String value) throws Exception{
//        try {
//
//            ActOn.wait(driver, InterestRateBAr).waitForElementToBeVisible();
//            ActOn.element(driver, InterestRateBAr).getElement().clear();
//            ActOn.element(driver, InterestRateBAr).setValue(value);
//            LOGGER.debug("User Input value in InterestRAte Bar");
//        }catch (Exception e)
//        {
//            System.out.println("Human verification Button Appears");
//        }
//        return this;
//    }
    public AffordabilityCalculator typeLoanTerm(String value) throws Exception{
        try {

            ActOn.wait(driver, LoanTermBar).waitForElementToBeVisible();
            ActOn.element(driver, LoanTermBar).setValue(value);
            LOGGER.debug("User Input value in LoanTerm Bar");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AffordabilityCalculator ClicksOnIncludeTaxButton()throws Exception {
        try {
            ActOn.wait(driver, IncludeTaxButton).waitForElementToBeVisible();
            ActOn.element(driver, IncludeTaxButton).getElement().clear();
            ActOn.element(driver, IncludeTaxButton).click();
            LOGGER.debug("User Clicks On IncludeTax Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AffordabilityCalculator typePropertyTax(String value) throws Exception{
        try {

            ActOn.wait(driver, PropertyTaxBar).waitForElementToBeVisible();
            ActOn.element(driver, PropertyTaxBar).setValue(value);
            LOGGER.debug("User Input value in PropertyTax Bar");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AffordabilityCalculator typeHomeInsurance(String value) throws Exception{
        try {

            ActOn.wait(driver, HomeInsuranceBar).waitForElementToBeVisible();
            ActOn.element(driver, HomeInsuranceBar).setValue(value);
            LOGGER.debug("User Input value in HomeInsurance Bar");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AffordabilityCalculator ClicksOnIncludePMI()throws Exception {
        try {
            ActOn.wait(driver, IncludePMIButton).waitForElementToBeVisible();
            ActOn.element(driver, IncludePMIButton).getElement().clear();
            ActOn.element(driver, IncludePMIButton).getElement().click();
            LOGGER.debug("User Clicks On IncludePMI Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }

    public AffordabilityCalculator typeHOADues(String value) throws Exception{
        try {
            ActOn.wait(driver, HOADuesBar).waitForElementToBeVisible();
            ActOn.element(driver, HOADuesBar).setValue(value);
            LOGGER.debug("User Input value in HOADues Bar");
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
