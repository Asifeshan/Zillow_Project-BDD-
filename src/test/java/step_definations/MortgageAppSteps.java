package step_definations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.MortgageApp;

public class MortgageAppSteps {

    private static final Logger LOGGER = LogManager.getLogger(MortgageAppSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user Clicks on Mortgages App to enter MobileNumber \"(.+?)\" and clicks on TextMe free App$")
    public void InputMobileNumber(String MobileNumber) throws Exception {
        new MortgageApp(driver)
                .MouseHoverToMortgageApp()
                .clicksMortgagesApp()
                .NavigateToMortgagesAppPage()
                .clicksMobileNumber()
                .TypeMobileNumber(MobileNumber)
                .clicksTextApp();
        LOGGER.info("User entered phone Number and Clicks On Text me free app");
    }
    @Then("^user is able to see the success message and get Notified in phone Message$")

    public void userCanSeeTheSuccessMessage () throws Exception {
        new MortgageApp(driver)
                .DisplaySuccessMessage();
        LOGGER.info("user is able to see the success message and get Notification in phone Message");
    }

}
