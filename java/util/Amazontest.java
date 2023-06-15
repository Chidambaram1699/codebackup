package util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontest {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		String text1 = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]/span[1]")).getText();
		int num1=Integer.parseInt(text1.substring(8).replaceAll("[^0-9]", ""));
		System.out.println(num1);
		driver.findElement(By.xpath("//li[@aria-label='American Tourister']/span")).click();
		driver.findElement(By.xpath("//span[text()='See more']")).click();
		driver.findElement(By.xpath("//li[@aria-label='Generic']/span")).click();
		String text2 = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]/span[1]")).getText();
		int num2=Integer.parseInt(text2.substring(8).replaceAll("[^0-9]", ""));
		System.out.println(num2);
		if(num1>num2) {
			System.out.println("brands applied");
		}else {
			System.out.println("not applied");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']")).getText();
		System.out.println(text);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destin=new File("./snaps/img.png");
		FileUtils.copyFile(source, destin);
		driver.close();
		

	}

}
