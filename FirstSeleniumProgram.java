package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.safari.*;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumProgram {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.safari.driver","/usr/bin/safaridriver");
		WebDriver driver = new SafariDriver();
		
		String baseUrl = "https://www.snowflake.com/";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		
		try {
			
		
		WebElement register = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/a"));
		
		register.click();
		
		
		
		Thread.sleep(2000);
		
		String currenturl = driver.getCurrentUrl();
		String pageTitle = driver.getTitle();
		
		System.out.println("the control driver is on this url now*********--->" + currenturl);
		System.out.println("we are right now on ------>"+ pageTitle);
		
		
		System.out.println("first point of stop");
		
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		
		System.out.println("second point of stop");
		
		
		WebElement lastName = driver.findElement(By.id("LastName"));
		
		System.out.println("third point of stop");
		
		WebElement jobFunction = driver.findElement(By.id("Job_Function__c"));
		
		System.out.println("4th point of stop");
		WebElement company = driver.findElement(By.id("Company"));
		
		System.out.println("5th point of stop");
		WebElement emailId = driver.findElement(By.id("Email"));
		
		System.out.println("6th point of stop");
		WebElement phone = driver.findElement(By.id("Phone"));
		
		System.out.println("sevent point of stop");
		
		
		Select dropDownForCounty = new Select(driver.findElement(By.id("Country")));
		System.out.println("8th point of stop");
		Select dropDownForWorkLoad = new Select(driver.findElement(By.id("Comments__c")));
		
		System.out.println("9th point of stop");
		
		firstName.sendKeys("Ram");
		lastName.sendKeys("Gobburu");
		jobFunction.sendKeys("Testing");
		company.sendKeys("HTC");
		emailId.sendKeys("ramjee.chaitanya@gmail.com");
		phone.sendKeys("3098267524");
		
		System.out.println("9th point of stop");
		
		dropDownForCounty.selectByIndex(0);
		Thread.sleep(1000);
		
		System.out.println("10th point of stop");
		
		Select stateDropDown = new Select(driver.findElement(By.id("State")));
		
		System.out.println("11th point of stop");
		
		stateDropDown.selectByIndex(14);
		
		System.out.println("12th point of stop");
		
		dropDownForWorkLoad.selectByIndex(3);
		
		System.out.println("13th point of stop");
		
		
		WebElement registerNow = driver.findElement(By.xpath("//*[@id=\"mktoForm_8459\"]/div[25]/span/button"));
		
		System.out.println("14th point of stop");
		
		registerNow.click();
		
		System.out.println("15th point of stop");
		
		
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
