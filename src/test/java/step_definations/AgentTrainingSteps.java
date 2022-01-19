package step_definations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.AgentTraining;


public class AgentTrainingSteps {

    private static final Logger LOGGER = LogManager.getLogger(AgentTrainingSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^user mouse hover to agent finder and clicks on courses$")
    public void userMouseHoverToAgentFinder() throws Exception {
        new AgentTraining(driver)
                .MouseHoverToAgentFinder()
                .ClicksOnAgentResourceCenter()
                .NavigatedToAgentResourcesPage()
                .MouseHoverToTrainingTab()
                .ClicksOnCourses();
        LOGGER.info("Clicks on Courses");

    }

    @Then("^user can see Training$")
    public void userCanSeeTraining() throws Exception {
        new AgentTraining(driver)
                .CanSeeTraining();
        LOGGER.info("user can see Training");

    }

}
