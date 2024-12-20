package com.pages;

import com.kk.BaseClass;
import io.cucumber.java.en.And;

public class LoginPage {
    BaseClass baseClass=new BaseClass();
    public LoginPage()
    {
baseClass.setSettings(BasePage.getSettings());
    }

    @And("maximize browser {string}")
    public void maximizeBrowser(String URL) {
        baseClass.getSettings().getDriver().manage().window().maximize();
//        baseClass.getSettings().getDriver().get("http://www.amazon.in");
        baseClass.getSettings().getDriver().get(URL);
    }


}
