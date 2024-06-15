package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    //ALL LOCATORS WILL BE DIVIDED INTO "MODULES" ALONG WITH DASHES (-----) FOR EACH SECTION OF MODULE

    // ADMIN MODULES

    @FindBy(id="menu_admin_viewAdminModule")
    public WebElement adminModule;

    @FindBy(id="menu_admin_UserManagement")
    public WebElement userManagementModule;

    @FindBy(id="menu_admin_viewSystemUsers")
    public WebElement viewSystemUsers;

    @FindBy(id="menu_admin_Job")
    public WebElement jobModule;

    @FindBy(id="menu_admin_viewJobTitleList")
    public WebElement viewJobTitles;

    @FindBy(id="menu_admin_viewPayGrades")
    public WebElement viewPayGrades;

    @FindBy(id="menu_admin_employmentStatus")
    public WebElement viewEmploymentStatus;

    @FindBy(id="menu_admin_jobCategory")
    public WebElement viewJobCategory;

    @FindBy(id="menu_admin_workShift")
    public WebElement viewWorkShifts;

    @FindBy(id="menu_admin_Organization")
    public WebElement organizationModule;

    @FindBy(id="menu_admin_viewOrganizationGeneralInformation")
    public WebElement viewGeneralInformation;

    @FindBy(id="menu_admin_viewLocations")
    public WebElement viewLocations;

    @FindBy(id="menu_admin_viewCompanyStructure")
    public WebElement viewCompanyStructure;


    @FindBy(id="menu_admin_Qualifications")
    public WebElement qualificationsModule;

    @FindBy(id="menu_admin_viewSkills")
    public WebElement viewSkills;

    @FindBy(id="menu_admin_viewEducation")
    public WebElement viewEducation;

    @FindBy(id="menu_admin_viewLicenses")
    public WebElement viewLicenses;

    @FindBy(id="menu_admin_viewLanguages")
    public WebElement viewLanguages;

    @FindBy(id="menu_admin_membership")
    public WebElement viewMemberships;


    @FindBy(id="menu_admin_nationality")
    public WebElement nationalityModule;


    @FindBy(id="menu_admin_Configuration")
    public WebElement configurationModule;

    @FindBy(id="menu_admin_listMailConfiguration")
    public WebElement emailConfiguration;

    @FindBy(id="menu_admin_viewEmailNotification")
    public WebElement emailSubscriptions;

    @FindBy(id="menu_admin_localization")
    public WebElement viewLocalization;

    @FindBy(id="menu_admin_viewModules")
    public WebElement viewModuleConfiguration;

    @FindBy(id="menu_admin_openIdProvider")
    public WebElement socialMediaAuthentication;

    @FindBy(id="menu_admin_registerOAuthClient")
    public WebElement registerOAuthClient;


    // PIM MODULES

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimModule;


    @FindBy(id="menu_pim_Configuration")
    public WebElement pimConfiguration;

    @FindBy(id="menu_pim_configurePim")
    public WebElement optionalFields;

    @FindBy(id="menu_pim_listCustomFields")
    public WebElement customFields;

    @FindBy(id="menu_admin_pimCsvImport")
    public WebElement dataImport;

    @FindBy(id="menu_pim_viewReportingMethods")
    public WebElement reportingMethods;

    @FindBy(id="menu_pim_viewTerminationReasons")
    public WebElement terminationReasons;



    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement employeeList;


    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployee;


    @FindBy(id="menu_core_viewDefinedPredefinedReports")
    public WebElement employeeReports;


    // LEAVE MODULES

    @FindBy(id="menu_leave_viewLeaveModule")
    public WebElement leaveModule;


    @FindBy(id="menu_leave_Entitlements")
    public WebElement entitlementsModule;

    @FindBy(id="menu_leave_addLeaveEntitlement")
    public WebElement addLeaveEntitlement;

    @FindBy(id="menu_leave_viewLeaveEntitlements")
    public WebElement viewLeaveEntitlements;


    @FindBy(id="menu_leave_Reports")
    public WebElement reportsModule;

    @FindBy(id="menu_leave_viewLeaveBalanceReport")
    public WebElement viewLeaveEntitlementsReport;


    @FindBy(id="menu_leave_Configure")
    public WebElement configureModule;

    @FindBy(id="menu_leave_defineLeavePeriod")
    public WebElement viewLeavePeriod;

    @FindBy(id="menu_leave_leaveTypeList")
    public WebElement viewLeaveType;

    @FindBy(id="menu_leave_defineWorkWeek")
    public WebElement viewWorkWeek;

    @FindBy(id="menu_leave_viewHolidayList")
    public WebElement viewHolidays;


    @FindBy(id="menu_leave_viewLeaveList")
    public WebElement leaveListModule;


    @FindBy(id="menu_leave_assignLeave")
    public WebElement assignLeaveModule;


    // TIME MODULE

    @FindBy(id="menu_time_viewTimeModule")
    public WebElement timeModule;


    @FindBy(id="menu_time_Timesheets")
    public WebElement timesheetsModule;

    @FindBy(id="menu_time_viewEmployeeTimesheet")
    public WebElement viewEmployeeTimesheet;


    @FindBy(id="menu_attendance_Attendance")
    public WebElement attendanceModule;

    @FindBy(id="menu_attendance_viewAttendanceRecord")
    public WebElement viewEmployeeRecords;

    @FindBy(id="menu_attendance_configure")
    public WebElement attendanceConfigure;


    @FindBy(id="menu_time_Reports")
    public WebElement timeReportsModule;

    @FindBy(id="menu_time_displayProjectReportCriteria")
    public WebElement projectReports;

    @FindBy(id="menu_time_displayEmployeeReportCriteria")
    public WebElement employeeTimeReports;

    @FindBy(id="menu_time_displayAttendanceSummaryReportCriteria")
    public WebElement attendanceSummary;

    @FindBy(id="menu_admin_ProjectInfo")
    public WebElement projectInfoModule;

    @FindBy(id="menu_admin_viewCustomers")
    public WebElement viewCustomers;

    @FindBy(id="menu_admin_viewProjects")
    public WebElement viewProjects;


    // RECRUITMENT MODULE

    @FindBy(id="menu_recruitment_viewRecruitmentModule")
    public WebElement recruitmentModule;


    @FindBy(id="menu_recruitment_viewCandidates")
    public WebElement candidatesModule;


    @FindBy(id="menu_recruitment_viewJobVacancy")
    public WebElement viewVacancy;


    // PERFORMANCE MODULE

    @FindBy(id="menu__Performance")
    public WebElement performanceModule;


    @FindBy(id="menu_performance_Configure")
    public WebElement performanceConfigureModule;

    @FindBy(id="menu_performance_searchKpi")
    public WebElement searchKPIs;

    @FindBy(id="menu_performance_addPerformanceTracker")
    public WebElement performanceTracker;


    @FindBy(id="menu_performance_ManageReviews")
    public WebElement manageReviewsModule;

    @FindBy(id="menu_performance_searchPerformancReview")
    public WebElement viewManageReviews;


    @FindBy(id="menu_performance_viewEmployeePerformanceTrackerList")
    public WebElement employeeTracker;


    // DASHBOARD MODULE

    @FindBy(id="menu_dashboard_index")
    public WebElement dashboardIndexModule;

    @FindBy(id = "welcome")
    public WebElement welcomeMsg;


    // DIRECTORY MODULE

    @FindBy(id="menu_directory_viewDirectory")
    public WebElement directoryModule;



    // MAIN METHOD FOR DASHBOARD PAGES

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
}
