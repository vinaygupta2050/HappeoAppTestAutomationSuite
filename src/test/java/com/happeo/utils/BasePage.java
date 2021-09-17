package com.happeo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author in-vinaykumar.gupta on 15/09/21
 * @project IntelliJ IDEA
 */
public class BasePage {
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }

    public WebDriver driver;

    public WebElement waitForElement(WebElement by){

        wait.until(ExpectedConditions.elementToBeClickable(by));
        return by;
    }
    WebDriverWait wait;

}
