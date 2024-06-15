package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;

public class LoginPage extends CommonMethods {
    //need to extend by CommonMethods (sendText method) which is extended by PageInitializer
    @FindBy(id="txtUsername")
    public WebElement usernameTextField;

    @FindBy(id="txtPassword")
    public WebElement passwordTextField;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

    public void enterUserName () throws IOException {
        sendText(ConfigReader.read("userName"), loginPage.usernameTextField);
    }
    public void enterPassword() throws IOException {
        sendText(ConfigReader.read("password"),loginPage.passwordTextField);
    }
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}
