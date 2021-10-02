package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.drive",  "chrome.drive");
		
	 WebDriver driver =new ChromeDriver();
	 //WebDriver driver1 =new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		
		WebElement LoginLink=driver .findElement(By.linkText("Log in"));
		LoginLink.click();
		
		WebElement UserName =driver .findElement(By.name("User_login"));
		UserName.sendKeys("kashvini@cisco.com");
		
		WebElement Password =driver.findElement(By.id("password"));
		Password.sendKeys("Abc@12345");
		WebElement LoginButton = driver.findElement(By.name("btn _login"));
		LoginButton.click();
		
		WebElement Forgotpass =driver.findElement(By.partialLinkText("Forgot"));
		Forgotpass.click();
		Thread.sleep(5000);
		
		driver.quit();
	
		

	}

}
