import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        
        WebElement from = driver.findElement(By.xpath("//*[@id=\"credit2\"]"));
        WebElement toEelement = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
        
        Actions act = new Actions(driver);
        act.dragAndDrop(from, toEelement).perform();
  
	}

}
