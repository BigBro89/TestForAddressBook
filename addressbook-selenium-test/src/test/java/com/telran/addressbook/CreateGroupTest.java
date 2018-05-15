package com.telran.addressbook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateGroupTest extends TestBase {

  @Test
  public void testCreateGroupLongName(){
    app.goToGroupsPage();
    int before = app.getGroupCount();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("name", "header", "footer"));
    app.submitGroupCreation();
    app.returnToGroupsPage();
    int after = app.getGroupCount();
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
