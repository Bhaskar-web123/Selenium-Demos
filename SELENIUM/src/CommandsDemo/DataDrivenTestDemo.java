package CommandsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTestDemo
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("E:\\DataDrivenTestData\\DataDriven.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb1.getSheetAt(0);
		int rowcnt=sheet1.getLastRowNum();
		for(int i=0;i<=rowcnt;i++)
		{
			String username=sheet1.getRow(i).getCell(0).getStringCellValue();
			String password=sheet1.getRow(i).getCell(1).getStringCellValue();
			driver.get("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		}
		System.out.println("Over.....");	
	}
}
