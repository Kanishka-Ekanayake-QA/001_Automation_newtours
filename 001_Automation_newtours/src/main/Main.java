package main;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main extends Methods {

	
	public static void main(String[] args){
		//Set property
		System.setProperty("webdriver.chrome.driver", "D:\\2.Developments\\Drivers\\chromedriver.exe");
		//Define new Chrome driver
		driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Set site URL
		driver.get("http://demo.guru99.com/test/newtours/");
		//Wait for 40s
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Set xpath
		By Register = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
		//Click the Register link
		driver.findElement(Register).click();
		//Wait for 40s
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Call close video method
		Methods.closevideo();
		//Call Registerinfo method
		Methods.Registerinfo();
		//Call RegValidate method
		Methods.RegValidate();
		//Call logout method
		Methods.logout();
		//Base.closevideo();
		//Base.closevideo();
		//Call login method
		Methods.login();
		
		
	}

}
