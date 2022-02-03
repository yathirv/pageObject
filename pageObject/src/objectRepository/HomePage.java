package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;

	public HomePage (WebDriver LowDriver)
	{
		this.driver = LowDriver;

	}
	By search = By.xpath("//input[@id='srchword']");
	By find = By.xpath("//input[@type='submit'][1]");
	
	
	public WebElement search()
	{
		return driver.findElement(search);
	}
	
	public WebElement find()
	{
		return driver.findElement(find);
	}
	

}
