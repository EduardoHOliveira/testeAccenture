package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	static final String PATH_WEBDRIVER = "./src/test/resources/driver/chromedriver.exe";

	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", PATH_WEBDRIVER);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/app.php");

		return driver;
	}

}
