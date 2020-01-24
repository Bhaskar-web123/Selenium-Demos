package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechMethods
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver..driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		boolean chpres=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(chpres);
		boolean chenable=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(chenable);
		if(chpres==true && chenable==true)
		{
			driver.findElement(By.id("Email")).sendKeys("bhaskarakula00@gmail.com");
		}
		boolean chprespass=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(chprespass);
		boolean chenablepass=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(chenablepass);
		if(chprespass==true && chenablepass==true)
		{
			driver.findElement(By.id("Password")).sendKeys("bhasu@1987");
		}
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}

}
