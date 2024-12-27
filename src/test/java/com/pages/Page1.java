package com.pages;

import io.cucumber.java.en.When;

public class Page1 {
    @When("Hello")
    public void abc()
    {
        System.out.println("This is test page");
        System.out.println("This is line 3 ");
    }
}
