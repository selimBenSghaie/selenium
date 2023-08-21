package UseCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PremierCas {

	public static void main(String[] args) {
		// chemin edgedriver
		System.setProperty("webdriver.edge.driver", "src/test/ressources/msedgedriver.exe");
		
		
		//ouverture de edge
		
		WebDriver driver= new EdgeDriver();
		
		//maximiser la fenetre
		driver.manage().window().maximize();
		
		// acceder au site (saisir l'url)
		
		driver.get("https://www.youtube.com/");
		
		

	}

}