import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.logging.Logs;


public class GetComicChrome{

	public WebDriver driver;
	private Logs logs; 
	
	String chrome_driver_location = "F:/chromedriver_win32/chromedriver.exe";
	public GetComicChrome(){

		System.setProperty("webdriver.chrome.driver", "F:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	public void VisitPage(String url){
		
		driver.navigate().to(url);
		try {
			Thread.sleep(15000);
			
			driver.findElement(By.id("skip_button")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}

		//System.out.println(driver.getCurrentUrl());
	}
	
	
}
