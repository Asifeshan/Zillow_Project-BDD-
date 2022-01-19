package step_definations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Buy;
import page_object.Home;


public class BuySteps {

    private static final Logger LOGGER = LogManager.getLogger(BuySteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User clicks on Buy option and sort Price high to low and clicks$")
    public void userClicksOnBuyOption() throws Exception {
        new Home(driver)
                .BuyOption()
                .NavigatedToBuyPage()
                .SortByButton()
                .MouseHoverToHighToLow()
                .PriceHighToLow();

        LOGGER.info("user clicks on price High to Low");

    }

    @Then("^User able to see the Luxury Homes$")
    public void userAbleToSeeTheLuxuryHomes() throws Exception {
        new Buy(driver).LuxuryHomes();
        LOGGER.info("User able to see the Luxury Homes");

    }
}
