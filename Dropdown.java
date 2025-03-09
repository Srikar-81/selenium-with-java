package frist_Program;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {
	public static void main (String[]args) throws InterruptedException{
		System.out.println("info"+ System.getProperty("user.dir"));
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement skill=driver.findElement(By.id("Skills"));
		Select skillset = new Select(skill);
		skillset.selectByIndex(2);
		skillset.selectByIndex(3);
		skillset.selectByValue("Android");
		skillset.selectByValue("AutoCAD");
		
		
		WebElement country=driver.findElement(By.id("country"));
		Select countydrop = new Select(country);
		List<WebElement> countydropOpt=countydrop.getOptions();
		for (WebElement Option : countydropOpt ) {
			System.out.println(Option.getText());
		}
		countydrop.selectByIndex(5);
		Thread.sleep(1000);
		countydrop.selectByValue("Japan");
		Thread.sleep(1000);
		countydrop.selectByVisibleText("New Zealand");
		
		
	}

}
