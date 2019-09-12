package NewInvoice;

import objects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ListOfContractors extends BasePage {
    public ListOfContractors(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "io.wave.app:id/sale_document_save_button")
    private WebElement FieldSearchInput;

    @FindBy(className = "android.widget.LinearLayout")
    private List<WebElement> ListOfContractors;

    @FindBy(id = "io.wave.app:id/fab_new_sale_invoice")
    private WebElement ButtonAddNewContractor;



}
