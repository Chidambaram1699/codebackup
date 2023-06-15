package util;

import java.time.Duration;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("src")).sendKeys("Chennai",Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("Bangalore",Keys.ENTER);
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td")).click();
		WebElement search = driver.findElement(By.xpath("//button[@id='search_btn']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(search).click().perform();
//		search.click();
		//driver.executeScript("arguments[0].click()",search);
		Thread.sleep(5000);
//		LinkedList<Integer> list=new LinkedList<Integer>();
//		list.add(01);
		
		
	}

}
