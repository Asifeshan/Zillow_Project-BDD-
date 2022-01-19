package step_definations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.ManageRental;

public class ManageRentalSteps {
    private static final Logger LOGGER = LogManager.getLogger(ManageRentalSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on Manage Rental button and Clicks first listing free Button$")
    public void userClicksOnManageRentalButton() throws Exception {
        new ManageRental(driver)
                .ClicksOnManageRentalButton()
                .NavigatedToManageRentalPage()
                .clicksListingButton();
        LOGGER.info("Click on post your first listing free Button");

    }

    @Then("^User navigated to signIn$")
    public void userAbleToSeeSignInPage() throws Exception {
        new ManageRental(driver).SeeSignInPage();
        LOGGER.info("User navigated to signIn page");

    }
}
