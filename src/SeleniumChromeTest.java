//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChromeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
//		driv.navigate().to("https://truemindcapital.com/home/homepage");
//		driv.findElement(By.className("otln-whitebutton signin")).click();
		
		driv.navigate().to("https://www.google.com");
		driv.quit();
	}

}
