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
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

/**
 *
 * @author manju
 */
public class GoogleSearchTest {
    
    public GoogleSearchTest() {
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
        Options option= driver.manage();
        Window w=option.window();
        w.maximize();
        option.timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGoogleSearch()
    {
        
        driver.get("https://www.google.com/");
        By by=By.name("q");
        driver.findElement(by);
        WebElement e=driver.findElement(by);
        e.sendKeys("selenium jobs");
        e.submit();
        String title=driver.getTitle();
        assertTrue(title.contains("selenium jobs"));
    }
    
   @Test
public void testNavigation(){
Navigation nav=driver.navigate();

nav.to("http://www.itexps.com");
nav.to("http://google.com");
nav.to("www.itexps.com");
nav.back();
nav.forward();


}}
