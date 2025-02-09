package urlOpen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation_Commands {
	public static void main (String[]args) throws InterruptedException{
		System.out.println("project folder" + System.getProperty("user.dir"));
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com/jcms/apps/myjio/");Thread.sleep(2000);
		//navigation commands
		driver.navigate().to("https://www.linkedin.com/login");Thread.sleep(2000);System.out.println("navigated");
		driver.navigate().back();Thread.sleep(2000);System.out.println("navigate backward");
		driver.navigate().forward();Thread.sleep(2000);System.out.println("navigate forward");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("hello");Thread.sleep(2000);System.out.println("text entered");
		driver.navigate().refresh();Thread.sleep(2000);System.out.println("after entering site was refreshed");
	}
}
