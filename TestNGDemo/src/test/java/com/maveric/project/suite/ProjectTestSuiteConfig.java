package com.maveric.project.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ProjectTestSuiteConfig {
    @BeforeSuite
    public void setUpSuiteEnv() {
        System.out.println("TestSuite	->	setUpSuiteEnv()");
    }

    @AfterSuite
    public void tearDownSuiteEnv() {
        System.out.println("TestSuite	->	tearDownSuiteEnv()");
    }
}
