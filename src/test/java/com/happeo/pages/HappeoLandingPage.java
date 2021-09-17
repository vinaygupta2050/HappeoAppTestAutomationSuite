package com.happeo.pages;

import com.happeo.objects.HappeoLandingPageObjects;
import com.happeo.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author in-vinaykumar.gupta on 15/09/21
 * @project IntelliJ IDEA
 */
public class HappeoLandingPage extends BasePage {
    private HappeoLandingPageObjects landingPageObjects;
    public HappeoLandingPage(WebDriver driver) {
        super(driver);
        landingPageObjects = new HappeoLandingPageObjects();
        PageFactory.initElements(driver,landingPageObjects);
    }
    public GoogleSingInPage clickOnGoogleSignIn()
    {
        landingPageObjects.btnGoogleSingnIn.click();
        return new GoogleSingInPage(driver);
    }

}
