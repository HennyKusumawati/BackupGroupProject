package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CreateLoginPage extends CommonMethods {
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "middleName")
    public WebElement middleName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "chkLogin")
    public WebElement createLogin;

    @FindBy(id = "user_name")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(xpath = "//span[text()='Very Weak']")
    public WebElement vwPassMsg;

    @FindBy(xpath = "//span[text()='Strong']")
    public WebElement stPassMsg;

    @FindBy(xpath = "//span[starts-with(text(),'For')]")
    public WebElement passMsg;

    @FindBy(id = "re_password")
    public WebElement confirmPass;

    @FindBy(id = "status")
    public WebElement statusChBox;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;

    @FindBy(xpath = "//h1[text()='Personal Details']")
    public WebElement personalDetails;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutBtn;

    public CreateLoginPage() {
        PageFactory.initElements(driver, this);
    }

}
