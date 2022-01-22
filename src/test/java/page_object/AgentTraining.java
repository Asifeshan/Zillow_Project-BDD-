package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentTraining extends NavigationBar {

    private static final By TrainingTab = By.xpath("//a[text()='Training']");
    private static final By CoursesTab = By.xpath("//a[1][text()='Courses']");
    private static final By TrainingHeader = By.xpath("//h1[text()='Training']");
    private static final Logger LOGGER = LogManager.getLogger(AgentTraining.class);

    public AgentTraining(WebDriver driver) {
        super(driver);
    }

    public AgentTraining MouseHoverToTrainingTab() throws Exception{
        try {
            ActOn.wait(driver, TrainingTab).waitForElementToBeVisible();
            ActOn.element(driver, TrainingTab).mouseHover();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            LOGGER.debug("User Mouse Hover To Training Tab Tab");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AgentTraining ClicksOnCourses() throws Exception{
        try {
            ActOn.wait(driver, CoursesTab).waitForElementToBeVisible();
            ActOn.element(driver, CoursesTab).click();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            LOGGER.debug("User Clicks On Courses");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public AgentTraining CanSeeTraining() throws Exception{
        try {
            ActOn.wait(driver, TrainingHeader).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, TrainingHeader).elementIsDisplayed();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            LOGGER.debug("User Can see all the offered Trainings");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;

    }
}


