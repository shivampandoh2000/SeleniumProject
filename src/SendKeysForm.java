import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://www.calculator.net/log-calculator.html");
		
		// (Sending keys to form) + (clearing input)
		WebElement val = driv.findElement(By.name("xv"));
		val.clear();
		val.sendKeys("8");
		
		WebElement base = driv.findElement(By.name("base"));
		base.clear();
		base.sendKeys("2");
		
		// Used click
		driv.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driv.navigate().back();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driv.navigate().refresh();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driv.navigate().forward();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driv.close();

	}

}
