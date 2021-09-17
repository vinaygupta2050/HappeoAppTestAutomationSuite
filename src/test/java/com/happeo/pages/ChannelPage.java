package com.happeo.pages;

import com.happeo.objects.ChannelPageObjects;

import com.happeo.utils.BasePage;

import org.openqa.selenium.*;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

/**
 * @author in-vinaykumar.gupta on 16/09/21
 * @project IntelliJ IDEA
 */
public class ChannelPage extends BasePage {
    private ChannelPageObjects channelPageObjects;
    public static String postData = "";
    public ChannelPage(WebDriver driver) {
        super(driver);
        channelPageObjects = new ChannelPageObjects();
        PageFactory.initElements(driver,channelPageObjects);
    }

    public ChannelPage clickOnWritePost(){
        channelPageObjects.txtPostEditor.click();
        return this;
    }

    public ChannelPage enterPost(String post){
        channelPageObjects.txtPostEditor.sendKeys(post);
        return this;
    }
    public ChannelPage clickOnPostOptions(){
        channelPageObjects.btnPostOption.click();
        return this;
    }
    public ChannelPage selectShareAsAnnouncement(){
        channelPageObjects.optionShareAsAnAnnouncement.click();
        return this;
    }
    public ChannelPage selectSaveAsDraft(){
        channelPageObjects.optionSaveDraft.click();
        return this;
    }
    public ChannelPage selectShareAsDraft(){
        channelPageObjects.optionShareDraft.click();
        return this;
    }
    public ChannelPage selectMoveToReview(){
        channelPageObjects.optionMoveToReview.click();
        return this;
    }

    public ChannelPage verifyShareAsAnAnnouncementPopupTitle(){
        waitForElement(channelPageObjects.floatingPopupShareAnnouncement);
        Assert.assertEquals(channelPageObjects.floatingPopupShareAnnouncement.getText(),"Share as an announcement");
        return this;
    }

    public ChannelPage clickOnAnnouncementExpiryDropdown(){
        channelPageObjects.dropdownExpiry.click();
        return this;
    }

    public ChannelPage clickCustomDateOption(){
        //driver.findElement(By.xpath("//*[contains(@class,'dropedown_menu')"));
        channelPageObjects.dropdownExpiry.click();
        //Wip Writing code to handle expiry time
        return this;
    }

    public ChannelPage getLatestPostData()
    {
        postData= channelPageObjects.lastestPostData.getText();
        return this;
    }
    public ViewPostPage viewLatestPost(){
        getLatestPostData();
        channelPageObjects.threeDot.click();
        waitForElement(channelPageObjects.viewPost);
        channelPageObjects.viewPost.click();
        return new ViewPostPage(driver);
    }
    public ChannelPage verifyChannelTitle(String title)
    {
        waitForElement(channelPageObjects.lblchannelHeader);
        Assert.assertEquals(channelPageObjects.lblchannelHeader.getText(),title);
        return this;
    }
}
