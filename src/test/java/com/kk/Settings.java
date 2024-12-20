package com.kk;

import org.openqa.selenium.WebDriver;

public class Settings {
private WebDriver driver;
public void setDriver(WebDriver d)
{
    this.driver=d;
}

    public WebDriver getDriver() {
        return this.driver;
    }
}

