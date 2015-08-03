package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	//testing git commit on laptop
	private static WebDriver driver;
	
	public HomePage(WebDriver driver){
		HomePage.driver = driver;
	}
	
	public void goTo() throws Exception{
		driver.get("http://www.mta.info");
		if (!driver.getTitle().equals("MTA | Subway, Bus, Long Island Rail Road, Metro-North"))
			throw new Exception("title of homepage not found");
	}
	
	public void clickScheduleButton() throws Exception{
		if (!driver.getTitle().equals("MTA | Subway, Bus, Long Island Rail Road, Metro-North"))
			throw new Exception("homepage not found");
		driver.findElement(By.xpath(".//*[@id='menu-415-1']/a")).click();
		if (!driver.getTitle().equals("mta.info | MTA Neighborhood Maps"))
			throw new Exception("fuck off");
	}
	
	public void clickSubwayMap() throws Exception{
		if (!driver.getTitle().equals("mta.info | MTA Neighborhood Maps"))
			throw new Exception("schedule page not found");
		driver.findElement(By.linkText("Subway System")).click();
		if (!driver.getTitle().equals("mta.info | MTA Subway Map"))
			throw new Exception("subway map page not found");
	}
}