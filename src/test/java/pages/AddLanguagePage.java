package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddLanguagePage extends CommonMethods {
    @FindBy(id = "btnAdd")
    public WebElement addBtn;

    @FindBy(id = "language_name")
    public WebElement addLang;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;

    @FindBy(xpath = "//table[@id='recordsListTable']/tbody/tr/td/a")
    public WebElement allLanguages;

    public AddLanguagePage() {
        PageFactory.initElements(driver,this);
    }
}
