package frist_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts3 {
	public static void main(String[]  args) throws InterruptedException{
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//a[contains(text(),'Switch')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Alert\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Alert with Textbox \")]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"prompt box \")]")).click();
		driver.switchTo().alert().sendKeys("puspha");
		driver.switchTo().alert().accept();
		
	}
}