package step_definations;

import utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private static final Logger LOGGER = LogManager.getLogger(Hooks.class);
    public static WebDriver driver;

    @Before
    public void browserInitialization() {
        driver = DriverFactory.getInstance().getDriver();
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LOGGER.info("Launch Browser");
    }

//    @After
//
//    public void closeBrowser() {
//        DriverFactory.getInstance().removeDriver();
//     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        LOGGER.info("Closed the browser");
//    }
}
