package com.Pro247.pages;

import com.Pro247.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ContactsPage {

    public ContactsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//h1[@class='contact_details_line_value'])[2]")
    public WebElement getEditPhone;

    @FindBy(xpath = "(//h1[@class='contact_details_line_value'])[3]")
    public WebElement getEditEmail;

    @FindBy(xpath = "//button[@class='header_button btn']")
    public WebElement newAddBut;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement newName;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement newPhone;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement newEmail;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(css = "input[name='name']")
    public WebElement uptoPage;

    @FindBy(css = "[class='contact_image']")
    public WebElement uptoContactImage;

    @FindBy(css = "[class='contact_item_details']")
    public List<WebElement> allContacts;

    WebElement webElement;

    public WebElement nameContacts(String name) {
        webElement = Driver.get().findElement(By.xpath("//a[normalize-space()='" + name + "']"));
        return webElement;
    }

    public WebElement getContactsName(String name) {
        webElement = Driver.get().findElement(By.xpath("//h1[normalize-space()='" + name + "']"));
        return webElement;
    }

    public WebElement getContactsPhone(String phone) {

        webElement = Driver.get().findElement(By.xpath("//h1[normalize-space()='" + phone + "']"));

        return webElement;
    }

    public WebElement getContactsEmail(String email) {

        webElement = Driver.get().findElement(By.xpath("//h1[normalize-space()='" + email + "']"));

        return webElement;
    }

    public List<String> allContants() throws InterruptedException {
        List<WebElement> allContacts = Driver.get().findElements(By.cssSelector("[class='contact_item_details']"));
        System.out.println("allContacts.size() = " + allContacts.size());
        List<String> allContAsList = new ArrayList<>();
        for (int i = 0; i <= allContacts.size() - 1; i++) {

            JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
            jse.executeScript("arguments[0].scrollIntoView(true);", allContacts.get(i));
            Thread.sleep(1000);
            allContAsList.add(allContacts.get(i).getText());


        }
        System.out.println("allContAsList = " + allContAsList);

        return allContAsList;
    }

    public WebElement clickEditBtn(String name) {
        webElement = Driver.get().findElement(By.xpath("//a[contains(.,'" +name+ "')]/../..//div//button[@class='control_button edit btn']"));
        return webElement;
    }
    public WebElement clickDeleteBtn(String name) {
        webElement = Driver.get().findElement(By.xpath("//a[contains(.,'" +name+ "')]/../..//div//button[@class='control_button delete btn']"));
        return webElement;
    }
    public WebElement deleteConfBtn(String name) {
        webElement = Driver.get().findElement(By.xpath("//a[contains(.,' " +name+ "')]/../..//div//button[@class='control_button edit btn']/p[contains(.,'Confirm')]/.."));
        return webElement;
    }

}
