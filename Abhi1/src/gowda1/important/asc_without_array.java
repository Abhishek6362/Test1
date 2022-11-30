package gowda1.important;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class asc_without_array {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./abcd/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Abhishek%20Gowda/Desktop/singledropdown.html");
		WebElement ele= driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		TreeSet<String> t = new TreeSet<String>();
		for(WebElement o:opt)
		{
			String text = o.getText();
			t.add(text);
		}
		for(String value:t)
		{
			System.out.println(value);
		}
		
		
	}

}
