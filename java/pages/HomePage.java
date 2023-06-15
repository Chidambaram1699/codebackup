package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.ProjectPreCondition;

public class HomePage extends ProjectPreCondition{

	 HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	 public HomePage selectLocation() {
		 try {
			 WebElement locat=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("location")));
			Select location=new Select(locat);
			location.selectByVisibleText("Paris");
		 }catch(Exception e) {System.out.println("Unable to select location");}
		 return this;
	 }
	 public HomePage selectHotels() {
		 try {
			 WebElement Hotels=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hotels")));
			Select hotel=new Select(Hotels);
			hotel.selectByVisibleText("Hotel Sunshine");
		 }catch(Exception e) {System.out.println("Unable to select hotel");}
		 return this;
	 }
	 public HomePage selectRoomType() {
		 try {
			 WebElement Rtype=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("room_type")));
			Select room=new Select(Rtype);
			room.selectByVisibleText("Standard");
		 }catch(Exception e) {System.out.println("Unable to select room type");}
		 return this;
	 }
	 public HomePage selectNoOfRooms() {
		 try {
			 WebElement Rnos=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("room_nos")));
			Select roomNo=new Select(Rnos);
			roomNo.selectByIndex(2);
		 }catch(Exception e) {System.out.println("Unable to select no of room ");}
		 return this;
	 }
	 public HomePage enterCheckinDate() {
		 try {
			 WebElement checkin=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("datepick_in")));
			 checkin.clear();
			 checkin.sendKeys("24/11/2022");
		 }catch(Exception e) {System.out.println("Unable to enter check in date ");}
		 return this;
	 }
	 public HomePage enterCheckOutDate() {
		 try {
			 WebElement checkout=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("datepick_out")));
			 checkout.clear();
			 checkout.sendKeys("25/11/2022");
		 }catch(Exception e) {System.out.println("Unable to enter check out date");}
		 return this;
	 }
	 public HomePage selectNoOfAdults() {
		 try {
			 WebElement NAdlt=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("adult_room")));
			Select Adult=new Select(NAdlt);
			Adult.selectByIndex(1);
		 }catch(Exception e) {System.out.println("Unable to select no of Adult");}
		 return this;
	 }
	 public HomePage selectNoOfChild() {
		 try {
			 WebElement Nchild=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("child_room")));
			Select Child=new Select(Nchild);
			Child.selectByIndex(1);
		 }catch(Exception e) {System.out.println("Unable to select no of child");}
		 return this;
	 }
	 public HomePage clickReset() {
		 try {
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("child_room"))).click();
			 }catch(Exception e) {System.out.println("Unable to click reset button ");}
		 return this;
	 }

}
