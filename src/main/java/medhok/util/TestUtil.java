package medhok.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import medhok.testBase.TestBase;

public class TestUtil extends TestBase {
	
	public static long IMPLITITLY_WAIT=30;
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long SET_SCRIPT_TIMEOUT=30;
	
	public static String takeScreenshot(long l) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir")+ "/errorScreenNG/" + l + System.currentTimeMillis()+ ".png";
		File destination=new File(destFile);
		FileUtils.copyFile(scrFile, destination);
		return destFile;
		
		}
	

}
