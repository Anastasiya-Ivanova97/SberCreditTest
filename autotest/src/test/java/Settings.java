import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
    public static WebDriver driver;

    @Before
    public void setDriver () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\autotest\\src\\test\\java\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void shutDown() {
       // driver.quit();
    }
}
