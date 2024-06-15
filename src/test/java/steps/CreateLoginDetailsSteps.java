package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;
import java.time.Duration;

public class CreateLoginDetailsSteps extends CommonMethods {

    @When("Admin enters valid username and password")
    public void admin_enters_valid_username_and_password() throws IOException {
        loginPage.enterUserName();
        loginPage.enterPassword();
    }

    @When("Admin clicks on login button")
    public void admin_clicks_on_login_button() {
        click(loginPage.loginButton);
    }

    @Then("Admin is successfully logged in")
    public void admin_is_successfully_logged_in() {
        Assert.assertTrue(dashboardPage.welcomeMsg.isDisplayed());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @When("Admin clicks on PIM option")
    public void admin_clicks_on_pim_option() {
        click(dashboardPage.pimModule);
    }

    @When("Admin clicks on Add Employee option")
    public void admin_clicks_on_add_employee_option() {
        click(dashboardPage.addEmployee);
    }

    @When("Admin enters {string} and {string} and {string} and {string} and {string} and {string}")
    public void admin_enters_and_and_and_and_and(String firstName, String middleName, String lastName, String userName, String password, String confirmPass) {
        sendText(firstName, createLoginPage.firstName);
        sendText(middleName, createLoginPage.middleName);
        sendText(lastName, createLoginPage.lastName);
        if (!createLoginPage.createLogin.isSelected()) {
            click(createLoginPage.createLogin);
        }
        sendText(userName, createLoginPage.username);
        sendText(password, createLoginPage.password);
        if (password.length() < 8) {
            Assert.assertEquals(createLoginPage.vwPassMsg.getText(), "Very Weak");
            Assert.assertTrue(createLoginPage.passMsg.isDisplayed());
        } else if (!password.matches("(?=.*[a-z]).*")) {
            // Assert.assertEquals(dashboardPage.passStrengthMsg.getText(),"Very Weak");
            Assert.assertTrue(createLoginPage.passMsg.isDisplayed());
        } else if (!password.matches("(?=.*[A-Z]).*")) {
            Assert.assertTrue(createLoginPage.passMsg.isDisplayed());
        } else if (!password.matches("(?=.*[0-9]).*")) {
            Assert.assertTrue(createLoginPage.passMsg.isDisplayed());
        } else if (!password.matches("(?=.*[!@#$%^&*]).*")) {
            Assert.assertTrue(createLoginPage.passMsg.isDisplayed());
        } else {
            Assert.assertEquals(createLoginPage.stPassMsg.getText(), "Strong");
            Assert.assertTrue(createLoginPage.passMsg.isDisplayed());
        }

        sendText(confirmPass, createLoginPage.confirmPass);
    }

    @When("Admin choose new employee status")
    public void admin_choose_new_employee_status() {
        selectFromDropDown(createLoginPage.statusChBox, "Enabled");

    }

    @When("Admin clicks on save button")
    public void admin_clicks_on_save_button() {
        click(createLoginPage.saveBtn);
        Assert.assertTrue(createLoginPage.personalDetails.isDisplayed());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }

    @Then("Admin is successfully creating login details for a new employee")
    public void admin_is_successfully_creating_login_details_for_a_new_employee() {
        click(dashboardPage.welcomeMsg);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(createLoginPage.logoutBtn);

    }

    @When("new employee enters valid username and password")
    public void new_employee_enters_valid_username_and_password() {
        sendText("JamSir123", loginPage.usernameTextField);
        sendText("Blueorchid007*", loginPage.passwordTextField);
    }
    @When("new employee clicks on login button")
    public void new_employee_clicks_on_login_button() {
        click(loginPage.loginButton);
    }
    @Then("new employee is successfully logged in")
    public void new_employee_is_successfully_logged_in() {
        Assert.assertEquals(dashboardPage.welcomeMsg.getText(),"Welcome James");

    }



}
