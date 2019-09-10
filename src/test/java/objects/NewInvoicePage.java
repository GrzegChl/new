package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewInvoicePage extends BasePage {
    public NewInvoicePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "io.wave.app:id/text_input_edit_text")
    private WebElement FieldInvoiceIdentificationNumber;

    //kontrolki kalndarza lista selectorów
    @FindBy(id = "io.wave.app:id/frame_filled")
    private List<WebElement> listOfDatePickerField;

    //kontrolki wyswietlanych dni w kalendarzu, lista dni
    @FindBy(className = "android.view.View")
    private List<WebElement> listOfDaysDatePicek;

    @FindBy(id = "io.wave.app:id/products_section")
    private WebElement DropDownProductsSection;

    @FindBy(id = "io.wave.app:id/contractor_header")
    private WebElement DropDownClientSection;

    @FindBy(id = "android:id/button1")
    private WebElement ButtonConfirmDateOnDatePicker;

    @FindBy(id = "io.wave.app:id/payment_method_header")
    private WebElement DropDownPaymentMethodSection;








}
