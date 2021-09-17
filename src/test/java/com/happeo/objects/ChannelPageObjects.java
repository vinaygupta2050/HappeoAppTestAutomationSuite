package com.happeo.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author in-vinaykumar.gupta on 16/09/21
 * @project IntelliJ IDEA
 */
public class ChannelPageObjects {

    @FindBy(xpath = "//h1[normalize-space()='Interview Channel']")
    public WebElement lblchannelHeader;

    //div[@role='application']
    //@FindBy(xpath = "//div[@role='application']")
    @FindBy(xpath = "//div[@dir='auto' and @contenteditable='true']")
    public WebElement txtPostEditor;

    @FindBy(xpath = "    //div[@data-tracker='Share options']/ul/li[@data-tracker='Save draft']")
    public WebElement optionSaveDraft;

    @FindBy(xpath = "//div[@data-tracker='Share options']/ul/li[@data-tracker='Share draft']")
    public WebElement optionShareDraft;

    @FindBy(xpath = "//div[@data-tracker='Share options']/ul/li[@data-tracker='Move to review]")
    public WebElement optionMoveToReview;

    @FindBy(xpath = "//div[@data-tracker='Share options']/ul/li[@data-tracker='Publish']")
    public WebElement optionShareAsAnAnnouncement;

    @FindBy(xpath = "//p[normalize-space()='Post options']")
    public WebElement btnPostOption;

    @FindBy(xpath = "//h2[normalize-space()='Share as an announcement']")
    public WebElement floatingPopupShareAnnouncement;

    @FindBy(xpath = "//p[text()='Announcement expiry']/../div[2]")
    public WebElement dropdownExpiry;

    @FindBy(xpath = "//div[@id='react-select-3-option-4']")
    public WebElement customDateOption;

    @FindBy(xpath = "//ul[@role='tablist']/../../../div/div[2]/div/div[1]")
    public WebElement selectLatestPost;

    @FindBy(xpath = "//ul[@role='tablist']/../../../div/div[2]/div/div[1]/div[1]/div[2]/div[3]/div[2]/button/div/span/div[1]")
    public WebElement threeDot;

    @FindBy(xpath = "//li[@data-tracker='View post']")
    public WebElement viewPost;

    //ul[@role='tablist']/../../../div/div[2]/div/div[1]/div[2]/div/div/div/p
    @FindBy(xpath = " //ul[@role='tablist']/../../../div/div[2]/div/div[1]/div[2]/div/div/div/p")
    public WebElement lastestPostData;




}
