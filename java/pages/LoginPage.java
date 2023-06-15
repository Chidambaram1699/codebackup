package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.ProjectPreCondition;

public class LoginPage extends ProjectPreCondition{
	public LoginPage(ChromeDriver driver){
		this.driver=driver;
	}
	public LoginPage enterUsername(){
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))).sendKeys("chidambaram1699");			
		} catch (Exception e) {
			System.out.println("Unable to enter user name");
		}
		return this;
	}
	public LoginPage enterPassword(){
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("Chidambaram@12345");			
		} catch (Exception e) {
			System.out.println("Unable to enter password");
		}
		return this;
	}
	public HomePage clickLogin(){
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login"))).click();			
		} catch (Exception e) {
			System.out.println("Unable to click login button");
		}
		return new HomePage(driver);
	}
}
