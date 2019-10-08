import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StartPage extends PageSettings {

    @FindBy(xpath = "//form[@class='main-search-form']/descendant::input")
    WebElement searchString;

    @FindBy(xpath = "//span[@class='ui-input-search__icon ui-input-search__icon_search']")
    private
    WebElement searchButton;

    public StartPage(){
        super();
        this.driver = Initialization.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
    }

    public WebElement waitForElement(WebElement element){
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void search(String searchItem) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", searchString);
        executor.executeScript("arguments[0].value = '" + searchItem + "'", searchString);
        executor.executeScript("arguments[0].click();", searchButton);
    }


}
