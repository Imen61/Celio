package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class CardPage {
	@FindBy(id="product-addtocart-button")
	WebElement btnAjout;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/button")
	WebElement btnCommander;
	
	@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/div/strong/a")
	WebElement verifPanier;
	
	public CardPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void ajoutPanier() {
		btnAjout.click();
		Config.attente(10);
		
		btnCommander.click();
		
		
		
		
	}
	public void verifH(String v) {
		Assert.assertTrue(verifPanier.getText().contains(v));
	}
	
	

}


