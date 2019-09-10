package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MenuBar extends BasePage {


    public MenuBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "io.wave.app:id/home")
    private WebElement MenuBarButtonMyCompany;

    @FindBy(id = "io.wave.app:id/sale")
    private WebElement MenuBarButtonSales;

    @FindBy(id = "io.wave.app:id/costs")
    private WebElement MenuButtonCosts;

    @FindBy(id = "io.wave.app:id/stats")
    private WebElement MenuButtonStatistic;

    @FindBy(id = "io.wave.app:id/more")
    private WebElement MenuButtonMore;

    public void userGoToSalesCategory(){
        Assert.assertTrue(MenuBarButtonSales.isDisplayed());
        MenuBarButtonSales.click();
        log().info("Clicked on button Sales");
    }

    public void userGoToCostCategory(){
        Assert.assertTrue(MenuButtonCosts.isDisplayed());
        MenuButtonCosts.click();
        log().info("Clicked on button Cost");


    }
}
