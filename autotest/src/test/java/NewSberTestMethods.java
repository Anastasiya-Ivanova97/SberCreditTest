import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NewSberTestMethods extends Settings{
    private Paths paths = new Paths();
    private Form form = new Form();


    public void start(String url) {
        driver.get(url);
    }
    public WebElement findMainMenu() {
        WebElement mainMenu = driver.findElement(By.xpath(paths.getMainMenu()));

        Actions action = new Actions(driver);
        action.moveToElement(mainMenu).perform();

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        return mainMenu;
    }
    public void chooseInsurance() {
        WebElement travelInsurance = findMainMenu().findElement(By.xpath(paths.getTravelInsurance()));
        travelInsurance.click();
    }
    public void checkPageTitle() {
        WebElement page = driver.findElement(By.xpath(paths.getPage()));
        System.out.println(page.isDisplayed() ? "Заголовок отображается" : "Заголовок не отобразился");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void buyInsurance() {
        WebElement button = driver.findElement(By.xpath(paths.getBanner()));
        Actions actions = new Actions(driver);

        actions.moveToElement(button).click().perform();
        driver.navigate().forward();
        driver.switchTo().activeElement();

    }
    public void choosePolicyAndApply() {
        WebElement policy = driver.findElement(By.xpath(paths.getPolicy()));
        policy.click();
        WebElement button = driver.findElement(By.className(paths.getButton()));
        button.click();
    }
    public void fillForm() {

        WebElement surname1 = driver.findElement(By.name(paths.getSurnamePath1()));
        surname1.sendKeys(form.getSurname());
        WebElement name1 = driver.findElement(By.name(paths.getNamePath1()));
        name1.sendKeys(form.getName());
        WebElement date1 = driver.findElement(By.name(paths.getDatePath1()));
        date1.sendKeys(form.getDate());
        WebElement surname2 = driver.findElement(By.name(paths.getSurnamePath2()));
        surname2.sendKeys(form.getSurname());
        WebElement name2 = driver.findElement(By.name(paths.getNamePath2()));
        name2.sendKeys(form.getName());
        WebElement middleNameForm = driver.findElement(By.name(paths.getMiddleNamePath()));
        middleNameForm.sendKeys(form.getMiddleName());
        WebElement date2 = driver.findElement(By.name(paths.getDatePath2()));
        date2.sendKeys(form.getDate());
        WebElement passportSeriesField = driver.findElement(By.name(paths.getPassportSeriesPath()));
        passportSeriesField.sendKeys(form.getPassportSeries());
        WebElement passportNumberField = driver.findElement(By.name(paths.getPassportNumberPath()));
        passportNumberField.sendKeys(form.getPassportNumber());
        WebElement givingDateField = driver.findElement(By.name(paths.getGivingDatePath()));
        givingDateField.sendKeys(form.getGivingDate());
        WebElement locationField = driver.findElement(By.name(paths.getLocationPath()));
        locationField.sendKeys(form.getLocation());

    }
    public void applyAndCheckErrors() {
        WebElement button = driver.findElement(By.xpath(paths.getApply()));
        button.click();

        System.out.println(driver.findElement(By.xpath(paths.getError())).isDisplayed() ? "Ошибка отображена" : "Ошибка не отображена");
    }
}
