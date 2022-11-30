package gowda1.important;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class count {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./abcd/geckodriver.exe");
		WebDriver fx = new FirefoxDriver();
		fx.get("file:///C:/Users/Abhishek%20Gowda/Desktop/Link1.html");
	  List<WebElement> ele = fx.findElements(By.tagName("a"));
	  int size = ele.size();
	  System.out.println(size);
		
		
	}

}
