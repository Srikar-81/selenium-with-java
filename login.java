package urlOpen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("project folder" + System.getProperty("user.dir"));
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("iamfacebook@gmail.com");Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password000");Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		System.out.println("email and password entered");
		

}
}