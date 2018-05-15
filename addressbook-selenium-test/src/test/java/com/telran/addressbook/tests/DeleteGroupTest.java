package com.telran.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase{

    @Test
    public void groupDeletionTest(){
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupsPage();
    }


}
