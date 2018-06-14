package medhok.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import medhok.pages.HomePage;
import medhok.testBase.TestBase;

public class HomePageTest extends TestBase {
	
HomePage hp;

	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hp=new HomePage();
	}
	
	@Test(priority=1)
	public void logoTest() 
	{
		boolean flag = hp.validateMedhoLogo();
		Assert.assertTrue(flag);
		System.out.println("Medho Logo is present");	
	}
	
	@Test(priority=2)
	public void linkTest() 
	{
		boolean flag = hp.validateAboutMedhokLink();
		Assert.assertTrue(flag);
		System.out.println("Medho Link is present");	
	}
	
	@Test(priority=3)
	public void dropdownTest()
	{
		hp.dropdownAboutMedhok();
	}
	
	@Test(priority=4)
	public void contactusTest() throws Exception
	{
		hp.validateContactUs();
	}
	
	@Test(priority=5)
	public void managementteamMenuTest() throws Exception
	{
		hp.validateManagementTeam();
	}
	
	@Test(priority=6)
	public void certificationsMenuTest() throws Exception
	{
		hp.validateCertifications();
	}
	
	
	@Test(priority=7)
	public void cultureMenuTest() throws Exception
	{
		hp.validateCulture();
	}
	
	@Test(priority=8)
	public void careersMenuTest() throws Exception
	{
		hp.validateCareers();
	}
	
	@Test(priority=9)
	public void serviceTermsMenuTest() throws Exception
	{
		hp.validateServiceTerms();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
