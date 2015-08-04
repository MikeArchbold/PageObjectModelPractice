package pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {
	
	public static String URL;
	public static WebDriver driver;
	public static HashMap<String, String> xpathMap;
	
	public static void setPage(String URL, WebDriver driver, HashMap<String, String> xpathMap){
		Page.URL = URL; 
		Page.driver = driver;
		Page.xpathMap = xpathMap;
	}

	public static void verifyPage(String key) throws Exception{
		if (!driver.getTitle().equals(xpathMap.get(key)))
			throw new Exception(key + " not found");
	}
	
	public void goTo(){
		try{
			driver.get(URL);
			if (!driver.getTitle().equals(xpathMap.get("title")))
				throw new Exception(URL + " not found");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void clickXPath(String key1, String key2, String xpath){
		/* clicks inputed XPath and verifies that starting and ending pages are reached
		 * two dimensional is for the value of the page verifications and the name of the
		 * page if there is an error */
		try{
			verifyPage(key1);
			driver.findElement(By.xpath(xpath)).click();		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void clickLinkText(String key1, String key2, String linkText){
		/* validates on that is on proper page, clicks link text, validates
		 * next page has been reach */
		try{
			verifyPage(key1);
			driver.findElement(By.linkText(linkText)).click();
			verifyPage(key2);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}