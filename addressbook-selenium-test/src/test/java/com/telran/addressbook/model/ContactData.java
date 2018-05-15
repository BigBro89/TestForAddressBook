package com.telran.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String surName;
    private final String country;
    private final String phoneNumber;
    private final String workPhoneNumber;
    private final String email;

    public ContactData(String firstName, String surName, String country, String phoneNumber, String workPhoneNumber, String email) {
        this.firstName = firstName;
        this.surName = surName;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.workPhoneNumber = workPhoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getCountry() {
        return country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
