package frist_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main (String[]args) throws InterruptedException{
		System.out.println("project folder" + System.getProperty("user.dir"));
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		Actions actions=new Actions(driver);
		WebElement soc=driver.findElement(By.xpath("//img[@src=\"selenium.png\"]"));
		WebElement des=driver.findElement(By.xpath("//div[@id=\"droparea\"]"));
		actions.clickAndHold(soc).moveToElement(des).release().build().perform();
		driver.get("https://demo.automationtesting.in/Register.html");
		actions.doubleClick(driver.findElement(By.xpath("//label[contains(text(),\"Full\")]"))).build().perform();
		System.out.println("done");
		driver.get("https://demo.automationtesting.in/Register.html");
		actions.contextClick(driver.findElement(By.xpath("//label[contains(text(),\"Full\")]"))).build().perform();
		System.out.println("done");

		
		

	}  

}
