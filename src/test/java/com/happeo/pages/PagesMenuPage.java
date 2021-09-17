package com.happeo.pages;

import com.happeo.objects.ChannelPageObjects;
import com.happeo.objects.PagesMenuPageObject;
import com.happeo.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * @author in-vinaykumar.gupta on 17/09/21
 * @project IntelliJ IDEA
 */
public class PagesMenuPage extends BasePage {
    private PagesMenuPageObject pagesMenuPageObject;
    public static String postData = "";
    public PagesMenuPage(WebDriver driver) {
        super(driver);
        pagesMenuPageObject = new PagesMenuPageObject();
        PageFactory.initElements(driver,pagesMenuPageObject);
    }

    public PagesMenuPage clickOnEditButton(){
        waitForElement(pagesMenuPageObject.btnEdit);
        pagesMenuPageObject.btnEdit.click();
        return this;
    }

    public PagesMenuPage clickOnManagePages(){
        pagesMenuPageObject.tabmanagePages.click();
        return this;
    }

    public PagesMenuPage verifyManageTabTitle(String title){
        waitForElement(pagesMenuPageObject.manageTabTitle);
        Assert.assertEquals(pagesMenuPageObject.manageTabTitle.getText(),title);
        return this;
    }

    public PagesMenuPage clickOnFirstPage(){
        waitForElement(pagesMenuPageObject.tabFirstPage);
        pagesMenuPageObject.tabFirstPage.click();
        return this;
    }

    public PagesMenuPage scrollDown(){
        pagesMenuPageObject.tabFirstPage.click();
        //span[text()='Add page']
        WebElement btnAddPage = driver.findElement(By.xpath("//span[text()='Add page']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", btnAddPage);
        return this;
    }

    public PagesMenuPage scrollDown1(){
        waitForElement(pagesMenuPageObject.scrollPane);
        pagesMenuPageObject.scrollPane.click();
        //span[text()='Add page']
        WebElement btnAddPage = driver.findElement(By.xpath("//span[text()='Add page']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", btnAddPage);
        return this;
    }

    public PagesMenuPage clickOnAddPage(){
        pagesMenuPageObject.btnAddPage.click();
        return this;
    }
    public PagesMenuPage enterPageName(String pageName){
        waitForElement(pagesMenuPageObject.txtPageName);
        pagesMenuPageObject.txtPageName.sendKeys(pageName);
        return this;
    }
    public PagesMenuPage clickOnCreate(){
        pagesMenuPageObject.btnCreate.click();
        waitForElement(pagesMenuPageObject.Iicon);
        return this;
    }

    public PagesMenuPage verifyPageCreated(String pageTitle){
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofMillis(10000))
                .pollingEvery(Duration.ofMillis(350))
                .ignoring(NoSuchElementException.class);
        WebElement pageTitles = (WebElement) wait.until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                return driver.findElement(By.xpath("//*[@id='page-hero']/div[3]/div/div/textarea"));
            }
        });
        System.out.println();
        Assert.assertTrue(pageTitles.getText().contains(pageTitle));
        return this;
    }



}
