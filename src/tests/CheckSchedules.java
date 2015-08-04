package tests;

import tests.TestBase;

public class CheckSchedules extends TestBase{
	
	public static void main(String[] args) throws Exception{
		homePage.goTo();
		homePage.clickScheduleButton();
		homePage.clickSubwayMap();
		closeDriver();
	}
}