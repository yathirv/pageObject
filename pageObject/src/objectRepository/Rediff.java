package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediff {
		
		WebDriver driver;
		public Rediff (WebDriver localdriver) //constractor
		{
			this.driver = localdriver ;
			PageFactory.initElements(localdriver,this);
		}
		
		/*
		 * By username = By.xpath("//input[@id='login1']"); By password =
		 * By.xpath("//input[@id='password']"); By name = By.name("proceed");
		 */
		
		@FindBy(xpath=".//*[@id='login1']")
		WebElement username;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		@FindBy(name = "proceed" )
		WebElement name;
		
		
		
		public WebElement Email()
		{
			return username;
		}
		
		public WebElement password()
		{
			return password;
		}
		
		public WebElement signIn()
		{
			return name;
		}

}
