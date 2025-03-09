package frist_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[]  args) throws InterruptedException{
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );;
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//a[contains(text(),'Switch')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Alert\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Alert with OK\")]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"alert box\")]")).click();;
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		

	}

}
