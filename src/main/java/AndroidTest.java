import base.AppDriver;

import base.Util;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/*@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Login Tests")*/
public class AndroidTest {

    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities desiredCapabilities;

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        //cap.setCapability("appPackage", "com.android.calculator2");
        //cap.setCapability("appActivity", ".Calculator");
        //cap.setCapability("appPackage", "com.google.android.dialer");
        //cap.setCapability("appActivity", ".DialtactsActivity");
        desiredCapabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        desiredCapabilities.setCapability("appActivity", ".MainActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        AppDriver.setDriver(driver);
        Thread.sleep(1000);

        driver.findElement(MobileBy.AccessibilityId("test-Username")).sendKeys("standard_user");
        driver.findElement(MobileBy.AccessibilityId("test-Password")).sendKeys("secret_sauce");
        driver.findElement(MobileBy.AccessibilityId("test-LOGIN")).click();

        /*driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Contacts tab.']")).click();
        Thread.sleep(500);
        List<MobileElement> contacts = driver.findElements(By.id("com.google.android.dialer:id/contact_name"));
        contacts.get(0).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.EditText[@text='First name']")).sendKeys("Welcome");
        driver.findElement(By.id("com.android.contacts:id/editor_menu_save_button")).click();*/

        Thread.sleep(2000);

        //Util.scrollTo("$7.99");

        Util.scroll(Util.ScrollDirection.DOWN, 0.7);

        Thread.sleep(2000);

        driver.quit();
    }
}



























/*
driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Contacts tab.']")).click();
        Thread.sleep(1000);
        List<MobileElement> contacts = driver.findElements(By.id("com.google.android.dialer:id/contact_name"));
        contacts.get(0).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text='First name']")).sendKeys("qavBox1");
        driver.findElement(By.id("com.android.contacts:id/editor_menu_save_button")).click();
        Thread.sleep(3000);
 */