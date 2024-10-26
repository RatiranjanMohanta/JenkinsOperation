package jenkinsPractise;

import org.testng.annotations.Test;

public class JenkinsPractise {

	
	@Test(priority=1)
	public void login() {
         System.out.println("Login");
	}

	
	@Test(priority=2)
	public void operation() {
		 System.out.println("operation");
	}

	@Test(priority=3)
	public void logout() {
		 System.out.println("Logout");
	}

}
