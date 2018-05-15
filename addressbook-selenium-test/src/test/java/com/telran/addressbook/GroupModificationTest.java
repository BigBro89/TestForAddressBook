package com.telran.addressbook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){
        app.goToGroupsPage();
        app.selectGroup();
        app.initGroupModification();
        app.fillGroupForm(new GroupData("newName","NewHeader","smth"));
        app.confirmGroupModification();
        app.returnToGroupsPage();
    }
}
