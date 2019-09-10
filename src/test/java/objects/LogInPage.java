package objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "io.wave.app:id/login_text_view")
    private WebElement ButtonlogIn;


    @FindBy(className = "android.widget.Button")
    private List<WebElement> listOfUsers;


    public void userChooseUserAccountWave_User_5() {
        Assert.assertTrue(ButtonlogIn.isDisplayed());
        ButtonlogIn.click();
        Assert.assertTrue(listOfUsers.get(4).isDisplayed());
        listOfUsers.get(4).click();
        log().info("Clicked on button Wave_User_5");
    }

}






