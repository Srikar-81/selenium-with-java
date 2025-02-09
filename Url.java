package urlOpen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Url {
	public static void main(String[] args) {
		System.out.println("project folder" + System.getProperty("user.dir"));
		System.setProperty("webDriver.chrome.driver", 
				System.getProperty("user.dir")+"//Drivers//chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
	}
}
