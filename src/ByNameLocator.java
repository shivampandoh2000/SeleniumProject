import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.navigate().to("https://www.google.com/");
		
		// Using By name locator:
//		WebElement searchBox = driv.findElement(By.name("q"));
//		
//		searchBox.sendKeys("Amazon");
//		searchBox.sendKeys(Keys.ENTER);
		

	}

}
