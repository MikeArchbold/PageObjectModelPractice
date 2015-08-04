package pages;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page{

	public HomePage(WebDriver driver){
		String URL = "http://www.mta.info";
		
		HashMap<String, String> homePageMap = new HashMap<String, String>();
		homePageMap.put("title", "MTA | Subway, Bus, Long Island Rail Road, Metro-North");
		homePageMap.put("neighborhoods", "mta.info | MTA Neighborhood Maps");
		homePageMap.put("subway map", "mta.info | MTA Subway Map");
		
		Page.setPage(URL, driver, homePageMap);
	}
	
	public void clickScheduleButton() throws Exception{
		clickXPath("title", "neighborhoods", ".//*[@id='menu-415-1']/a");
	}
	
	public void clickSubwayMap() throws Exception{
		clickLinkText("neighborhoods", "subway map", "Subway System");
	}
}