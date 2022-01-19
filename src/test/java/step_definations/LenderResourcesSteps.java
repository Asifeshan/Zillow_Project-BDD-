package step_definations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.LanderResource;

public class LenderResourcesSteps {

    private static final Logger LOGGER = LogManager.getLogger(LenderResourcesSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User MouseHover LenderResourcesCenter and clicks on See All Button$")
    public void userClicksOnLenderResourcesCenter() throws Exception {
        new LanderResource(driver)
                .MouseHoverLenderResourcesCenter()
                .ClickLenderResourcesCenter()
                .clickSeeAllButton();
        LOGGER.info("Clicks on SeeAll Button");
    }


    @Then("^User can see Resources$")
    public void userCanSeeResources() throws Exception {
        new LanderResource(driver).DisplayResources();

        LOGGER.info("User can see Resources");
    }
}
