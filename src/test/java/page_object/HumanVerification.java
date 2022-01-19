package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HumanVerification extends NavigationBar{
    private static final By PressAndHoldButton = By.xpath("/html/body");

    public HumanVerification(WebDriver driver) {
        super(driver);
    }

    public HumanVerification ClickPressAndHold() {
        WebElement PressAndHoldButton = driver.findElement(By.xpath("/html/body"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(PressAndHoldButton).perform();
        return this;
    }
}
