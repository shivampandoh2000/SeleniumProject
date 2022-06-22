import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName_ClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://truemindcapital.com/home/homepage");
		
		// ClassName for Dropdown
		driv.findElement(By.className("dropdown-toggle")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// CSS Selector for Lumpsum Investment
		driv.findElement(By.cssSelector("a[ui-sref='app.sip.searchLSum']")).click();
		
//		driv.navigate().to("https://truemindcapital.com/home/homepage");
		
//		driv.findElement(By.className("otln-btn search-top-btn")).click();
//		driv.findElement(By.className("form-control ng-pristine ng-valid ng-touched"));

	}

}
