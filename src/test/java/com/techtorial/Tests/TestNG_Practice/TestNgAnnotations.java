package com.techtorial.Tests.TestNG_Practice;

import org.testng.annotations.*;

public class TestNgAnnotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will execute before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This will execute after suit");
    }
    @BeforeTest
    public void beforeTest(){
    System.out.println("tjis will execute before test");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test(priority = 2, alwaysRun = true)
    public void test2(){
        System.out.println("This is test 2");
    }

    @Test(priority = 3, enabled = true)
    public void test3(){
        System.out.println("This is test 3");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will run after test");
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
        System.out.println( "This isgfgfgfgfggfgvcnbd  after class");
    }


}
