package end;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qaHomePage {


	WebDriver driver;
	public qaHomePage(WebDriver driver)
	{
		this.driver=driver;	
	}


	By signin= By.cssSelector("[href='https://rahulshettyacademy.com/sign_in/']");
	By title=By.cssSelector("#content > div:nth-child(1) > div:nth-child(1)");



	public WebElement signIn()
	{
		return driver.findElement(signin);
	}
	public WebElement title()
	{
		return driver.findElement(title);
	}
}
