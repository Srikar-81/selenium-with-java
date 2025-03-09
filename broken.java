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
public class broken {
	static WebDriver driver5;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Project Folder   "+System.getProperty("user.dir"));
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );
		driver5=new ChromeDriver();
		driver5.manage().window().maximize();
		takeScreeShot(driver5,"before url");
		driver5.get("https://www.flipkart.com/");
		takeScreeShot(driver5,"Home");
		driver5.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("mobiles");
		takeScreeShot(driver5,"mobiles");
		Thread.sleep(2000);
		driver5.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		takeScreeShot(driver5,"search");
		List<WebElement> links=driver5.findElements(By.tagName("link"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			WebElement flipkatlink=links.get(i);
			String url=flipkatlink.getAttribute("href");
			URL urls=new URL(url);
			HttpsURLConnection httpConn=(HttpsURLConnection)urls.openConnection();
			httpConn.connect();
			int resposneCode=httpConn.getResponseCode();
			if(resposneCode==200) {
				System.out.println(url+" -----------   correct URL"+"  Response Code  :"+resposneCode+"  Resposne Msg : "+httpConn.getResponseMessage());	
			}else{

				System.out.println(url+" -----------   Bad URL"+"  Response Code  :"+resposneCode+"  Resposne Msg : "+httpConn.getResponseMessage());
			}
		}

		System.out.println("Done.....");
		driver5.quit();
	}
	public static void takeScreeShot(WebDriver wd,String img) throws IOException {
		File ss=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		Files.copy(ss.toPath(), Path.of(System.getProperty("user.dir")+"//Screenshot//"+img+".png"), StandardCopyOption.REPLACE_EXISTING);
	}

}