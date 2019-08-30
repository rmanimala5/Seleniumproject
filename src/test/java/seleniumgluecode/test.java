package seleniumgluecode;

import java.util.concurrent.TimeUnit;



import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {
	public static WebDriver driver;
	
	@Given("^user is google page$")
	public void user_is_google_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Standard\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");

	}

	@When("^search text is entered$")
	public void search_text_is_entered() throws Throwable {
		  driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("selenium",Keys.ENTER);
	
		
	  driver.findElement(By.partialLinkText("Selenium")).click();
	
	
	}

	@Then("^search result is validated$")
	public void search_result_is_validated() throws Throwable {
		 String actualvar =driver.getTitle();
			System.out.println(actualvar);	
		String Expected="Selenium - Web Browser Automation";
		
		Assert.assertEquals(Expected, actualvar);
		
		
		driver.quit();
		
	}
}
