package frist_Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert2 {
	public static void main(String[]  args) throws InterruptedException{
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//a[contains(text(),\"Switch\")]")).click();;;
		driver.findElement(By.xpath("//a[contains(text(),\"Alert\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Alert with OK & Cancel \")]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"confirm box \")]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}
}
