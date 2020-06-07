/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learningselenium.seleniumapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author manju
 */
public class DriverUtils1 {
    
    public static WebDriver getChromeDriver(){
         System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
         return new ChromeDriver();
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      getChromeDriver();
    }
    
}
