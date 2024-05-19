package Utilities;

import static Driver.DriverSetup.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Methods {

    public MobileElement findElement(By locator) {
        return (MobileElement) driver.findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void sendKeys(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

    public void wait(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Method to scroll to the specified element
    public boolean scroll(By locator) {
        return scrollAndOperate(locator, false);
    }

    // Method to scroll and optionally click the specified element
    public boolean scrollAndClick(By locator) {
        return scrollAndOperate(locator, true);
    }

    // Method to scroll to the specified element and optionally click it
    private boolean scrollAndOperate(By locator, boolean click) {
        Dimension size = driver.manage().window().getSize();
        int start_x = (int) (size.width * 0.5);
        int start_y = (int) (size.height * 0.8);
        int end_x = (int) (size.width * 0.5);
        int end_y = (int) (size.height * 0.2);

        boolean isClicked = false;
        int maxAttempts = 5;
        for (int i = 0; i < maxAttempts; i++) {
            new TouchAction<>(driver)
                    .press(PointOption.point(start_x, start_y))
                    .waitAction()
                    .moveTo(PointOption.point(end_x, end_y))
                    .release()
                    .perform();

            if (isElementPresent(locator)) {
                if (click) {
                    click(locator);
                }
                isClicked = true;
                break;
            }
        }
        return isClicked;
    }

    // Method to check if a specific element is present
    public boolean isElementPresent(By locator) {
        try {
            MobileElement element = findElement(locator);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
