package com.pages;

import com.kk.BaseClass;
import com.kk.Settings;
import io.cucumber.java.en.Given;


public class BasePage {

    protected static BaseClass baseClass=new BaseClass();
    @Given("setup browser")
    public void setupBrowser() {
        baseClass.setUpWebBrowser();
    }
    public static Settings getSettings()
    {
        return baseClass.getSettings();
    }


}
