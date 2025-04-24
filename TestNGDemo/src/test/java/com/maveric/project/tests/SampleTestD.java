package com.maveric.project.tests;

import org.testng.annotations.*;

public class SampleTestD {
    @BeforeClass
    public void sampleTestDEnvSetup() {
        //System.out.println("SampleTestD	->	sampleTestDEnvSetup()");
    }

    @BeforeMethod
    public void testScenarioEnvSetup() {
        //System.out.println("SampleTestD	->	testScenarioEnvSetup()");
    }

    @Test()
    public void test1() {
        System.out.println("SampleTestD	->	test1()"+" Thread   "+Thread.currentThread().getName());
    }

    @Test()
    public void test2() {
        System.out.println("SampleTestD	->	test2()"+" Thread   "+Thread.currentThread().getName());
    }


    @AfterMethod
    public void testScenarioEnvTearDown() {
        //System.out.println("SampleTestD	->	testScenarioEnvTearDown()");
    }
    @AfterClass
    public void sampleTestAEnvTearDown() {
        //System.out.println("SampleTestD	->	sampleTestDdEnvTearDown()");
    }
}
