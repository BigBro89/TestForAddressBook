package com.telran.addressbook.appManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public class ApplicationManager {

    private NavigationHelper navigationHelper;
    private  GroupHelper groupHelper;
    private boolean acceptNextAlert = true;
    protected WebDriver driver;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        openAddressbook();
        login();
    }

    public void login() {
      driver.findElement(By.name("user")).click();
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys("admin");
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys("secret");
      driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void openAddressbook() {
      driver.get("http://localhost/addressbook/");
    }

    public void stop() {
        driver.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public void addContact(String firstName, String surName, String country, String phoneNumber, String workPhoneNumber, String email){
        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstName);
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(surName);
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys(country);
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(phoneNumber);
        driver.findElement(By.name("work")).click();
        driver.findElement(By.name("work")).clear();
        driver.findElement(By.name("work")).sendKeys(workPhoneNumber);
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void selectContact(){
        driver.findElement(By.name("selected[]")).click();
    }

    public void deleteContact() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        acceptNextAlert = true;
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
        TimeUnit.SECONDS.sleep(5);

    }

    public void deleteAllContacts() {
        driver.findElement(By.id("MassCB")).click();
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        acceptNextAlert = true;
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));

    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
