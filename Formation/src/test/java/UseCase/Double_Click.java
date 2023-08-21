package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Double_Click {


	public static void main(String[] args) throws InterruptedException {
		// chemin de edge driver
		
		System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
		
	
		// ouvrir le navigateur
		
		WebDriver navigateur = new EdgeDriver();
		
		// maximiser la page 
		navigateur.manage().window().maximize();
		
		// ouvrir l'URL
		
		navigateur.get("https://demoqa.com/buttons");
		
		
		//Sleep
		Thread.sleep(5000);
		
		//Déclaration des elements
		
		WebElement boutton;

		//identification des elements
		
		boutton = navigateur.findElement(By.id("doubleClickBtn"));
		
		// Action
	
		Actions action =new Actions(navigateur);
		action.doubleClick(boutton).perform();
		
		
		// sleep
		Thread.sleep(5000);
		
		//Verification resultat
		
		WebElement message;
		message = navigateur.findElement(By.id("doubleClickMessage"));
		
		String text;
		text = message.getText();
		
		Assert.assertEquals("You have done a double click", text);
		
		
		
		WebElement rightclick;
		
		rightclick = navigateur.findElement(By.id("rightClickBtn"));
		
		action.contextClick(rightclick).perform();
		
		
		
		WebElement message2;
		message2 = navigateur.findElement(By.id("rightClickMessage"));
		
	String text2;
	text2 = message2.getText();
	
	Assert.assertEquals("You have done a right click", text2);
	
	
	Thread.sleep(5000);
		navigateur.close();
		
		System.out.println("TEST OK");
				
	}

}
