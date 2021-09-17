package com.happeo.tests;

import com.happeo.pages.HappeoLandingPage;
import com.happeo.utils.BaseTest;
import org.testng.annotations.Test;

/**
 * @author in-vinaykumar.gupta on 15/09/21
 * @project IntelliJ IDEA
 */
public class HappeoHappyPathTest extends BaseTest {
    @Test
    public void createPost() {
        HappeoLandingPage happeoLandingPage = new HappeoLandingPage(driver);
        happeoLandingPage.clickOnGoogleSignIn().enterEmailIdAndClickOnNext().enterPasswordAndClickOnNext()
                .verifyHomePageTitle().enterSearchQuery("Interview Channel").clickOnSearchtxtBox().selectSearchSuggestion()
                .verifyChannelTitle("Interview Channel").clickOnWritePost().enterPost("RandomTest").clickOnPostOptions().selectShareAsAnnouncement()
                .verifyShareAsAnAnnouncementPopupTitle().clickOnAnnouncementExpiryDropdown().clickCustomDateOption();
    }
    @Test
    public void addReactionToThePost() {
        HappeoLandingPage happeoLandingPage = new HappeoLandingPage(driver);
        happeoLandingPage.clickOnGoogleSignIn().enterEmailIdAndClickOnNext().enterPasswordAndClickOnNext()
                .verifyHomePageTitle().enterSearchQuery("Interview Channel").clickOnSearchtxtBox().selectSearchSuggestion()
                .verifyChannelTitle("Interview Channel").viewLatestPost().verifyPostData().clickOnLikeButton().verifyLikeCount("1");
    }
    @Test
    public void addPages() {
        HappeoLandingPage happeoLandingPage = new HappeoLandingPage(driver);
        happeoLandingPage.clickOnGoogleSignIn().enterEmailIdAndClickOnNext().enterPasswordAndClickOnNext()
                .verifyHomePageTitle().clickOnPages().searchPage(" This Page Group").selectSearchPageResult().clickOnEditButton().clickOnManagePages()
                .verifyManageTabTitle("Manage pages").scrollDown1().clickOnAddPage().enterPageName("RandomTest193").clickOnCreate();
    }
}
