package com.setya.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
    }

    @And("user input invalid username with {string}")
    public void userInputInvalidUsernameWith(String username) {
    }

    @And("user input invalid password with {string}")
    public void userInputInvalidPasswordWith(String password) {
    }

    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
    }
}
