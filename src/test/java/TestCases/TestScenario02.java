package TestCases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Driver.DriverSetup;
import Utilities.CheckOut;
import Utilities.AddToCart;

public class TestScenario02 extends DriverSetup{
	AddToCart addcarttwo = new AddToCart();
	CheckOut checkout = new CheckOut();
	@Test (description = "Scenario 02 : Given: Mike go to shopping cart by clicking top cart icon\r\n"
			+ "When: Mike click checkout button from shopping cart page\r\n"
			+ "And: Mike select checkout as guest from shopping cart page\r\n"
			+ "Then: Mike input all the details in checkout billing details page and click continue\r\n"
			+ "And: Mike select \"Next Day Air\" as shipping method and click continue\r\n"
			+ "And: Mike select \"Check/Money Order\" as payment method and click continue\r\n"
			+ "And: Mike click next button on payment information page\r\n"
			+ "Then: Mike click confirm button to place the order\r\n"
			+ "And: Verify order place successfully with popup message \"Your order has been successfully processed!\"")
	public void OrderReplace() throws MalformedURLException{
		addcarttwo.FirstExecution();
		checkout.SecondExecution();
		
	}
	

}
