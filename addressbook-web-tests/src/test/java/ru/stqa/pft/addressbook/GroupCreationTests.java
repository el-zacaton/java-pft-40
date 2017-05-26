package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("testGroup3", "testGroup3_1", "testGroup3_2"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
