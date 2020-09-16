package end;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public Properties prop;
	public static WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		prop= new Properties();
		FileInputStream fis=new FileInputStream("/Users/gulzadaorozakunova/Desktop/Udemy/Workspase_Eclipse/end/src/main/java/base.properties");
		prop.load(fis);
		if(prop.getProperty("browser").contains("chrome"))
			{
 				System.setProperty("webdriver.chrome.driver", "/Users/gulzadaorozakunova/Desktop/Udemy/chromedriver");
 				driver= new ChromeDriver();
 				driver.manage().window().maximize();
 				//driver.get(prop.getProperty("url"));
			}
		if(prop.getProperty("browser").contains("firefox"))
			{System.setProperty("webdriver.chrome.driver", "/Users/gulzadaorozakunova/Desktop/Udemy/chromedriver");
		driver= new ChromeDriver();
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}	
}
