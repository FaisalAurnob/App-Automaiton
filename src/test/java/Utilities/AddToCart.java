package Utilities;

import org.openqa.selenium.By;

public class AddToCart extends Methods {

    public By AcceptButton = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept");
    public By Categories = By.xpath("//android.widget.ImageButton[@content-desc=\"NopStation Cart\"]");
    public By Electronics = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView");
    public By ElectronicsList = By.id("com.nopstation.nopcommerce.nopstationcart:id/categoryNameTextView");
    public By MatressBedroom = By.xpath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[17]");
    public By MatressBedroomList = By.id("com.nopstation.nopcommerce.nopstationcart:id/image_view");
    public By MatressQuantity = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus");
    public By AddToCart = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart");
    
    public void FirstExecution() {
        click(AcceptButton);
        click(Categories);
        click(Electronics);
        wait(ElectronicsList); 
        scrollAndClick(MatressBedroom);
        wait(MatressBedroomList);
        scrollAndClick(MatressQuantity);
        click(AddToCart);
        
        
    }
}
