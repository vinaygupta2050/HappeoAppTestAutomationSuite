package com.happeo.tests;

import com.happeo.pages.HappeoLandingPage;
import com.happeo.utils.BaseTest;
import org.testng.annotations.Test;

/**
 * @author in-vinaykumar.gupta on 16/09/21
 * @project IntelliJ IDEA
 */
public class HappeoValidationTest extends BaseTest {
    @Test
    public void verifyLikeCountWhenLikeButtonIsPressedMultipleTimes() {
        HappeoLandingPage happeoLandingPage = new HappeoLandingPage(driver);
        happeoLandingPage.clickOnGoogleSignIn().enterEmailIdAndClickOnNext().enterPasswordAndClickOnNext()
                .verifyHomePageTitle().enterSearchQuery("Interview Channel").clickOnSearchtxtBox().selectSearchSuggestion()
                .verifyChannelTitle("Interview Channel").viewLatestPost().verifyPostData().clickOnLikeButton().clickOnLikeButton().verifyLikeCount("1");
    }

    @Test
    public void verifySearchResultWithInvalidSearchQueryWhileSearchingChannel() {
        HappeoLandingPage happeoLandingPage = new HappeoLandingPage(driver);
        happeoLandingPage.clickOnGoogleSignIn().enterEmailIdAndClickOnNext().enterPasswordAndClickOnNext()
                .verifyHomePageTitle().enterSearchQuery("1121#asadasd").clickOnSearchtxtBox().verifyInvalidSearchQueryResult("1121#asadasd");
    }

    //wip
    @Test
    public void verifyMaxCharacterUserCanPostInTheChannel() {
    }
    @Test
    public void verifySearchResultWithInvalidPageInformation() {
    }
    @Test
    public void verifyPostShouldNotifyWhenUserSelectBackDatedDateAsAnnouncementExipry() {
    }
}
