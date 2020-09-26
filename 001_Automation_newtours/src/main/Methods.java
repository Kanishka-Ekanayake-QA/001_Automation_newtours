package main;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.events.EventException;


public class Methods {
	
	public static WebDriver driver;

		public static void Registerinfo() {
			//Register Information
			try
			{
				
			driver.findElement(By.name("firstName")).sendKeys("Test");
			driver.findElement(By.name("lastName")).sendKeys("LastName");
			driver.findElement(By.name("phone")).sendKeys("123456789");
			driver.findElement(By.id("userName")).sendKeys("test@test.com");
			driver.findElement(By.name("address1")).sendKeys("Main Street");
			driver.findElement(By.name("city")).sendKeys("NewYork");
			driver.findElement(By.name("state")).sendKeys("NewYork");
			driver.findElement(By.name("postalCode")).sendKeys("14858");
			Select objSelect =new Select(driver.findElement(By.name("country")));
			objSelect.selectByValue("ANGUILLA");
			driver.findElement(By.name("email")).sendKeys("test@test13.com");
			driver.findElement(By.name("password")).sendKeys("123456");
			driver.findElement(By.name("confirmPassword")).sendKeys("123456");
			driver.findElement(By.name("submit")).click();
			}
			
			catch(EventException e)
			{
				System.out.println(e);
				return;
			}
		
		}
		

		public static void RegValidate() {
			//Registration Validate method
			try
			{
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
				System.out.println("Registration Success");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Registration fail");
			}
			
		}
		
		public static void logout() {
			//Logout method
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		}
		
		public static void login() {
			//Login method
			System.out.println("Registration fail");
			driver.findElement(By.name("userName")).sendKeys("test@test12.com");
			driver.findElement(By.name("userName")).sendKeys("123456");
			driver.findElement(By.name("submit")).click();
		}

		public static void closevideo() {
			//Pop-up Video close method
			try
			{	
				driver.switchTo().frame("flow_close_btn_iframe");
				driver.findElement(By.id("closeBtn")).click();
				System.out.println("Pop-up video screen Successfully closed");
				driver.switchTo().defaultContent();
			}
			
			catch(NoSuchFrameException e)
			{
				System.out.println(e.toString()+"Fail");
			}
		}

}