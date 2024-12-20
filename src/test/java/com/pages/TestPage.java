package com.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TestPage {
    @When("this is first scenario")
    public void thisIsFirstScenario() {
        System.out.println("this is first scenario");

    }

    @When("this is second scenario")
    public void thisIsSecondScenario() {
        System.out.println("this is second scenario");
    }

    @When("this is third scenario")
    public void thisIsThirdScenario() {
        System.out.println("this is third scenario");
    }

    @And("wait for {string} second")
    public void waitForSecond(String arg0) throws InterruptedException {
        int ss=Integer.parseInt(arg0)*1000;
        Thread.sleep(ss);
    }
}
