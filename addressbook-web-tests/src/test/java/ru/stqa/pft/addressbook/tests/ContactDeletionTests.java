package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Root on 28.05.2017.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().gotoHomePage();
    }
}
