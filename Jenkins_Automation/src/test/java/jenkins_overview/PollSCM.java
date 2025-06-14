package jenkins_overview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PollSCM {
	@Test
	public void poll()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		Reporter.log("POLL SCM has been trigerred in Jenkins",true);
	}
}
