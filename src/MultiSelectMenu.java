import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://demoqa.com/select-menu");
		
		Select multiSelectMenu = new Select(driv.findElement(By.id("cars")));
		
		Actions act = new Actions(driv);
		
		multiSelectMenu.selectByValue("audi");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		multiSelectMenu.selectByValue("volvo");
		
		
		List<WebElement> opts = multiSelectMenu.getAllSelectedOptions();
		
		System.out.println("Selected options are listed below:");
		
		for(WebElement selecOpt: opts)
            System.out.println(selecOpt.getText());

	}

}
