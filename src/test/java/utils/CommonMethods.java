package utils;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;
import utils.Constants;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication() throws IOException {

        switch (ConfigReader.read("browser")){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "FireFox":
                driver=new FirefoxDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Name");
        }
//
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get(ConfigReader.read("url"));
        initializePageObjects();


        DOMConfigurator.configure("log4j.xml");
        Log.trace("My first test case is Login test");
        Log.info("My login test is going on");
        Log.warn("My test case might be failed");

    }

    public static void closeBrowser() {
        Log.info("My test case is about to complete");
        Log.trace("This is my login test again");
        driver.quit();
    }

    public  static  void selectFromDropDown(WebElement dropDown,int index){
        Select sel=new Select(dropDown);
        sel.selectByIndex(index);
    }
    public  static  void selectFromDropDown(WebElement dropDown,String visibleText){
        Select sel=new Select(dropDown);
        sel.selectByVisibleText(visibleText);
    }

    public  static  void selectFromDropDown(String value, WebElement dropDown){
        Select sel=new Select(dropDown);
        sel.selectByValue(value);
    }

    public static void sendText(String text,WebElement element){
//        clear the text box
        element.clear();
//        send the text to element
        element.sendKeys(text);
    }


    public  static  WebDriverWait getwait(){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        return  wait;
    }

    public static void waitForElementToBeClickable(WebElement element){
        getwait().until(ExpectedConditions.elementToBeClickable(element));

    }

    public static void click(WebElement element){
        waitForElementToBeClickable(element);
        element.click();
    }

    public static byte[] takeScreenshot(String fileName){

        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File
                    (Constants.SCREENSHOT_FILEPATH+fileName+
                            " "+ getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picBytes;
    }

    public static String getTimeStamp(String pattern){

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        return sdf.format(date);

    }
    public static JavascriptExecutor getJSExecutor(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public static void jsClick(WebElement element){
        getJSExecutor().executeScript("arguments[0].click();",element);

    }}

