package com.happeo.pages;

import com.happeo.objects.GoogleSignInPageObjects;
import com.happeo.utils.BasePage;
import com.happeo.utils.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author in-vinaykumar.gupta on 15/09/21
 * @project IntelliJ IDEA
 */
public class GoogleSingInPage extends BasePage {
    private GoogleSignInPageObjects googleSignPageObjects;
    public GoogleSingInPage(WebDriver driver) {
        super(driver);
        googleSignPageObjects = new GoogleSignInPageObjects();
        PageFactory.initElements(driver,googleSignPageObjects);
    }
    public GoogleSingInPage enterEmailIdAndClickOnNext()
    {
        googleSignPageObjects.txtEmail.sendKeys(Configuration.getConfiguration().getUserName());
        googleSignPageObjects.btnNext.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public GoogleSingInPage enterCustomEmailIdAndClickOnNext1(String email)
    {
        googleSignPageObjects.txtEmail.sendKeys(email);
        googleSignPageObjects.btnNext.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    public HomePage enterPasswordAndClickOnNext()
    {
        waitForElement(googleSignPageObjects.txtPassword);
        googleSignPageObjects.txtPassword.sendKeys(Configuration.getConfiguration().getUserPassword());
        googleSignPageObjects.btnNext.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new HomePage(driver);
    }
    public HomePage enterCustomPasswordAndClickOnNext(String pass)
    {
        waitForElement(googleSignPageObjects.txtPassword);
        googleSignPageObjects.txtPassword.sendKeys(pass);
        googleSignPageObjects.btnNext.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new HomePage(driver);
    }
}
