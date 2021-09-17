package com.happeo.pages;

import com.happeo.objects.GoogleSignInPageObjects;
import com.happeo.objects.HomePageObjects;
import com.happeo.objects.PagesMenuPageObject;
import com.happeo.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * @author in-vinaykumar.gupta on 15/09/21
 * @project IntelliJ IDEA
 */
public class HomePage extends BasePage {
    private HomePageObjects homePageObjects;
    public HomePage(WebDriver driver) {
        super(driver);
        homePageObjects = new HomePageObjects();
        PageFactory.initElements(driver,homePageObjects);
    }

    public HomePage verifyHomePageTitle()
    {
        waitForElement(homePageObjects.happeoLogo);
        Assert.assertTrue(driver.getTitle().contains("Home | Happeo"));
        return this;
    }
    public HomePage enterSearchQuery(String searchQuery)
    {
        homePageObjects.txtSearchBar.sendKeys(searchQuery);
        return this;
    }
    public HomePage clickOnSearchtxtBox()
    {
        homePageObjects.txtSearchBar.click();
        return this;
    }
    public ChannelPage selectSearchSuggestion()
    {
        waitForElement(homePageObjects.suggestionList);
        homePageObjects.suggestionList.click();
        return new ChannelPage(driver);
    }

    public HomePage verifyInvalidSearchQueryResult(String str)
    {
        String searchQuery = "See all results for: “"+str+"”";
        WebElement invalidSearchResult = driver.findElement(By.xpath("//p[contains(text(),'"+searchQuery+"')]"));
        System.out.println(searchQuery);
        waitForElement(invalidSearchResult);
        Assert.assertTrue(invalidSearchResult.isDisplayed());
        return this;
    }

    public HomePage clickOnPages()
    {
        homePageObjects.navigateToPages.click();
        return this;
    }

    public HomePage searchPage(String searchQuery)
    {
        homePageObjects.txtSearchPage.sendKeys(searchQuery);
        return this;
    }

    public PagesMenuPage selectSearchPageResult()
    {
        homePageObjects.tabSearchResult.click();
        return new PagesMenuPage(driver);
    }


}
