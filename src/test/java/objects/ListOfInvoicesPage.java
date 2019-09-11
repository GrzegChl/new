package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ListOfInvoicesPage extends BasePage {
    public ListOfInvoicesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "io.wave.app:id/fab_new_sale_invoice")
    private WebElement ButtonCreateNewInvoice;

    @FindBy(id = "io.wave.app:id/document_type_card")
    private WebElement ButtonCreateNewDocument;

    @FindBy(id = "io.wave.app:id/sale_document_item_thumbnail_item")
    private List<WebElement> listOfInvoices;


    public void userGoToInvoiceDetails(){
        Assert.assertTrue(listOfInvoices.get(0).isDisplayed());
        listOfInvoices.get(0).click();
        log().info("Clicked on first invoice on the list/view details");
    }


    public void userAddNewInvoice(){


    }

}



