package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
	
	
	private WebDriver driver;
	
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chorme.driver","C:\\Users\\danie\\OneDrive\\Documentos\\Trabajos Fidélitas\\Quinto Cuatrimestre\\Calidad Software\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://google.com");
	}

}
