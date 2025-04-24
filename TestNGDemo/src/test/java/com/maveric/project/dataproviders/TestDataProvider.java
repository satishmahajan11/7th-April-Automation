package com.maveric.project.dataproviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {


    @DataProvider
    public Object[][] getInMemoryTestData(){
        return new Object [][] {
                {"testData1" ,"testData2"},
                {"testData3" ,"testData4"},
                {"testData5" ,"testData6"}
        };
    }

    @DataProvider
    public Object [][] getExcelFileTestData(){
        // write java code to ready excel file ; poi.jar
        return  null ;

    }
    @DataProvider
    public Object [][] getJSONTestData(){
        // write java code to ready .json file ;
        return  null ;

    }
}
