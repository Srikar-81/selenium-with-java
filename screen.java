package frist_Program;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class screen {
	static WebDriver driver5;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Project Folder   "+System.getProperty("user.dir"));
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );
		driver5=new ChromeDriver();
		driver5.get("https://www.flipkart.com/");
		takeScreeShot(driver5,"Home");
		driver5.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("mobiles");
		driver5.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println("Done.....");
		driver5.quit();
	}
	public static void takeScreeShot(WebDriver wd,String img) throws IOException {
		File ss=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		Files.copy(ss.toPath(), Path.of(System.getProperty("user.dir")+"//Screenshot//"+img+".png"), StandardCopyOption.REPLACE_EXISTING);
	}
}