package jenkinsPractise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsPractise {
     public static WebDriver driver;
	
	@Test(priority=1)
	public void login() {
         System.out.println("Login");
         driver=new ChromeDriver();
         driver.get("https://freelance-learn-automation.vercel.app/login");
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		driver.manage().window().maximize();
 		driver.quit();
         
	}

	
	@Test(priority=2)
	public void operation() {
		 System.out.println("operation");
	}

	@Test(priority=3)
	public void logout() {
		 System.out.println("Logout");
	}
	
	@Test(priority=4)
	public void payment() {
		System.out.println("payment");
	}

}
