package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;

public class LoginSteps extends CommonMethods {
    @When("user enters valid login details \\(username and password)")
    public void user_enters_valid_login_details_username_and_password() throws IOException {
        loginPage.usernameTextField.sendKeys(ConfigReader.read("userName"));
        loginPage.passwordTextField.sendKeys(ConfigReader.read("password"));
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        jsClick(loginPage.loginButton);
    }
    @Then("user succesfuly logs in")
    public void user_succesfuly_logs_in() {
        Assert.assertTrue(dashboardPage.welcomeMsg.isDisplayed());

    }
}
