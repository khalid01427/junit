package com.kk;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class BaseClass {
    protected Settings settings=new Settings();
    Properties prop=new Properties();
    public BaseClass()
    {

        try {
            List<String> files= IOUtils.readLines(BaseClass.class.getClassLoader().getResourceAsStream("configs/"));
            files.forEach(p ->
                    {
                        try {
                            prop.load(BaseClass.class.getClassLoader().getResourceAsStream("configs/" + p));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void setUpWebBrowser()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\"+prop.getProperty("chrome.driver.home"));
        this.settings.setDriver(new ChromeDriver());
    }
    public Settings getSettings()
    {
        return this.settings;
    }
    public void setSettings(Settings s)
    {
       this.settings=s;
    }

}
