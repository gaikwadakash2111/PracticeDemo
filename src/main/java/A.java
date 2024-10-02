

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class A {

	@Test
	public void m1() throws InterruptedException {
		
	
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://login.salesforce.com/?locale=in");

	        Thread.sleep(3000);

	        System.out.println(driver.getCurrentUrl());

	        System.out.println(driver.getTitle());
	        
	        Thread.sleep(6000);

	        driver.quit();
	}

}
