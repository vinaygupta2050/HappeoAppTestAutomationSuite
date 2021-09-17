package com.happeo.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author in-vinaykumar.gupta on 17/09/21
 * @project IntelliJ IDEA
 */
public class PagesMenuPageObject {

    @FindBy(xpath="//unicon[@icon='edit']")
    public WebElement btnEdit;

    @FindBy(xpath="//span[text()='Manage pages']")
    public WebElement tabmanagePages;

    @FindBy(xpath="//h2/span[text()='Manage pages']")
    public WebElement manageTabTitle;

    @FindBy(xpath="//div[text()='First page']")
    public WebElement tabFirstPage;

    @FindBy(xpath="//div[@id='managePageScroll']")
    public WebElement scrollPane;

    @FindBy(xpath="//span[text()='Add page']")
    public WebElement btnAddPage;

    @FindBy(xpath="//input[@id='newPageModalInput']")
    public WebElement txtPageName;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement btnCreate;
    //*[@id="icon-info"]
    @FindBy(xpath="//textarea[@type='text']")
    public WebElement txtDescription;

    @FindBy(xpath="//*[@id='icon-info']")
    public WebElement Iicon;

    @FindBy(xpath="//button/span/span[text()='Save']")
    public WebElement btnSave;

    //b[text()='Page updated.']

    @FindBy(xpath="//b[text()='Page updated.']")
    public WebElement notificationPane;

    @FindBy(xpath="//*[@id='page-hero']/div[3]/div/div/textarea")
    public WebElement pageTitle;
}
