package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.CardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CardPageStepDef {
	@Given("l'utilisateur est sur la page du produit {string}")
	public void l_utilisateur_est_sur_la_page_du_produit(String string) throws Exception {
		Config.driver = new ChromeDriver();
		Config.maximize();
		Config.driver.get(Utils.getProperty("urlproduct"));
	}
	@When("l'utilisateur clique sur Ajouter au panier et clique sur commander")
	public void l_utilisateur_clique_sur_ajouter_au_panier_et_clique_sur_commander() {
		 CardPage page = new CardPage();
		    page.ajoutPanier();
	}
	@Then("le produit {string} est ajouté au panier")
	public void le_produit_est_ajouté_au_panier(String string) {
		 CardPage page = new CardPage();
		page.verifH(string);
		 Config.driver.quit();
	}

}
	