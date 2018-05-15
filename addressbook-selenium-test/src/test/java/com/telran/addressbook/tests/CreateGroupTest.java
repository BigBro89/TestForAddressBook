package com.telran.addressbook.tests;

import com.telran.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateGroupTest extends TestBase {

  @Test
  public void testCreateGroupLongName(){
    app.getNavigationHelper().goToGroupsPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("name", "header", "footer"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupsPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1);
  }

 /* @Test
  public void testCreateShortLongName(){
    app.goToGroupsPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("n", "h", "f"));
    app.submitGroupCreation();
    app.returnToGroupsPage();
    System.out.println("Second test");
  }
  @Test
  public void testCreateGroupEmptyName(){
    app.goToGroupsPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("", "", ""));
    app.submitGroupCreation();
    app.returnToGroupsPage();
    System.out.println("Third test");
  }*/


}
