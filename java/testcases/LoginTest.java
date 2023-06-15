package testcases;

import org.testng.annotations.Test;

import base.ProjectPreCondition;
import pages.LoginPage;

public class LoginTest extends ProjectPreCondition{
	@Test
	public void runLogin() {
		LoginPage start=new LoginPage(driver);
		start.enterUsername().enterPassword().clickLogin().selectLocation().selectHotels()
		.selectRoomType().selectNoOfRooms().enterCheckinDate().enterCheckOutDate()
		.selectNoOfAdults().selectNoOfChild();
	}
}
