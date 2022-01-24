package step_definations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import page_object.AgentFinder;

public class AgentFinderSteps {

   private static final Logger LOGGER = LogManager.getLogger(AgentFinderSteps.class);
    WebDriver driver = Hooks.driver;

    @When("user enters at agent finder and input Location {string} type Agent name {string} and clicks on search Button")
    public void userEntersAtAgentFinderAndInputLocationAndClicksOnSearchButton(String string, String string2) throws Exception {
        new AgentFinder(driver)
                .ClicksOnAgentFinderButton()
                .NavigatedToAgentFinderPage()
                .EntersLocation(string)
                .EntersAgentName(string2)
                .SearchButtonClick();  // After Clicking this, website is not loading to the page
        LOGGER.info("User entered Location");
    }

  @Then("^User able to see the Featured Agents$")
  public void userAbleToSeeTheFeaturedAgents() throws Exception {
        new AgentFinder(driver)
                .validateTheFeaturedAgents();
        LOGGER.info("User can See the Featured Agents");
    }
}


