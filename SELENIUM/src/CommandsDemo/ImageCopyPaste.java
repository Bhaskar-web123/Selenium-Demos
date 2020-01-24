package CommandsDemo;

import java.awt.AWTException;
import java.awt.Robot;
//import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageCopyPaste
{

	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.setAutoDelay(3000);
		driver.findElement(By.id("imagesrc")).click();
		//StringSelection string=new StringSelection("C:\\Users\\IBM\\Pictures\\Camera Roll");
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
