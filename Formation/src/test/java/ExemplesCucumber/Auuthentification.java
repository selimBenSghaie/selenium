package ExemplesCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Auuthentification {
	WebDriver driver;
	@Given("ouvrir le navigateur")
	public void ouvrir_le_navigateur() {
	    System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
	   driver = new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("saisir URL")
	public void saisir_url() {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("saisir username")
	public void saisir_user_name() {
	    WebElement username;
	    username = driver.findElement(By.name("username"));
	    username.sendKeys("Admin");

	}

	@When("saisir mdp")
	public void saisir_mot_de_passe() {
	    WebElement mdp;
	    mdp = driver.findElement(By.name("password"));
	    mdp.sendKeys("admin123");
	}

	@When("cliquer sur le bouton")
	public void cliquer_sur_le_bouton() {
		WebElement bouton;
		bouton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		bouton.click();
	
	   
	}

	@Then("verifier le nom du profil")
	public void verifier_le_nom_du_profil() {
		WebElement profil;
		profil = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		String text;
		text = profil.getText();
		
		Assert.assertEquals("Gogu @!#$%", text);
		System.out.println("TEST OK");
	    
	}

}
