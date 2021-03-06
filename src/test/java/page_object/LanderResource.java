package page_object;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LanderResource extends NavigationBar {

    private static final By SeeAllButton = By.xpath("//a[contains(@class, 'post-list-carousel__link d-none d-sm-inline')]");
    private static final By ResourcesHeader = By.xpath("//h1[contains(@class, 'goldberg-hero_title')]");
    private static final Logger LOGGER = LogManager.getLogger(LanderResource.class);

    public LanderResource(WebDriver driver) {
        super(driver);
    }

    public LanderResource clickSeeAllButton() throws Exception{
        try {
            ActOn.wait(driver, SeeAllButton).waitForElementToBeVisible();
            ActOn.element(driver, SeeAllButton).click();
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            LOGGER.debug("User Clicked on SeeAllButton Button");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }
    public LanderResource DisplayResources() throws Exception{
        try {
            ActOn.wait(driver, ResourcesHeader).waitForElementToBeVisible();
            AssertThat.elementAssertions(driver, ResourcesHeader).elementIsDisplayed();
            //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            LOGGER.debug("User Can see the resources");
        }catch (Exception e)
        {
            System.out.println("Human verification Button Appears");
        }
        return this;
    }

}
