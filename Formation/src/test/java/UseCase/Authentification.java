package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import junit.framework.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin de edge driver
		System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
		
		// ouvrir navigateur
		WebDriver navigateur = new EdgeDriver();
		
		// maximiza window
		navigateur.manage().window().maximize();
		
		// ouvrir URL 
		navigateur.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Sleep
		Thread.sleep(5000);
		
		//declaration des elements 
		WebElement user, mdp, bouton;
		
		//identification des elements
		user = navigateur.findElement(By.name("username"));
		mdp = navigateur.findElement(By.name("password"));
		bouton = navigateur.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		//Actions
		
		user.sendKeys("Admin");
		mdp.sendKeys("admin123");
		bouton.click();
		
		//sleep
		Thread.sleep(5000);
		
		//verification resultat attendu
		
		WebElement profil;
		profil = navigateur.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text = profil.getText();
		
		Assert.assertEquals("Paul Collings", text);
		System.out.println("TEST OK");
		
		//close navigateur
		navigateur.close();
		
 
		
	}

}
