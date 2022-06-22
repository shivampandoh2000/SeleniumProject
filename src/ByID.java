import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://amazon.com");
		
		WebElement searchBox = driv.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Home Furniture");
		searchBox.sendKeys(Keys.ENTER);
		

	}

}
