package frist_Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class iframes {
	public static void main(String[]  args) throws InterruptedException{
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("SingleFrame");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("srikar"); 
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[contains(text(),\" an Iframe\")]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"))); 
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("chittipanthula");
		driver.switchTo().parentFrame();
		//driver.switchTo().frame("SingleFrame");
		driver.navigate().to("https://www.facebook.com/");	
		}
}
