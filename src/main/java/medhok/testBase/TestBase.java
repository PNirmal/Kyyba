package medhok.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



import medhok.util.TestUtil;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\medhok\\config\\App.properties");
		    prop.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		public static void initialization()
		{
			String browsername=prop.getProperty("browser");
			
			if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\resources\\java\\drivers\\geckodriver.exe");
				//System.setProperty("webdriver.gecko.driver","C:\\Automation\\S3.8\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			/*else if (browsername.equals("chrome"))
			{
				//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\resources\\java\\drivers\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver","C:\\Automation\\S3.8\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}*/
			
			
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLITITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(TestUtil.SET_SCRIPT_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
}
	

}
