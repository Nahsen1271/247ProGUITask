package com.Pro247.stepDefinitions;

import com.Pro247.pages.ContactsPage;
import com.Pro247.utilities.BrowserUtils;
import com.Pro247.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class ContactsStepdefs {

    ContactsPage contactsPage = new ContactsPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

    @When("User clicks the {string}")
    public void userClicksThe(String clickName) throws InterruptedException {
        jse.executeScript("arguments[0].scrollIntoView(true);", contactsPage.nameContacts(clickName)); //Scroll down the page
        BrowserUtils.waitFor(1);
        contactsPage.nameContacts(clickName).click();
        Thread.sleep(2000);


    }

    @Then("User should see {string} {string} {string}")
    public void userShouldSee(String name, String phone, String email) {

        jse.executeScript("arguments[0].scrollIntoView(true);", contactsPage.getContactsName(name)); //Scroll down the page
        BrowserUtils.waitFor(1);
        String actualName = contactsPage.getContactsName(name).getText();
        jse.executeScript("arguments[0].scrollIntoView(true);", contactsPage.getContactsPhone(phone)); //Scroll down the page
        BrowserUtils.waitFor(1);
        String actualPhone = contactsPage.getContactsPhone(phone).getText();
        jse.executeScript("arguments[0].scrollIntoView(true);", contactsPage.getContactsEmail(email)); //Scroll down the page
        BrowserUtils.waitFor(1);
        String actualEmail = contactsPage.getContactsEmail(email).getText();

        System.out.println("actualName = " + actualName);
        System.out.println("actualPhone = " + actualPhone);
        System.out.println("actualEmail = " + actualEmail);

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(phone, actualPhone);
        Assert.assertEquals(email, actualEmail);


    }

    @And("User clicks on add new button")
    public void userClicksOnAddNewButton() throws InterruptedException {
        contactsPage.newAddBut.click();
        Thread.sleep(2000);
    }

    @When("User types {string} {string} {string}")
    public void userTypes(String newConName, String newConPhone, String newConEmail) throws InterruptedException {

        contactsPage.newName.sendKeys(newConName);
        Thread.sleep(1000);
        contactsPage.newPhone.sendKeys(newConPhone);
        Thread.sleep(1000);
        contactsPage.newEmail.sendKeys(newConEmail);
        Thread.sleep(1000);
        contactsPage.submit.click();
        Thread.sleep(1000);


    }

    @Then("User can create new contacts with {string}")
    public void userCanCreateNewContactsWith(String name) {
        jse.executeScript("arguments[0].scrollIntoView(true);", contactsPage.nameContacts(name)); //Scroll down the page
        BrowserUtils.waitFor(1);
        Assert.assertTrue(contactsPage.nameContacts(name).isEnabled());
    }

    @And("User hovers over {string} contacts")
    public void userHoversOverContacts(String name) {

        jse.executeScript("arguments[0].scrollIntoView(true);", contactsPage.nameContacts(name)); //Scroll down the page
        BrowserUtils.waitFor(1);
        BrowserUtils.hoverOver(contactsPage.nameContacts(name));
        BrowserUtils.waitFor(1);


    }

    @And("User clicks {string} edit button")
    public void userClicksEditButton(String name) throws InterruptedException {
        contactsPage.clickEditBtn(name).click();
        BrowserUtils.waitFor(1);
        jse.executeScript("arguments[0].scrollIntoView();", contactsPage.uptoPage); //Scroll up the page
        BrowserUtils.waitFor(1);


    }

    @When("User changes {string} {string}")
    public void userChanges(String phone, String email) {
        contactsPage.newPhone.clear();
        BrowserUtils.waitFor(1);
        contactsPage.newPhone.sendKeys(phone);
        BrowserUtils.waitFor(1);
        contactsPage.newEmail.clear();
        BrowserUtils.waitFor(1);
        contactsPage.newEmail.sendKeys(email);
        BrowserUtils.waitFor(1);
        contactsPage.submit.click();
        BrowserUtils.waitFor(1);
    }

    @And("User clicks {string}")
    public void userClicks(String name) {

        jse.executeScript("arguments[0].scrollIntoView(true);", contactsPage.nameContacts(name)); //Scroll down the page
        BrowserUtils.waitFor(1);
        contactsPage.nameContacts(name).click();
        BrowserUtils.waitFor(1);

    }

    @Then("User can edit {string} {string}")
    public void userCanEdit(String phone, String email) {
        jse.executeScript("arguments[0].scrollIntoView();", contactsPage.uptoContactImage);
        BrowserUtils.waitFor(1);
        String changedPhone = contactsPage.getEditPhone.getText();
        System.out.println("changedPhone = " + changedPhone);
        BrowserUtils.waitFor(1);
        String changedEmail = contactsPage.getEditEmail.getText();
        System.out.println("changedEmail = " + changedEmail);

        Assert.assertEquals(phone, changedPhone);
        Assert.assertEquals(email, changedEmail);

    }
    @When("User clicks {string} delete button and confirmation button")
    public void userClicksDeleteButtonAndConfirmationButton(String createdPeople) {
        jse.executeScript("arguments[0].scrollIntoView(true);", contactsPage.nameContacts(createdPeople)); //Scroll down the page

        BrowserUtils.waitFor(1);
        contactsPage.clickDeleteBtn(createdPeople).click();
        BrowserUtils.waitFor(1);
        jse.executeScript("arguments[0].scrollIntoView(true);", contactsPage.deleteConfBtn(createdPeople));
        BrowserUtils.waitFor(1);
        contactsPage.deleteConfBtn(createdPeople).click();
        BrowserUtils.waitFor(2);
    }



    @Then("User can delete all information related to {string}")
    public void userCanDeleteAllInformationRelatedTo(String createdPeople) throws InterruptedException {
        Assert.assertFalse(contactsPage.allContants().contains(createdPeople));
    }



}
