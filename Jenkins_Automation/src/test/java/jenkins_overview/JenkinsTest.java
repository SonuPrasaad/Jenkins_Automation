package jenkins_overview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
	@Test
	public void launch()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		Reporter.log("Empty browser has been launched in JenkinsTest class", true);
		
	}
}
