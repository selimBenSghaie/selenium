package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDeroulante {

	public static void main(String[] args) {
		// chemin vers le navigateur 
		
		System.setProperty("webdriver.edge.driver","src/test/ressources/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/select-menu");
		
		
		WebElement List;
		
		List = driver.findElement(By.id("oldSelectMenu"));
		
		
		Select select = new Select(List);
		
         select.selectByValue("7");
		
		

	}

}
