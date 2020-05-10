import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args)  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");	
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginBtn = driver.findElement(By.cssSelector(".btn_action"));
		loginBtn.click();
		driver.findElement(By.xpath("//select/option[@value='za']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory'][1]")).click();
	
		
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory'][last()]")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		
		// to remove
		driver.findElement(By.xpath("//button[contains(@class,'btn_secondary')][1]")).click();
		
		//c shopping
		driver.findElement(By.xpath("//div/a[@class='btn_secondary']")).click();
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory'][1]")).click();
		//driver.findElement(By.id("shopping_cart_container")).click();
		
		//driver.findElement(By.linkText("CHECKOUT")).click();*/
	}
}
		
	
		
	
