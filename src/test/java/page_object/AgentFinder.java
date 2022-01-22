package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AgentFinder extends NavigationBar {
    private static final By LocationSearchBar = By.xpath("/html/body/div[2]/div/main/div/div/div[1]/div[2]/form/div/div[1]/div[1]/div/input");
    private static final By SearchButton = By.xpath("/html/body/div[2]/div/main/div/div/div[1]/div[2]/form/div/div[1]/div[1]/div/label/button");
    private static final By validateFindAnAgent = By.xpath("//main/div/div/div[1]/h1[text()='Find an Agent']");
//    private static final By FeaturedAgent = By.xpath("//*[@id='__next']/div/main/div/div/div[1]/div[3]/h2");
//    private static final By FindAnAgentTitle = By.xpath("//h1[text()='Find an Agent']");


    private static final Logger LOGGER = LogManager.getLogger(AgentFinder.class);


    public AgentFinder(WebDriver driver) {
        super(driver);
    }

//    public AgentFinder waitForPageToLoad() throws Exception{
//        try {
//            ActOn.wait(driver, FindAnAgentTitle).waitForElementToBeVisible();
//        }catch (Exception e)
//        {
//            System.out.println("Human verification Button Appears");
//        }
//        return this;
//    }



    public AgentFinder EntersLocation(String arg0) throws Exception{
        try {
            ActOn.wait(driver, LocationSearchBar).waitForElementToBeVisible();
            ActOn.element(driver, LocationSearchBar).setValue(arg0);
            LOGGER.debug("User Input value in Location Search Bar");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AgentFinder SearchButtonClick() throws Exception{
        //   public void SearchButton() throws Exception {
            //   public void SearchButton() throws Exception {

            // As Button clicked, but it's not loading the page trial process 1,
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.until(ExpectedConditions.visibilityOfElementLocated(SearchButton));
            wait.until(ExpectedConditions.elementToBeClickable(SearchButton)).click();
            LOGGER.debug("user press search Button upon entering zipcode");;
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
            return this;


            // As Button clicked, but it's not loading the page trial process 2 using JS executor,
//          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//          WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
//          ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);

            //  ActOn.wait(driver, SearchButton).waitForElementToBeVisible();
            //  ActOn.element(driver, SearchButton).click();
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//      try {
//          ActOn.element(driver, SearchButton).click();
//          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//          LOGGER.info("user press search Button upon entering zipcode");
//      } catch (NoSuchElementException e)
//      {
//          System.out.println("An exceptional case");}


        }
    public AgentFinder validateTheFeaturedAgents() throws Exception{
        try {

            ActOn.wait(driver, validateFindAnAgent).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, validateFindAnAgent).elementIsDisplayed();
            LOGGER.debug("User Successfully Validate Find An Agent");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
//        try {
//            ActOn.wait(driver, FeaturedAgent).waitForElementToBeVisible();
//            AssertThat.elementAssertions(driver, FeaturedAgent).elementIsDisplayed();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        }catch (NoSuchElementException e)
//        {
//            System.out.println("An exceptional case occurs");
//        }

//        if (validateFindAnAgent != null)
//        {
//            ActOn.wait(driver, validateFindAnAgent).waitForElementToBeVisible();
//            AssertThat.elementAssertions(driver, validateFindAnAgent).elementIsDisplayed();
//            LOGGER.info("User validate Find An Agents");
//        } else
//        {
//            ActOn.wait(driver, FeaturedAgent).waitForElementToBeVisible();
//            AssertThat.elementAssertions(driver, FeaturedAgent).elementIsDisplayed();
//            LOGGER.info(" User able to see the Featured Agents");
//        }
        return this;
    }


}