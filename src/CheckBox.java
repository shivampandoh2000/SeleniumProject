import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://demoqa.com/checkbox");
		WebElement clickFeild = driv.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]"));
		WebElement checkBtn1 = driv.findElement(By.xpath("//*[@id=\"tree-node-home\"]"));
		clickFeild.click();
		
		System.out.println(checkBtn1.isSelected());
		System.out.println(checkBtn1.isEnabled());
		System.out.println(checkBtn1.isDisplayed());

	}

}
