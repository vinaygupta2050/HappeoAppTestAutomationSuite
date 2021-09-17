package com.happeo.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author in-vinaykumar.gupta on 15/09/21
 * @project IntelliJ IDEA
 */
public class GoogleSignInPageObjects {
    ////div[@class='ZxXxWb']
    @FindBy(xpath = "//input[@type='email']")
    public WebElement txtEmail;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//span[text()='Next']")
    public WebElement btnNext;

}
