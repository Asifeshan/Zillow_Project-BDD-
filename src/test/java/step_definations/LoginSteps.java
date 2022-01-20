package step_definations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Home;
import page_object.LoginPage;
import java.util.List;
import java.util.Map;

public class LoginSteps {

    private static final Logger LOGGER = LogManager.getLogger(LoginSteps.class);
    WebDriver driver = Hooks.driver;
//    WebElement robot = driver.findElement(By.id("uuid"));
//    Actions actions = new Actions(driver);
      //      actions.clickAndHold(robot).perform();


    //precondition
    @Given("^a user is on Home page$")
    public void navigateToLogInHome() throws Exception {
        //  new Buy(driver).waitForPageToLoad();
//        actions.clickAndHold(robot).perform();
        new Home(driver).navigateToUrlHomepage();
//        actions.clickAndHold(robot).perform();
        LOGGER.info("User is on homepage");

    }
    @And("User Clicks on SignIn Link")
    public void userClicksOnSignInLink() throws Exception {
        new LoginPage(driver).ClickSignIn();
        LOGGER.info("User Clicks on SignIn Link");
    }

    @When("^After Clicking SignIN User enters email \"(.+?)\" and password \"(.+?)\" and Clicks On LogIn Button$")
    public void userEntersEmailAndPassword(String email, String password) throws Exception {
        new LoginPage(driver)
                .UserEntersEmail()
                .UserEntersPassword()
                .ClickLoginButton();
        LOGGER.info("User Clicks on Login Button");

    }

    @Then("^user is navigated to homepage$")
    public void userIsNavigatedToHomepage() throws Exception {
        new Home(driver).NavigateToHomePage();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LOGGER.info("********User is in homepage********");

    }

    @When("^After Clicking SignIN user click on login button upon entering credentials$")
    public void userClickOnLoginButtonUponEnteringCredentials(DataTable table) throws Exception {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (Map<String, String> cells : data) {
            new LoginPage(driver)
                    .TypeEmail(cells.get("email"))
                    .TypePassword(cells.get("password"))
                    .ClickLoginButton();
            LOGGER.info("Data table : User click on login button Data table");
        }

    }

    @When("^user click on signIn upon entering validEmail \"(.+?)\" and invalidPassword \"(.+?)\"$")
    public void clicksOnSignInButton(String validEmail, String invalidPassword) throws Exception {
        new LoginPage(driver)
                .typeValidEmail()
                .typeInValidPassword()
                .ClickLoginButton();
        LOGGER.info("user click on SignIn Button With Invalid Credential" );

    }

    @Then("^user is failed to login$")
    public void userIsFailedToLogin() throws Exception {
        new LoginPage(driver)
                .userStillOnSignInPage();
        LOGGER.info("User failed to logIn");

    }

}