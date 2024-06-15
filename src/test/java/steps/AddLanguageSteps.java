package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.time.Duration;
import java.util.List;

public class AddLanguageSteps extends CommonMethods {

    @When("Admin clicks on Admin button")
    public void admin_clicks_on_admin_button() {
        click(dashboardPage.adminModule);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @When("Admin navigated to qualifications")
    public void admin_navigated_to_qualifications() {
        click(dashboardPage.qualificationsModule);
    }
    @When("Admin clicks on Languages")
    public void admin_clicks_on_languages() {
        click(dashboardPage.viewLanguages);
    }
    @When("Admin add any language")
    public void admin_add_any_language() {
        click(addLanguagePage.addBtn);
        sendText("Bahasa", addLanguagePage.addLang);
    }
    @When("Admin clicks save button")
    public void admin_clicks_save_button() {
        click(addLanguagePage.saveBtn);
    }
    @Then("Admin user successfully add languages")
    public void admin_user_successfully_add_languages(){
        List<WebElement> langs=driver.findElements(By.xpath("//table[@id='recordsListTable']/tbody/tr/td/a"));
        for(WebElement lang:langs){
            if(lang.getText().equals("Bahasa")){
                Assert.assertTrue(lang.isDisplayed());
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            }
        }

    }

}
