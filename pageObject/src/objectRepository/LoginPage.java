package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
		
		WebDriver driver;
		public LoginPage (WebDriver localdriver) //constractor
		{
			this.driver = localdriver ;
		}
		
		By username = By.xpath("//input[@id='login1']");
		By password = By.xpath("//input[@id='password']");
		By name = By.name("proceed");
		
		public WebElement Email()
		{
			return driver.findElement(username);
		}
		
		public WebElement password()
		{
			return driver.findElement(password);
		}
		
		public WebElement signIn()
		{
			return driver.findElement(name);
		}

}
