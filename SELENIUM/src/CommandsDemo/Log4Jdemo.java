
package CommandsDemo;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4Jdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger(Log4Jdemo.class);
	System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		log.info("Application started successfully");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		log.warn("Check Title");
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Correct Title");
			log.info("Correct Page");
			driver.close();
		}
		else
		{
			System.out.println("Incorrect Title");
			
		}
	}

}
