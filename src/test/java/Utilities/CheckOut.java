package Utilities;

import org.openqa.selenium.By;

public class CheckOut extends Methods{
	public By CartIcon = By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon");
	public By Checkout = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut");
	public By CHeckoutAsGuest = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout");
	public By BillingAddress = By.id("com.nopstation.nopcommerce.nopstationcart:id/shipToSameAddressCheckBox");
	public By FirstName = By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName");
	public By lastName = By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName");
	public By Email = By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail");
	public By SelectCountry = By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner");

	public By CountryName= By.xpath("//android.widget.TextView[@text=\"Bangladesh\"]");
	public By SelectState = By.id("com.nopstation.nopcommerce.nopstationcart:id/stateSpinner");
	public By StateName = By.xpath("//android.widget.TextView[@text=\"ঢাকা\"]");
	public By Company = By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName");
	public By City = By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity");

	public By fax = By.id("com.nopstation.nopcommerce.nopstationcart:id/etFax");
	public By StreetAddress1 = By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress");
	public By StreetAddress2 = By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2");
	public By ZipCOde = By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode");
	public By PhoneNumber = By.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone");
	public By Fax = By.id("com.nopstation.nopcommerce.nopstationcart:id/etFax");
	public By ContinueButton = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");
	public By NextDayAirSelect = By.xpath("//android.widget.TextView[@text=\"Next Day Air\"]");

	public By ContinueButton2 =By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");
	public By PaymentPageVisible = By.xpath("//android.widget.TextView[@text=\"bKash Payment ($20.00)\"]");

	public By CheckOrMoneyOrder = By.xpath("//android.widget.TextView[@text=\"Check / Money Order\"]");
	public By PressContinue = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");
	public By PaymentInfoPageVisible = By.xpath("//android.widget.TextView[@text = \"Payment information\"]");
	public By nextButton = By.xpath("//android.widget.Button[@text = \"Next\"]");
	public By ConfirmPagevisible = By.xpath("//android.widget.TextView[@text = \"Billing address\"]");
	public By ConfirmButton = By.xpath("//android.widget.Button[@text = \"CONFIRM\"]");
	public By VisiblePopupMessage = By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message");
	public String PopUpMessage = "Your order has been successfully processed!";
	


	public void SecondExecution() {
		click(CartIcon);
		click(Checkout);
		click(CHeckoutAsGuest);
		wait(BillingAddress);
		sendKeys(FirstName, "Faisal");
		sendKeys(lastName, "Aurnob");
		sendKeys(Email, "aminai3c@gmail.com");
		click(SelectCountry);
		scroll(CountryName);
		click(CountryName);
		
		click(SelectState);
		click(StateName);
		sendKeys(Company, "Own");;
		sendKeys(City, "Dhaka");
		scroll(StreetAddress1);
		sendKeys(StreetAddress1, "Nikunjo/2");
		sendKeys(ZipCOde, "1200");
		sendKeys(PhoneNumber, "11111111111");
		sendKeys(Fax, "58151692");
		click(ContinueButton);
		//wait(NextDayAirVisibleOption);
		click(NextDayAirSelect);
		scrollAndClick(ContinueButton2);
		//wait(PaymentPageVisible);
		scrollAndClick(CheckOrMoneyOrder);


		scrollAndClick(PressContinue);
		wait(PaymentInfoPageVisible);
		click(nextButton);
		wait(ConfirmPagevisible);
		click(ConfirmButton);
		wait(VisiblePopupMessage);
		
	}


}
