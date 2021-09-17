package com.happeo.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * @author in-vinaykumar.gupta on 15/09/21
 * @project IntelliJ IDEA
 */
public class BaseTest {
    public WebDriver driver;
    private String baseUrl=Configuration.getConfiguration().getAppUrl();

    @BeforeMethod
    public void setup(){
        getChromeBrowser();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null)
        {
            driver.quit();
        }
    }

    public void getChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }
    public void getFirefoxBrowser(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
}
