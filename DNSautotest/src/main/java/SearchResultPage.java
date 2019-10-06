import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageSettings {
    public SearchResultPage() {
        super();
    }
    @FindBy(xpath = "//a[contains(@href,'playstation-4-slim-black')]")
    private
    WebElement searchItem;

    public void gotoItemPage(String keywords) {
        searchItem.click();
    }
}
