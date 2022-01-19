package step_definations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Help;

public class HelpSteps {

    private static final Logger LOGGER = LogManager.getLogger(HelpSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on Help button and navigated to Help Page$")
    public void userClicksOnHelpButton() throws Exception {
        new Help(driver)
                .ClicksOnHelpButton()
                .NavigatedToHelpPage();
        LOGGER.info("User clicks on Help button");

    }

    @Then("^click on submit a request button$")
    public void clickOnSubmitARequestButton() throws Exception {
        new Help(driver)
                .clickSubmitRequestButton(); // Captcha Appears after this step
        LOGGER.info("click on submit a request button");

    }

//    @Then("User able to navigate to Submit a request Page")
//    public void userAbleToNavigateToSubmitARequestPage() {
//        new Help(driver).NavigateToSubmitARequestPage();
//
//        LOGGER.info("User able to navigate to Submit a request Page");
//
//    }

    //****** Captcha problem with this step****

}
