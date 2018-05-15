package com.telran.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase{

    @Test
    public void groupDeletionTest(){
        app.goToGroupsPage();
        app.selectGroup();
        app.deleteGroup();
        app.returnToGroupsPage();
    }


}
