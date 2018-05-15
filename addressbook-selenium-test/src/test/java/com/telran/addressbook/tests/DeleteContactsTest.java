package com.telran.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContactsTest extends TestBase {
    @Test
    public void deleteOneContact() throws InterruptedException {
     app.getContactHelper().selectContact();
     app.getContactHelper().deleteContact();
     app.getContactHelper().selectContact();
     app.getContactHelper().deleteContact();

    }



}
