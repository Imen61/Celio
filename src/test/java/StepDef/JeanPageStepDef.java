package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.JeanPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JeanPageStepDef {
	@Given("l'utilisateur est sur la page Jeans")
	public void l_utilisateur_est_sur_la_page_jeans() throws Exception {
		Config.driver = new ChromeDriver();
		Config.maximize();
		Config.driver.get(Utils.getProperty("urljeans"));
	}
	@When("l'utilisateur clique sur le produit {string}")
	public void l_utilisateur_clique_sur_le_produit(String Nomprod) throws Exception {
		JeanPage page = new JeanPage();
		 page.clickProduct(Nomprod);
	}
	@Then("la page de produit est affichée {string}")
	public void la_page_de_produit_est_affichée(String Nomprod) {
		JeanPage page = new JeanPage();
		page.verifProduct(Nomprod);
		Config.driver.quit();
	}
}


