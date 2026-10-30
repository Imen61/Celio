package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.HomepagePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	@Given("l'utilisateur est sur la page d'accueil")
	public void l_utilisateur_est_sur_la_page_d_accueil() throws Exception {
		Config.driver = new ChromeDriver();
		Config.maximize();
		Config.driver.get(Utils.getProperty("urlhome"));
	    
	}
	@When("l'utilisateur survol sur le menu {string} et clique sur le sous menu {string}")
	public void l_utilisateur_survol_sur_le_menu_et_clique_sur_le_sous_menu(String menutitle, String submenutitle) {
		HomepagePage page = new HomepagePage();
		 page.clickonmenu(menutitle, submenutitle);
	}
	    
	@Then("l'utilisateur est dirigé vers la page du sous menu {string}")
	public void l_utilisateur_est_dirigé_vers_la_page_du_sous_menu(String subm) {
		HomepagePage page = new HomepagePage();
		 page.verifH(subm);
		 Config.driver.quit();
	    
	}

	    
	}





