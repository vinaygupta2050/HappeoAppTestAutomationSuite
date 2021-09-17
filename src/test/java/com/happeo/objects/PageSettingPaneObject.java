package com.happeo.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author in-vinaykumar.gupta on 17/09/21
 * @project IntelliJ IDEA
 */
public class PageSettingPaneObject {
    @FindBy(xpath="//textarea[@type='text']")
    public WebElement txtDescription;

    @FindBy(xpath="//*[@id='icon-info']")
    public WebElement Iicon;

    @FindBy(xpath="//button/span/span[text()='Save']")
    public WebElement btnSave;

    //b[text()='Page updated.']

    @FindBy(xpath="//b[text()='Page updated.']")
    public WebElement notificationPane;
}
