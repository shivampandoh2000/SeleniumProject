import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://demoqa.com/select-menu");
		
		Select selectMenu = new Select(driv.findElement(By.id("oldSelectMenu")));
		
		selectMenu.selectByValue("5");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		selectMenu.selectByIndex(3);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		selectMenu.selectByVisibleText("White");
		
		driv.close();

	}

}
