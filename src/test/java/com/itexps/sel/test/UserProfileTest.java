/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.sel.test;

import com.learningselenium.seleniumapp.DriverUtils1;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author manju
 */
public class UserProfileTest {
    
    public UserProfileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    WebDriver driver;
    @Before
    public void setUp() {
         
         driver = DriverUtils1.getChromeDriver();
        WebDriver.Options option= driver.manage();
        WebDriver.Window w=option.window();
        w.maximize();
        option.timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
    }
//
//    @Test
//    public void testUserProfile(){
// driver.get("file:///C:/Users/manju/Documents/user%20profile.html");
////        driver.findElements(By.tagName("input")).get(1).sendKeys("abc");
////        driver.findElements(By.tagName("input")).get(0).sendKeys("xyz");
////         driver.findElements(By.tagName("input")).get(4).click();
////         //driver.findElements(By.tagName("input")).get(1).getTagName();
////         
//         WebElement e=driver.findElement(By.tagName("select"));
//         new Select(e).selectByVisibleText("PhD");
         
         
   // }
    @Test
    public void testProfileRadio(){
        
        driver.get("file:///C:/Users/manju/Documents/user%20profile.html");
        //driver.findElements(By.name("g").get(1).click());
    }
    }
    

