package com.cydeo.tests.day5_testNG_intro_dropdows;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
    public void setUpClass(){
        System.out.println("beforeClass is running");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("AfterClass is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("aftermethod is running");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("test 1 is running...");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));

}







    @Test(priority = 2)
    public void test2(){
        System.out.println("test 2 is running...");
    }






}
