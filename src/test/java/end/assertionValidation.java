package end;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;

public class assertionValidation extends base{
	public WebDriver driver;

	@BeforeTest
	public void start () throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void validation() throws IOException
	{
		
		qaHomePage home=new qaHomePage(driver);
		home.title().getText();
		//Assert.assertEquals(home.title().getText(), "FEATURED COURSES");
		Assert.assertTrue(home.title().getText().contains("FEATURED1 COURSES"));
		//Assert.assertFalse(home.title().getText().contains("FEATURED COURSES"));
		
	}
	
}
