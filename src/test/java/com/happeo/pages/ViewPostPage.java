package com.happeo.pages;

import com.happeo.objects.ChannelPageObjects;
import com.happeo.objects.ViewPostObjects;
import com.happeo.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * @author in-vinaykumar.gupta on 16/09/21
 * @project IntelliJ IDEA
 */
public class ViewPostPage extends BasePage {
    private ViewPostObjects viewPostObjects;
    public static String postData = "";
    public ViewPostPage(WebDriver driver) {
        super(driver);
        viewPostObjects = new ViewPostObjects();
        PageFactory.initElements(driver,viewPostObjects);
    }
    public ViewPostPage verifyPostData()
    {
        waitForElement(viewPostObjects.btnLike);
        Assert.assertEquals(ChannelPage.postData,viewPostObjects.postData.getText());
        return this;
    }

    public ViewPostPage clickOnLikeButton()
    {
        viewPostObjects.btnLike.click();
        return this;
    }

    public ViewPostPage verifyLikeCount(String count)
    {
        System.out.println("--------------");
        System.out.println(viewPostObjects.likeSummaryCount.getText());
        Assert.assertEquals(viewPostObjects.likeSummaryCount.getText(),count);
        return this;
    }
}
