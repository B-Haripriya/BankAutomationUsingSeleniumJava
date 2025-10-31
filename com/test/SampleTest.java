package com.test;

//package com.bank.tests;

//public class SampleTest {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
  public static void main(String[] args) {
      // Set ChromeDriver path
      System.setProperty("webdriver.chrome.driver",
              "D:\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

      // Initialize driver
      WebDriver driver = new ChromeDriver();

      // Maximize window
      driver.manage().window().maximize();

      // Open demo site
      driver.get("https://demo.guru99.com/V4/");

      // Print title
      System.out.println("Page Title: " + driver.getTitle());

      // Close browser
      driver.quit();
  }
}
