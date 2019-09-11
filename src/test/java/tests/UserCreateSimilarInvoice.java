package tests;

import objects.ListOfInvoicesPage;
import objects.LogInPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import objects.MenuBar;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class UserCreateSimilarInvoice {

    public AndroidDriver<MobileElement> driver;


    @BeforeMethod
    public void beforeTest() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("deviceName", "Nexus_5X_API_29_x86 "); //DeviceId from "adb devices" command
        caps.setCapability("app", "C:\\Users\\grzegorz.chlopek\\Desktop\\builds\\app-debug.apk");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appActivity", "io.wave.login.chooseuser.view.ChooseUserActivity ");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


    @Test
    public void userProperSingInToExistingAccount() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.userChooseUserAccountWave_User_5();

        MenuBar menuBar = new MenuBar(driver);
        menuBar.userGoToSalesCategory();

        ListOfInvoicesPage listOfInvoicesPage = new ListOfInvoicesPage(driver);
        listOfInvoicesPage.userGoToInvoiceDetails();

    }
/*
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
*/

}



