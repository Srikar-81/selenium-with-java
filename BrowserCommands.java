package urlOpen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserCommands {
	public static void main(String[]args)throws InterruptedException {
		System.out.println("PROJECT FOLDER : " + System.getProperty("user.dir"));
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" "
				+ "//drivers.chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://passwords-generator.org/");
		System.out.println("title = "+ driver.getTitle());
		System.out.println("current url = " +driver.getCurrentUrl());
		driver.quit();
	}
}













