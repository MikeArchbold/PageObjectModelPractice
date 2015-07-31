package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckSchedules {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.mta.info");
		driver.findElement(By.xpath(".//*[@id='menu-415-1']/a")).click();
		driver.findElement(By.linkText("Subway System")).click();
		driver.close();
	}
}
