package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.dash.generic.Baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
@Test
public void test() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	System.out.println("by by...");
}
}
