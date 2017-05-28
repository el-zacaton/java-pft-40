package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Bob", "Smith", "Brooklin", "+19175115832", "bob@hotmail.com"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
