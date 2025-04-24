package com.maveric.project.tests;

import com.maveric.project.analyzer.IRetryAnalyzerImpl;
import org.testng.annotations.*;

public class SampleTestB {


    @BeforeClass
    public void sampleTestBEnvSetup() {
      //  System.out.println("SampleTestB	->	sampleTestBEnvSetup()");
    }

    @BeforeMethod
    public void testScenarioEnvSetup() {
       // System.out.println("SampleTestB	->	testScenarioEnvSetup()");
    }


    @Test(retryAnalyzer = IRetryAnalyzerImpl.class)
    public void test1() {
        System.out.println("SampleTestB	->	test1()" +" Thread   "+Thread.currentThread().getName());
    }

    @Test()
    public void test2() {
        System.out.println("SampleTestB	->	test2() ");
    }

    @AfterMethod
    public void testScenarioEnvTearDown() {
      //  System.out.println("SampleTestB	->	testScenarioEnvTearDown()");
    }

    @AfterClass
    public void sampleTestBEnvTearDown() {
       // System.out.println("SampleTestB	->	sampleTestBEnvTearDown()");
    }
}
