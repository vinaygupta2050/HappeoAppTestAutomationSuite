package com.happeo.pages;

import com.happeo.objects.PageSettingPaneObject;
import com.happeo.objects.PagesMenuPageObject;
import com.happeo.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * @author in-vinaykumar.gupta on 17/09/21
 * @project IntelliJ IDEA
 */
public class PageSettingPanePage extends BasePage {
    private PageSettingPaneObject pageSettingPaneObject;
    public static String postData = "";
    public PageSettingPanePage(WebDriver driver) {
        super(driver);
        pageSettingPaneObject = new PageSettingPaneObject();
        PageFactory.initElements(driver,pageSettingPaneObject);
    }

    public PageSettingPanePage enterDescription(String description){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement txtDescription = driver.findElement(By.xpath("//textarea[@type='text']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", txtDescription);
        //new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//textarea[@type='text']")))).click();
        txtDescription.sendKeys(description);
        return this;
    }

    public PageSettingPanePage clickOnSave(){
        waitForElement(pageSettingPaneObject.btnSave);
        pageSettingPaneObject.btnSave.click();
        return this;
    }

    public PageSettingPanePage verifyPageUpdateMsg(){
        Assert.assertTrue(pageSettingPaneObject.notificationPane.isDisplayed());
        return this;
    }

}
