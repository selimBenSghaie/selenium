package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeWork {

	public static void main(String[] args) {
		// driver path
		
		System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		WebElement recherche;
		
		recherche = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		
		recherche.sendKeys("Tunisie");
		recherche.sendKeys(Keys.ENTER);
		
		WebElement message;
		
		message = driver.findElement(By.id("result-stats"));
		
		String text ; 
		
		text = message.getText();
		
		
		if (text.contains("Environ 443 000 000 résultats")) {
			System.out.println("Test ok");}
		else {System.out.println("Test ko");}
		}

	}


