package end;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	WebDriver driver;
	public loginPage(WebDriver driver)
		{
			this.driver=driver;	
		}

		By name= By.id("user_email");
		By pass=By.id("user_password");
		By submit=By.name("commit");
		By alert=By.cssSelector("[role='alert']");
	
	
	public WebElement name_id()
		{
			return driver.findElement(name);
		}
	public WebElement pass_id()
		{
			return driver.findElement(pass);
		}
	public WebElement submit()
		{
			return driver.findElement(submit);
		}
	public WebElement alert()
		{
			return driver.findElement(alert);
		}
}
