package TestCases;

import Driver.DriverSetup;
import Utilities.AddToCart;
import java.net.MalformedURLException;
import org.testng.annotations.Test;

public class TestScenario01 extends DriverSetup {
	AddToCart addcartone = new AddToCart();
	
	@Test (description = "Scenario: 01 Customer add products in his shopping cart\r\n"
			+ "Given: Mike on home page after opening nopCart mobile app\r\n"
			+ "When: Mike click \"electronics\" from \"OUR CATEGORIES\" list from home page\r\n"
			+ "And: Mike click to \"Mattress Bedroom\" product details page\r\n"
			+ "And: Mike click plus button to increase Qty by \"2\"\r\n"
			+ "Then: Mike click add to cart button to add the product in his cart")
	public void addcarttwo() throws MalformedURLException{
		addcartone.FirstExecution();
	}

}
