package com.happeo.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author in-vinaykumar.gupta on 15/09/21
 * @project IntelliJ IDEA
 */
public class HomePageObjects {

    @FindBy(xpath = "//img[@data-testid='nav-logo']")
    public WebElement happeoLogo;

    @FindBy(xpath = "//div[@class='google-signin-btn--text']")
    public WebElement btnGoogleSingnIn;

    @FindBy(id = "nav-profile-button")
    public WebElement userName;

    @FindBy(id = "nav-search-input")
    public WebElement txtSearchBar;

    @FindBy(id = "nav-search-item-channel-23003138")
    public WebElement suggestionList;

    @FindBy(xpath="//div[@data-testid='filter-list-wrapper']/../div[2]/div/div[1]")
    public WebElement firstPost;

    @FindBy(xpath="//span[@xpath='1']")
    public WebElement clickOn;

    @FindBy(xpath="//span[@xpath='1']/div/../../../../ul/li[@data-tracker='View post']")
    public WebElement clickOnViewPost;

    @FindBy(xpath="//span[@xpath=1 and text()='\uD83D\uDC4D']/../p")
    public WebElement verifyCount;

    @FindBy(xpath="//*[@id='nav-pages-button']")
    public WebElement navigateToPages;

    @FindBy(xpath="//*[@id='nav-pages-search']")
    public WebElement txtSearchPage;

    @FindBy(xpath="//li[@id='1fdhtpdsl5s16aqa6c']/div[1]")
    public WebElement tabSearchResult;


}
