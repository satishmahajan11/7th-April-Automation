package com.maveric.project.tests;

import org.testng.annotations.*;

public class SampleTestC {
    @BeforeClass
    public void sampleTestCEnvSetup() {
        //System.out.println("SampleTestC	->	sampleTestCEnvSetup()");
    }

    @BeforeMethod
    public void testScenarioEnvSetup() {
        //System.out.println("SampleTestC	->	testScenarioEnvSetup()");
    }

    @Test()
    public void test1() {
        System.out.println("SampleTestC	->	test1()"+" Thread   "+Thread.currentThread().getName());
    }

    @Test()
    public void test2() {
        System.out.println("SampleTestC ->	test2()");
    }


    @AfterMethod
    public void testScenarioEnvTearDown() {
        //System.out.println("SampleTestC	->	testScenarioEnvTearDown()");
    }
    @AfterClass
    public void sampleTestCEnvTearDown() {
        //System.out.println("SampleTestC	->	sampleTestCEnvTearDown()");
    }
}
