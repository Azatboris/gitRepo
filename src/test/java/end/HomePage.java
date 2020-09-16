package end;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import end.base;

public class HomePage extends base{
	public WebDriver driver;


	
	
	
	@BeforeTest
	public void start() throws IOException
	{
		driver=initializeDriver();
	}
	@Test(dataProvider="getData")
	public void HomePagebase(String username, String password) throws IOException

	{
		driver.get(prop.getProperty("url"));

		qaHomePage signin=new qaHomePage(driver);
		loginPage login =new loginPage(driver);
		signin.signIn().click();
		login.name_id().clear();
		login.name_id().sendKeys(username);
		login.pass_id().sendKeys(password);
		login.submit().click();
			if(login.alert().getText().equalsIgnoreCase("Invalid email or password."))
				{
				System.out.println("Test successfully passed");
				}
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0]="aarabaev1@gmail.com";
		data[0][1]="123123123";
		data[1][0]="aara";
		data[1][1]="123123";
		return data; 		
	}
	@AfterTest
	public void close ()
	{
		driver.close();

	}
	
}
