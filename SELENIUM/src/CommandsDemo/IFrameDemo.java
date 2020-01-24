package CommandsDemo;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo
{

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		List<WebElement>iFramesCnt=driver.findElements(By.tagName("iframe"));
		System.out.println("No of Frames:"+iFramesCnt.size());
		for(int i=0;i<iFramesCnt.size();i++)
		{
			System.out.println(iFramesCnt.get(i).getAttribute("name"));
		}
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame1);
		//Enter the value into the textBox inside Frame
		WebElement textbox=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox.sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		WebElement secondtab=driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		secondtab.click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		WebElement textbox2=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox2.sendKeys("WebDriver");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		Thread.sleep(3000);
		driver.close();
	}
}