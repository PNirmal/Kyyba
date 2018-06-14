package medhok.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import medhok.testBase.TestBase;

public class HomePage extends TestBase {
		
	WebElement medhokLogo=driver.findElement(By.xpath("//*[@class='logo']/img"));
	
	WebElement linkAboutMedhok=driver.findElement(By.xpath("//*[@id='hs_menu_wrapper_module_144649632555230793']/ul/li[6]/a"));
	
	List<WebElement> lis=driver.findElements(By.xpath("//*[@id='hs_menu_wrapper_module_144649632555230793']/ul/li[6]/ul/li/a"));
	

	//Medhok Logo Verificatio	
	public boolean validateMedhoLogo(){
		
		return medhokLogo.isDisplayed();
	}
	
	//Medhok Link Verification
	public boolean validateAboutMedhokLink(){
	
		return linkAboutMedhok.isDisplayed();
	}
	
	//AboutMedhok drodown list verification
	public void dropdownAboutMedhok(){
	
			Actions action = new Actions(driver);
			action.moveToElement(linkAboutMedhok).build().perform();
			
			int len=lis.size();
			System.out.println(len);
			
			String[] dropdown={"Management Team", "Certifications", "Culture", "Careers", "Contact Us", "Service Terms"};
			
			for(int i=0;i<len;i++)
			{
				System.out.println(lis.get(i).getText());
				Assert.assertEquals(lis.get(i).getText(), dropdown[i]);
				
			}
			System.out.println("Dropdown validation is success");
		
		}
	
	//Address and Email verification	
	public void validateContactUs() throws InterruptedException{
		
		Actions action = new Actions(driver);
		action.moveToElement(linkAboutMedhok).build().perform();
		
		int len1=lis.size();
		System.out.println(len1);
		for(int i=0;i<len1;i++)
		{
		
			if(lis.get(i).getText().contains("Contact Us"))
			{
				System.out.println(lis.get(i).getText());
				lis.get(i).click();
				Thread.sleep(5000);
			//Address verification
			String expectedaddress="5550 W. Idlewild Avenue, Suite 150 Tampa, FL 33634 ";
			String address=driver.findElement(By.xpath("//*[@id='hs_cos_wrapper_module_14507137349871582']/p[1]")).getText();
			System.out.println(address);
			Assert.assertEquals(address, expectedaddress);
			System.out.println("Address validation is success");
			
			//Email verification
			String expecteemail="Hello@medhok.com";
			String email=driver.findElement(By.xpath("//*[@id='hs_cos_wrapper_module_14507137349871582']/p[2]/a")).getText();
			System.out.println(email);
			Assert.assertEquals(email, expecteemail);
			System.out.println("Emial validation is success");
		
			break;		
			}
		
		}
	}
	
	//Menu verifications
		public void validateManagementTeam() throws InterruptedException{
			
			Actions action = new Actions(driver);
			action.moveToElement(linkAboutMedhok).build().perform();
			
			int len1=lis.size();
			System.out.println(len1);
			for(int i=0;i<len1;i++)
			{
			
				if(lis.get(i).getText().contains("Management Team"))
				{
					System.out.println(lis.get(i).getText());
					lis.get(i).click();
					String title=driver.getTitle();
					System.out.println(title);
					String managementTeam="MedHOK Executive and Management Team";
					Assert.assertEquals(title, managementTeam);
					System.out.println("ManagementTeam successfully verified");
					break;
				}
			}
		}
		
			public void validateCertifications() throws InterruptedException{
				
				Actions action = new Actions(driver);
				action.moveToElement(linkAboutMedhok).build().perform();
				
				int len1=lis.size();
				System.out.println(len1);
				for(int i=0;i<len1;i++)
				{
				if(lis.get(i).getText().contains("Certifications"))
				{
					System.out.println(lis.get(i).getText());
					lis.get(i).click();
					
					
					String title=driver.getTitle();
					System.out.println(title);
					String certifications="Certifications & Awards";
					Assert.assertEquals(title, certifications);
					System.out.println("Certifications successfully verified");
					break;
				}
			}
		}
			
			public void validateCulture() throws InterruptedException{
				
				Actions action = new Actions(driver);
				action.moveToElement(linkAboutMedhok).build().perform();
				
				int len1=lis.size();
				System.out.println(len1);
				for(int i=0;i<len1;i++)
				{
				if(lis.get(i).getText().contains("Culture"))
				{
					System.out.println(lis.get(i).getText());
					lis.get(i).click();
					
					
					String title=driver.getTitle();
					System.out.println(title);
					String Culture="MedHOK Culture";
					Assert.assertEquals(title, Culture);
					System.out.println("Culture successfully verified");
					break;
				}
			}
		}
			
			
			public void validateCareers() throws InterruptedException{
				
				Actions action = new Actions(driver);
				action.moveToElement(linkAboutMedhok).build().perform();
		
				int len1=lis.size();
				System.out.println(len1);
				for(int i=0;i<len1;i++)
				{
					if(lis.get(i).getText().contains("Careers"))
					{
						System.out.println(lis.get(i).getText());
						lis.get(i).click();
						String title=driver.getTitle();
						System.out.println(title);
						String Careers="Careers with MedHOK";
						Assert.assertEquals(title, Careers);
						System.out.println("Careers successfully verified");
						break;
					}
				}
	}
			
			public void validateServiceTerms() throws InterruptedException{
				
				Actions action = new Actions(driver);
				action.moveToElement(linkAboutMedhok).build().perform();
				
				int len1=lis.size();
				System.out.println(len1);
				for(int i=0;i<len1;i++)
				{
				if(lis.get(i).getText().contains("Service Terms"))
				{
					System.out.println(lis.get(i).getText());
					lis.get(i).click();
					
					
					String title=driver.getTitle();
					System.out.println(title);
					String serviceTerms="Terms of Service & Privacy Policy";
					Assert.assertEquals(title, serviceTerms);
					System.out.println("Service Terms successfully verified");
					break;
				}
			}
		}

}
		
	
	


