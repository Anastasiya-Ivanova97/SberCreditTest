import org.junit.Test;

public class NewSberTest extends Settings {
    @Test
    public void newSberTest() throws InterruptedException {
       NewSberTestMethods currentVersion = new NewSberTestMethods();

       currentVersion.start("https://www.sberbank.ru/ru/person");
       currentVersion.findMainMenu();
       currentVersion.chooseInsurance();
       currentVersion.checkPageTitle();
       currentVersion.buyInsurance();
       currentVersion.choosePolicyAndApply();
       currentVersion.fillForm();
       currentVersion.applyAndCheckErrors();

    }
}
