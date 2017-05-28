package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Root on 28.05.2017.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(
                    new ContactData("Bob", "Smith", "Brooklin", "+19175115832", "bob@hotmail.com", "testGroup33"));
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(
                new ContactData("Boob", "Smeeth", "Bruklin", "+19176226943", "boob@hotmail.com", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
