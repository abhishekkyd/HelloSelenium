package com.helloselenium.selenium;

//java io package import
import java.io.File;

//selenium webdriver import
import org.openqa.selenium.WebDriver;
//selenium chromedriver import
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Abhishek Yadav
 */

public class OpenGoogle {
	//defining a variable 'url' for base webpage url as a type 'String'
	public static String url = "http://www.google.com";

	public static void main(String[] args) {
		//setting up a system property for localtion of 'chromedriver.exe' which can used by 'ChromeDriver'
		System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getAbsolutePath());

		//defining a variable 'driver' for 'ChromeDriver' to open Google Chrome web browser as a type 'WebDriver'
		WebDriver driver = new ChromeDriver();
		//maximizing the Google Chrome web browser
		driver.manage().window().maximize();
		//opening the base webpage url which we defined earlier as 'url'
		driver.get(url);
		//closing all the instance of 'WebDriver'
		driver.quit();
	}

}