
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class BasketPage extends PageSettings{
    Integer temp;
    public BasketPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='radio radio_checked']/child::label")
    private
    WebElement check;

    @FindBy(xpath = "//a[contains(@href,'playstation-4-slim-black')]/parent::div/parent::div/descendant::span[1]")
    private
    WebElement item1;

    @FindBy(xpath = "//a[contains(@href,'igra--detroit')]/parent::div/parent::div/descendant::span[1]")
    private
    WebElement item2;

    @FindBy(xpath = "//a[contains(@href,'igra--detroit')]/parent::div/parent::div/descendant::button[@class='remove-button']")
    private
    WebElement removeItem;

    @FindBy(xpath = "//a[contains(@href,'igra--detroit')]")
    private
    WebElement removedItem;

    @FindBy(xpath = "//div[@class='total-amount__info-block']/descendant::span")
    WebElement sum;

    @FindBy(xpath = "//i[@class='count-buttons__icon-plus']")
    private
    WebElement plus;

    @FindBy(xpath = "//span[@class='pseudo-link']")
    private
    WebElement itemBack;

    public void checkGuarantee() {
        Assert.assertTrue(check.isEnabled());
    }

    public void checkSum(ItemPage itemPage) {
        Assert.assertTrue(itemPage.getBefore().intValue()==itemPage.toNumber(item1).intValue());
        Assert.assertTrue(itemPage.getNewItem().intValue()==itemPage.toNumber(item2).intValue());
        Assert.assertTrue(itemPage.getNewItem().intValue()+itemPage.getBefore().intValue()+itemPage.getUpdated().intValue()==itemPage.toNumber(sum).intValue());

    }
    public void removeItem() {
        removeItem.click();
    }
     public void checkAfterRemove(ItemPage itemPage){
        int sum1 = itemPage.getBefore()+itemPage.getUpdated();
        int sum2 = itemPage.toNumber(sum);

        Assert.assertTrue(sum1==sum2);
     }

     public void addItems(Integer count) {
         for (int i = 0; i == count; i++) {
             plus.click();
         }
     }
     public void checkNew(ItemPage itemPage) {
        temp = ((itemPage.getBefore()*3)+(itemPage.getUpdated()*3));

        Assert.assertTrue(temp.intValue()==itemPage.toNumber(sum).intValue());
     }

     public void takeBack(ItemPage itemPage) {
        itemBack.click();
        Assert.assertTrue(removedItem.isDisplayed());
        Assert.assertTrue(temp+itemPage.getNewItem().intValue()==itemPage.toNumber(sum).intValue());
     }

}
