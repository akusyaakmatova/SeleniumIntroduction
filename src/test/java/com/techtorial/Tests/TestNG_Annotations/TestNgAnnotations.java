package com.techtorial.Tests.TestNG_Annotations;

import org.testng.annotations.*;

public class TestNgAnnotations {

    @Test(priority = 1)
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("This is test 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println( "This is before class");
    }


    @AfterClass
    public void afterClass(){
        System.out.println( "This is after class");
    }
}
