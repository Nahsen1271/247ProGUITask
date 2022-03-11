package com.Pro247.pages;

import com.Pro247.utilities.BrowserUtils;
import com.Pro247.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@class='logo-text secondary-text']")
    public WebElement fuse;

    @FindBy(css = ".h3.username")
    public WebElement username;

    @FindBy(css = "div[class='user fuse-navy-900'] div:nth-child(2)")
    public WebElement emailAddress;

    @FindBy(xpath = "//span[normalize-space()='Applications']")
    public WebElement applicationScript;

    @FindBy(xpath = "//span[normalize-space()='Sample']")
    public WebElement sampleBut;

    @FindBy(xpath = "//span[normalize-space()='Contacts']")
    public WebElement contactsBut;

    @FindBy(xpath = "//span[normalize-space()='Custom Function']")
    public WebElement customFunc;

    @FindBy(xpath = "//span[normalize-space()='Customize']")
    public WebElement customize;

    @FindBy(xpath = "//a[@routerlink='/documentation/getting-started/introduction']")
    public WebElement documant;

    @FindBy(xpath = "//span[normalize-space()='Changelog']")
    public WebElement changeLog;

    @FindBy(xpath = "//h2[normalize-space()='Contacts']")
    public WebElement pageHeading;

    @FindBy(xpath = "//span[normalize-space()='Purchase FUSE Angular']")
    public WebElement purchaseBut;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-menu-trigger language-button mat-button mat-button-base']//div[@fxlayout='row']")
    public WebElement languageBut;

    @FindBy(css = "[class='iso']")
    public List<WebElement> languagesText;

    @FindBy(xpath = "//div//div[contains(@id,'cdk-describedby-message-')]")
    public List<WebElement> headTitles;

    @FindBy(xpath = "//mat-icon[normalize-space()='format_list_bulleted']")
    public WebElement threeLineIcon;

    @FindBy(xpath= "//h3[@class='mat-subheader']//span")
    public List<WebElement> matSubheaders;

    @FindBy(xpath= "//span[@class='mat-slide-toggle-content']//h3")
    public List<WebElement> matSliceToggle;

    @FindBy(xpath= "//a[@class='nav-link ng-star-inserted active accent']")
    public WebElement colorOfContacts;

    @FindBy(xpath= "(//div[@class='mat-radio-label-content'])[2]")
    public WebElement yellowBtn;


    public List<String> getSomeTitles(List<WebElement>headTitles) {
            List<String>stringList=new ArrayList<>();
            for (WebElement each:headTitles){
              stringList.add(each.getAttribute("innerHTML"));

            }
        return stringList;
    }

}
