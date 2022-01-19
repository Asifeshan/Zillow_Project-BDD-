package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    //Do not allow to initialize this class outside or create object outside this class

    private DriverFactory() {
        //do nothing -- Empty constructor
    }

    private static final DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {

        return instance;
    }

    // Thread local driver object for webDriver
    ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> {     // lambda expression. we can use threadLocale
        String environment = System.getProperty("environment") == null ? "local" : System.getProperty("environment");
        String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        URL gridUrl = null;

        try {
            gridUrl = new URL(ReadConfigFiles.getPropertyValues("GridURL"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (environment.equals("remote") && browser.equals("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            return new RemoteWebDriver(gridUrl, chromeOptions);
        } else if (environment.equals("remote") && browser.equals("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            return new RemoteWebDriver(gridUrl, firefoxOptions);
        } else if (environment.equals("remote") && browser.equals("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            return new RemoteWebDriver(gridUrl, edgeOptions);
        } else {
//            WebDriverManager.chromedriver().setup();                        // while we try to crate a thread object
//            return new ChromeDriver();                                       // can be replaced by other browser drivers
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
// i want to assign chrome driver instance information assigned to this driver so i used lambda expression
// when this method will be executed the chrome driver value will be assigned to this driver.
        }
    });

    // call this method to get the driver object and launch the browser
    public WebDriver getDriver() {
//        ThreadLocal<WebDriver> driver = this.driver;
        return driver.get();
    }
        // quits the driver and closes the browser
        public void removeDriver() {

            driver.get().quit();
            driver.remove();
        }
    }


