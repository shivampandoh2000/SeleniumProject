import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://www.calculator.net/log-calculator.html");
		String x = driv.findElement(By.className("verybigtext")).getText();
		
		System.out.println("Text obtained from the website test: " + x);

	}

}
