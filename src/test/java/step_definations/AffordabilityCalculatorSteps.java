package step_definations;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.AffordabilityCalculator;
import java.util.List;
import java.util.Map;

public class AffordabilityCalculatorSteps {

    private static final Logger LOGGER = LogManager.getLogger(AffordabilityCalculatorSteps.class);
    WebDriver driver = Hooks.driver;


    //

    @When("^user click on payment button upon entering the data$")
    public void userClickOnPaymentButtonUponEnteringTheData(DataTable dataTable) throws Exception {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> cells : data) {
            new AffordabilityCalculator(driver)
                    .MouseHoverToAffordabilityCalculatorButton()
                    .AffordabilityCalculatorButtonClick()
                    .NavigateToAffordabilityCalculatorPage()
                    .typeAnnualIncome(cells.get("AnnualIncome"))
                    .typeMonthlyDebt(cells.get("MonthlyDebts"))
                    .typeDownPayment(cells.get("DownPayment"))
                    .AdvanceButtonClick()
//                    .typeDebtToIncome(cells.get("DebtToIncome"))
//                    .typeInterestRAte(cells.get("InetrestRate"))
                    .typeLoanTerm(cells.get("LoanTerms"))
                    .ClicksOnIncludeTaxButton()
                    .typePropertyTax(cells.get("PropertyTax"))
                    .typeHomeInsurance(cells.get("HomeInsurance"))
                    .ClicksOnIncludePMI()
                    .typeHOADues(cells.get("HOADues"))
                    .paymentButtonClick();
            LOGGER.info("user has entered credentials from data table and Clicks on payment Button ");

        }
    }

    @Then("^user can validate the payment is \"(.+?)\" and full report$")
    public void PaymentAmountAndSeeFullReport(String payment) throws Exception {
        new AffordabilityCalculator(driver)
                .validatePaymentAmount(payment)
                .SeeFullReport();
        LOGGER.info("User Able to see payment Amount is $2,475 Full Report");

    }
    @And("^user Clicks On Full Report$")
    public void UserClicksFullreport() throws Exception {
        new AffordabilityCalculator(driver)
                .ClicksFullreport()
                .SeeMonthlyBudget();
        LOGGER.info("User clicks on Full report to see monthly Budget");

    }

    @Then("^User can validate How much \"(.+?)\"$")
    public void validateAffordAmount(String expectedValue) throws Exception {
        new AffordabilityCalculator(driver)
                .validatingAffordableAmount(expectedValue);
        LOGGER.info("User Successfully validate Affordability amount $446,961");
    }
}




