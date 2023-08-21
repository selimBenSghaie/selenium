package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreatAccount {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement cnc;
		
		cnc = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		
		Actions action = new Actions(driver);
		
		cnc.click();
		
		WebElement prenom, nom, mail, mail2, mdp, jour, mois, annee, genre , inscription;
		
		prenom = driver.findElement(By.xpath("//input[@name='firstname']"));
		nom = driver.findElement(By.xpath("//input[@name='lastname']"));
		mail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mail2 = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		mdp = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		jour = driver.findElement(By.xpath("//select[@title='Jour']"));
		mois = driver.findElement(By.xpath("//select[@title='Mois']"));
		annee = driver.findElement(By.xpath("//select[@title='Année']"));
		genre = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		inscription = driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		prenom.sendKeys("testeur");
		nom.sendKeys("ben testeur");
		mail.sendKeys("testeur123@gmail.com");
		
		action.keyDown(mail, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(mail2, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		mdp.sendKeys("tarajidawla123");
		
		Select select = new Select(jour);
		
        select.selectByValue("2");
        
        Select select2 = new Select(mois);
        select2.selectByValue("2");
        
        Select select3 = new Select(annee);
        
        select3.selectByValue("1994");
        
        genre.click();
        
        inscription.click();
        
		System.out.println("Test ok");

	}

}
