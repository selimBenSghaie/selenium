package ExemplesCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class recherche {
	
	WebDriver driver;

	
	@Given("ouvrir nnavigateur")
	public void ouvrir_nnavigateur() {
	    System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	}

	@Given("ouvir url de google {string}")
	public void ouvir_url_de_google(String string) {
		driver.get(string);
	    
	}

	@When("saisir le mot {string}")
	public void saisir_le_mot(String string) {
		WebElement barre;
		barre = driver.findElement(By.name("q"));
		barre.sendKeys(string);
	   
	}

	@When("cliquer sur entre")
	public void cliquer_sur_entre() {
		WebElement barre;
		barre = driver.findElement(By.name("q"));
		barre.sendKeys(Keys.ENTER);
	}

	@Then("verifier que la phrase contient le mot {string}")
	public void verifier_que_la_phrase_contient_le_mot(String string) {
		WebElement text;
		text = driver.findElement(By.id("result-stats"));
		String message;
		message = text.getText();
		if (message.contains(string)) {
			System.out.println("test ok");
		}
		else System.out.println("Test KO");
		driver.close();
	
	}
}
