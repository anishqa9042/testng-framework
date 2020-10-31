package com.anish.demo;

import org.apache.hc.core5.reactor.Command;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

@Test(priority = 1,testName = "Login test" )
    public void loginWithValidUser(){
        System.out.println("Login test with valid user and password");
        String exp="Hello";
        String act= "Hello";
        Assert.assertEquals(act,exp, "The words don't match");
    }
    @Test(priority = 4)
    public void loginWithInvalidUser(){ System.out.println("Login test with invalid user");}
    @Test(priority = 3)
    public void homePageTest(){
        System.out.println("This is a home page test");
    }
    @Test(priority = 2)
    public  void logOutTest(){
        System.out.println("This is a logout test");
    }
}
