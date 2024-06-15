package utils;

import pages.AddLanguagePage;
import pages.CreateLoginPage;
import pages.DashboardPage;
import pages.LoginPage;

public class PageInitializer {
    //We need to add DashboardPage
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static CreateLoginPage createLoginPage;
    public static AddLanguagePage addLanguagePage;

    public static void initializePageObjects(){
        loginPage= new LoginPage();
        dashboardPage = new DashboardPage();
        createLoginPage=new CreateLoginPage();
        addLanguagePage=new AddLanguagePage();

    }
}
