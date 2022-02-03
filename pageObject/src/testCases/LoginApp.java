package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepository.HomePage;
//import objectRepository.RediffLoginPage;
import objectRepository.Rediff;

public class LoginApp {
	
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/yathi/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//RediffLoginPage rd = new RediffLoginPage (driver);
		Rediff rd = new Rediff(driver);
		Actions a = new Actions(driver);
		
		rd.Email().sendKeys("gowthamraj.s");
		rd.password().sendKeys("Qwer123jb@");
		rd.signIn().click();
		
		HomePage rh = new HomePage (driver);
		driver.navigate().to("https://www.rediff.com/");
		
		a.moveToElement(rh.search()).click().keyDown(Keys.SHIFT).sendKeys("books").build().perform();
		 
		 rh.find().click();
}
}
