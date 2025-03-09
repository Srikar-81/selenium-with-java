package frist_Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Accordian {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+" //drivers.chromedriver.exe" );
		WebDriver drive=new ChromeDriver();
		drive.get("https://demo.automationtesting.in/Accordion.html");
		int i=drive.findElements(By.tagName("iframe")).size();
		String web=drive.findElement(By.xpath("(//div[@class=\"panel-body\"])[1]")).getText();
		System.out.println(web);
		String web2=drive.findElement(By.xpath("(//div[@class=\"panel-body\"])[2]")).getText();
		System.out.println(web2);
		String web3=drive.findElement(By.xpath("(//div[@class=\"panel-body\"])[3]")).getText();
		System.out.println(web3);
		String web4=drive.findElement(By.xpath("(//div[@class=\"panel-body\"])[4]")).getText();
		System.out.println(web4);
	}

}
