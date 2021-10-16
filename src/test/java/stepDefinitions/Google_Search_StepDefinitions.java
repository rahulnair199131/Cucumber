package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Google_Search_StepDefinitions {
	
	WebDriver driver;
	
	@When("the user opens up the browser and navigates to google.com")
	public void the_user_opens_up_the_browser_and_navigates_to_google_com() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\New_Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	}

	@When("searches for laptops")
	public void searches_for_laptops() {
		
		driver.findElement(By.name("q")).sendKeys("Laptop");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	    
	}

	@SuppressWarnings("deprecation")
	@Then("the user should be displayed results that match laptops")
	public void the_user_should_be_displayed_results_that_match_laptops() {
		
		boolean flag = false;
		
		String text = driver.findElement(By.xpath("//span[@class='pymv4e']")).getText();
		
		System.out.println("The first text is "+text);
		
		
	   
	}
	
	

}
