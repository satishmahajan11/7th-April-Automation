package com.maveric.project.tests;

import com.maveric.project.analyzer.IRetryAnalyzerImpl;
import com.maveric.project.dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

public class SampleTestA {
    @BeforeClass
    public void sampleTestAEnvSetup() {
        //System.out.println("SampleTestA	->	sampleTestAEnvSetup()");
    }

    @BeforeMethod
    public void testScenarioEnvSetup() {
      // System.out.println("SampleTestA	->	testScenarioEnvSetup()");
    }

    /*
    @Ignore
    @Test(dataProvider = "getInMemoryTestData" , dataProviderClass = TestDataProvider.class)
    public void test1(String param1 ,String param2) {
        String name1 = "Hello" , name2="Hello";
    }
    */
    @Test(retryAnalyzer = IRetryAnalyzerImpl.class)
    public void test2() {
        System.out.println("SampleTestA	->	test2()");
        Assert.fail();
    }
    @AfterMethod
    public void testScenarioEnvTearDown() {
      //  System.out.println("SampleTestA	->	testScenarioEnvTearDown()");
    }
    @AfterClass
    public void sampleTestAEnvTearDown() {
       // System.out.println("SampleTestA	->	sampleTestAEnvTearDown()");
    }
}
