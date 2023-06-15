package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectPreCondition {
	public ChromeDriver driver;
	public static WebDriverWait wait;
	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		try {
		driver.get("https://adactinhotelapp.com/");
		}catch(Exception e) {System.out.println(e);}

	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
