package com.happeo.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author in-vinaykumar.gupta on 15/09/21
 * @project IntelliJ IDEA
 */
public class HappeoLandingPageObjects {
    @FindBy(xpath = "//div[@class='google-signin-btn--text']")
    public WebElement btnGoogleSingnIn;

    @FindBy(xpath = "//p[@xpath='1']")
    public WebElement txtHeadingSignin;
}
