package end;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;

public class assertionLog4J extends base{
	WebDriver driver;
	@Test
	public void validation() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		qaHomePage home=new qaHomePage(driver);
		home.title().getText();
		//Assert.assertEquals(home.title().getText(), "FEATURED COURSES");
		Assert.assertTrue(home.title().getText().contains("FEATURED COURSES"));
		//Assert.assertFalse(home.title().getText().contains("FEATURED COURSES"));
		driver.close();
	}
	
}
