package tests;

public class CheckSchedules extends TestBase{
	
	public static void main(String[] args) throws Exception{		
		homePage.goTo();
		homePage.clickScheduleButton();
		schedules.clickLirrLink();
		schedules.lirr.scheduleTrip("Syosset", "Penn Station", "7:30", "AM");
		closeDriver();
	}
}