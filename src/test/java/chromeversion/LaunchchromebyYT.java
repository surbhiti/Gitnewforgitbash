package chromeversion;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchchromebyYT 
{

	public static void main(String[] args) {
		/*WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");*/
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");
        //my first push
	}

}
