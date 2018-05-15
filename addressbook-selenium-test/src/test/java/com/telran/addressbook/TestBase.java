package com.telran.addressbook;

import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static junit.framework.TestCase.assertTrue;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
        app.openAddressbook();
        app.login();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();

    }

}
