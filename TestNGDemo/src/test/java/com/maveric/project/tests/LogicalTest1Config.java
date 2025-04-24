package com.maveric.project.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LogicalTest1Config {

        @BeforeTest
        public void setUpLogicalTestEnv() {
          //  System.out.println("LogicalTest1Config	->	setUpLogicalTestEnv()");
        }

        @AfterTest
        public void tearDownLogicalTestEnv() {
           // System.out.println("LogicalTest1Config	->	tearDownLogicalTestEnv()");
        }

}
