import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Initialization {
    private static WebDriver driver;
    public static TestProperties testProperties = TestProperties.getInstance();

    public static void initialize() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", testProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testProperties.getProperty("url"));
       // driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(testProperties.getProperty("timeout.pageLoad")), TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
