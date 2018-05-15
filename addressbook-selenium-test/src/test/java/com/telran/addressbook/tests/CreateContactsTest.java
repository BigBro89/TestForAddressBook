package com.telran.addressbook.tests;

import com.telran.addressbook.model.ContactData;
import org.testng.annotations.Test;


public class CreateContactsTest extends TestBase {

    @Test
    public void addingContact(){
        app.getContactHelper().addContact(new ContactData("Alex", "Vasin", "Russia", "0987654321", "123456789", "a@a.com"));
    }
    @Test
    public void addingContactWithoutEmail(){
        app.getContactHelper().addContact(new ContactData("Alex", "Vasin", "Russia", "0987654321", "123456789", ""));
    }
    @Test
    public void addingContactWithoutPhone(){
        app.getContactHelper().addContact(new ContactData("Alex", "Vasin", "Russia", "", "", "vasya@mail.ru"));
    }
}
