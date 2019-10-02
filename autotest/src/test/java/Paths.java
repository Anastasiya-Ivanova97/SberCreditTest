public class Paths {
  private String mainMenu = "//span[text()='Страхование']";
  private String travelInsurance = "//a[text()='Страхование путешественников']";
  private String page = "//h1[text()='Страхование путешественников']";
  private String pageTitle = "Страхование путешественников";
  private String banner = "//*[@id=\"SBRF_TabContainer_sb_bundle-47610460\"]/descendant::img";
  private String policy = "//div[text()='Минимальная']";
  private String button = "//span[text()='Оформить']";
  private String surnamePath1 = "insured0_surname";
  private String namePath1 = "insured0_name";
  private String datePath1 = "insured0_birthDate";
  private String surnamePath2 = "surname";
  private String namePath2 = "name";
  private String middleNamePath = "middlename";
  private String datePath2 = "birthDate";
  private String passportSeriesPath = "passport_series";
  private String passportNumberPath = "passport_number";
  private String givingDatePath = "issueDate";
  private String locationPath = "issuePlace";
  private String apply = "//span[text()='Продолжить']";
  private String error = "//div[text()='Заполнены не все обязательные поля']";

    public String getMainMenu() {
        return mainMenu;
    }

    public String getTravelInsurance() {
        return travelInsurance;
    }

    public String getPage() {
        return page;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public String getBanner() {
        return banner;
    }

    public String getPolicy() {
        return policy;
    }

    public String getButton() {
        return button;
    }

    public String getSurnamePath1() {
        return surnamePath1;
    }

    public String getNamePath1() {
        return namePath1;
    }

    public String getDatePath1() {
        return datePath1;
    }

    public String getSurnamePath2() {
        return surnamePath2;
    }

    public String getNamePath2() {
        return namePath2;
    }

    public String getMiddleNamePath() {
        return middleNamePath;
    }

    public String getDatePath2() {
        return datePath2;
    }

    public String getPassportSeriesPath() {
        return passportSeriesPath;
    }

    public String getPassportNumberPath() {
        return passportNumberPath;
    }

    public String getGivingDatePath() {
        return givingDatePath;
    }

    public String getLocationPath() {
        return locationPath;
    }

    public String getApply() {
        return apply;
    }


    public String getError() {
        return error;
    }
}
