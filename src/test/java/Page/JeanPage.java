package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class JeanPage {
	@FindBy(xpath="/html/body/main/div/section/div[3]/div[1]/div[4]/ol/li/div[2]/h5/a")
	List<WebElement> produits;
	
	@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/h1")
	WebElement verifArticle;
	
	public JeanPage() {
		PageFactory.initElements(Config.driver, this);
	}
	public void clickProduct(String nomProd) throws Exception {
		try {
			for(WebElement prod:produits) {
				if(prod.getText().contains(nomProd)) {
					prod.click();	
				}	
			}	
}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void verifProduct(String Productname) {
		Assert.assertEquals(verifArticle.getText(), Productname);
		
	}
}
