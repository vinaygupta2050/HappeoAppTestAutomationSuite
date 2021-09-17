package com.happeo.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author in-vinaykumar.gupta on 16/09/21
 * @project IntelliJ IDEA
 */
public class ViewPostObjects {

    @FindBy(xpath = "//button[@data-tracker='like']")
    public WebElement btnLike;

    @FindBy(xpath = "//a[@data-tracker='reactions-summary']/p")
    public WebElement likeSummaryCount;
    @FindBy(xpath = "//p[text()='Comment']/../../../../../div[2]")
    public WebElement postData;
}
