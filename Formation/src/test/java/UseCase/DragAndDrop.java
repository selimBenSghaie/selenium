package UseCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// chemin de edge driver
		
		System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
		
		// ouvrir le navigateur
		
		WebDriver navigateur = new EdgeDriver();
		
		// agrandir la page 
		
		navigateur.manage().window().maximize();
		
		// ouvrir l'URL 
		
navigateur.get("https://demoqa.com/droppable");

//Sleep
		Thread.sleep(5000);
		
		
		//Declaration des elements 
		
		WebElement article ;
		WebElement panier;
		
		// identification des elements 
		
		article = navigateur.findElement(By.id("draggable"));
		
		panier = navigateur.findElement(By.id("droppable"));
		
		//Actions
Actions action = new Actions(navigateur);

action.dragAndDrop(article, panier).perform();

//Sleep
Thread.sleep(2000);

    // Verification de resultat

WebElement message;

 message = navigateur.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
 
 String text;
 
 text = message.getText();
 
 Assert.assertEquals("Dropped!", text);
 
 Thread.sleep(5000);
	navigateur.close();
	
	System.out.println("TEST OK");
	}

}
