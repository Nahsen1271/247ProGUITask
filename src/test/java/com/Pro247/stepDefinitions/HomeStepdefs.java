package com.Pro247.stepDefinitions;

import com.Pro247.pages.ContactsPage;
import com.Pro247.pages.HomePage;
import com.Pro247.utilities.BrowserUtils;
import com.Pro247.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

import java.util.ArrayList;
import java.util.List;

public class HomeStepdefs {

    HomePage homePage = new HomePage();


    @Given("User is on the Contact page")
    public void userIsOnTheContactPage() {
        Driver.get().get("https://mohammedzakaria2.github.io/contacts-list/apps/contacts");

    }

    @When("User navigates to Contacts Page")
    public void userNavigatesToContactsPage() {
        String title = Driver.get().getTitle();
        System.out.println("title = " + title);
        Assert.assertEquals("Fuse Angular - Material Design Admin Template", title);
    }

    @Then("User should see following titles on Contacts Page")
    public void userShouldSeeFollowingTitlesOnContactsPage(List<String> expectedPageScripts) {
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualPageScripts = new ArrayList<>();

        actualPageScripts.addAll(homePage.getSomeTitles(homePage.headTitles)); //add(homePage.getTitles(homePage.headTitles));
        actualPageScripts.add(homePage.fuse.getText());
        actualPageScripts.add(homePage.username.getText());
        actualPageScripts.add(homePage.emailAddress.getText());
        actualPageScripts.add(homePage.applicationScript.getText());
        actualPageScripts.add(homePage.sampleBut.getText());
        actualPageScripts.add(homePage.contactsBut.getText());
        actualPageScripts.add(homePage.customFunc.getText());
        actualPageScripts.add(homePage.customize.getText());
        actualPageScripts.add(homePage.documant.getText());
        actualPageScripts.add(homePage.changeLog.getText());


        Assert.assertEquals(expectedPageScripts, actualPageScripts);
        System.out.println("expectedPageScripts = " + expectedPageScripts);
        System.out.println("actualOptions = " + actualPageScripts);
    }

    @And("User should see {string} {string} {string} is as expected")
    public void userShouldSeeIsAsExpected(String expectedPageHeading, String expectedPageUrl, String expectedPageTitle) {

        String actualPageHeading = homePage.pageHeading.getText();
        String actualPageUrl = Driver.get().getCurrentUrl();
        String actualPageTitle = Driver.get().getTitle();

        System.out.println("actualPageHeading = " + actualPageHeading);
        System.out.println("actualPageUrl = " + actualPageUrl);
        System.out.println("actualPageTitle = " + actualPageTitle);

        Assert.assertEquals(expectedPageHeading, actualPageHeading);
        Assert.assertEquals(expectedPageUrl, actualPageUrl);
        Assert.assertEquals(expectedPageTitle, actualPageTitle);

    }

    @When("User clicks the language buttom")
    public void userClicksTheLanguageButtom() {
        homePage.languageBut.click();

    }

    @Then("User should see following languages options")
    public void userShouldSeeFollowingLanguagesOptions(List<String> expectedLanguage) {
        System.out.println("homePage.getLanguages(homePage.languagesText) = " + homePage.getSomeTitles(homePage.languagesText));
        Assert.assertEquals(expectedLanguage, homePage.getSomeTitles(homePage.languagesText));

    }


    @When("User clicks the three line icon")
    public void userClicksTheThreeLineIcon() {

        homePage.threeLineIcon.click();
        BrowserUtils.waitFor(1);


    }

    @Then("User should see following options")
    public void userShouldSeeFollowingOptions(List<String> matTitles) {
        List<String> actualMatTitles = new ArrayList<>();
        System.out.println("homePage.getSomeTitles(homePage.matSubheaders) = " + homePage.getSomeTitles(homePage.matSubheaders));
        System.out.println("homePage.getSomeTitles(homePage.matSliceToggle) = " + homePage.getSomeTitles(homePage.matSliceToggle));
        actualMatTitles.addAll(homePage.getSomeTitles(homePage.matSubheaders));
        actualMatTitles.addAll(homePage.getSomeTitles(homePage.matSliceToggle));

        Assert.assertEquals(matTitles, actualMatTitles);


    }

    @When("User clicks customize button")
    public void userClicksCustomizeButton() {
        homePage.customize.click();
        BrowserUtils.waitFor(1);
    }

    @Then("User checks the default color of Contacts")
    public void userChecksTheDefaultColorOfContacts() {
        String cssValueDefault = homePage.colorOfContacts.getCssValue("background-color");
        System.out.println("cssValueDefault = " + cssValueDefault);
        String asHexDefault = Color.fromString(cssValueDefault).asHex();
        System.out.println("asHexDefault = " + asHexDefault);
        Assert.assertEquals(asHexDefault, "#039be5");
        BrowserUtils.waitFor(1);
    }

    @And("User can change the color to Yellow and check the Contacts color is Yellow")
    public void userCanChangeTheColorToYellowAndCheckTheContactsColorIsYellow() {
        homePage.yellowBtn.click();
        String cssValueYellow = homePage.colorOfContacts.getCssValue("background-color");
        System.out.println("cssValueYellow = " + cssValueYellow);
        String asHexYellow = Color.fromString(cssValueYellow).asHex();
        System.out.println("asHexYellow = " + asHexYellow);
        Assert.assertEquals(asHexYellow, "#fdd835");

    }
}
