package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// move to element
		
		System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
		
		WebDriver navigateur = new EdgeDriver();
		
		
		navigateur.manage().window().maximize();
		
		navigateur.get("https://demoqa.com/menu#");
		
		
		Thread.sleep(5000);
	
		
		WebElement menu;
		
		
		menu = navigateur.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		
		
		Actions action = new Actions(navigateur);
		
		action.moveToElement(menu).perform();
		
		System.out.println("TEST OK");
		

	}

}
