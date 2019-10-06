import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageSettings {
    WebDriver driver;
    WebDriverWait wait;

    public PageSettings(){
        this.driver = Initialization.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
    }
}
