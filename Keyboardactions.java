package frist_Program;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Keyboardactions {
	public static void main (String[]args) throws InterruptedException{
	System.out.println("project folder" + System.getProperty("user.dir"));
	System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	Actions actions=new Actions(driver);
	WebElement wd =driver.findElement(By.xpath("//textArea[@ng-model=\"Adress\"]"));
	WebElement fn =driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]"));
	WebElement ln =driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]"));
	wd.sendKeys("puspha the rule");
	actions.click(wd).keyDown(wd,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	actions.click(fn).keyDown(fn,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	actions.click(ln).keyDown(ln,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	actions.click(wd).keyDown(wd,Keys.BACK_SPACE).build().perform();
	}
}
