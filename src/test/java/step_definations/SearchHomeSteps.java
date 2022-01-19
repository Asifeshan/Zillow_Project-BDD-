package step_definations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.SearchHome;

public class SearchHomeSteps {

    private static final Logger LOGGER = LogManager.getLogger(SearchHomeSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^user entering Address \"(.+?)\" and clicks Home Value to see Home details$")
    public void InputAddress(String Address) throws Exception {
        new SearchHome(driver)
                .ClickOnHomeForSaleByMouseHoverToBuy()
                .ClicksOnHomeForSale()
                .userInPut(Address)
                .ClicksOnSearchButton()
                .IsNavigatedToSpecificHomeAddress();
        LOGGER.info("user is Navigated to specific Home Address");

    }

    @Then("^user can validate home Value also Facts and feature with NeighbourHood details$")
    public void userCanSeeTheFactsAndFeature() throws Exception {
        new SearchHome(driver)
                .ClicksOnHomeValue()
                .CanSeeTheHomeValueZestimate()
                .ClicksOnHomeDetails()
                .CanSeeTheFactsAndFeature()
                .ClicksOnNeighborHoodDetails()
                .CanSeeTheNeighborHoodHoodDetails();
        LOGGER.info("user can successfully validate Home Value, Features And Neighbourhood Details");

    }
}
