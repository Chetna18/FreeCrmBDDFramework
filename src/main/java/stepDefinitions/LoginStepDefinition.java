package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on Login page$")
	public void user_is_already_on_login_page(){
		//System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\chetn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.crmpro.com/");
		}
	
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
		}
	// REg exp:
	//1 \"([^\"]*)\"
	//2 \"(.*)\" 
	@Then("^user enters \"(.*)\" and \"(.*)\" $")
	public void user_enters_username_and_password(String username, String password){
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].click();", loginBtn);*/
	
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String title = driver.getTitle();
		System.out.println("Home page title is:" + title);
		Assert.assertEquals("CRMPRO", title);
	}
	    
	
	
	
	
	
	

}
