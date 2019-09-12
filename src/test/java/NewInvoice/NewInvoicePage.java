package NewInvoice;

import objects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class NewInvoicePage extends BasePage {
    public NewInvoicePage(WebDriver driver) {
        super(driver);
    }

    //pierwsze pole to numer faktury, drugie termin płatnosci
    @FindBy(id = "io.wave.app:id/text_input_edit_text")
    private List<WebElement> ListOfField;

    //kontrolki kalndarza lista selectorów, data sprzedaży, Data wystawienia, data płatności
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

    @FindBy(id = "io.wave.app:id/add_sale_document_payment_method")
    private WebElement FinalDropDownPaymentMethod;

    //lista metod płatności z wnętrza dropdowna
    @FindBy(id = "android.widget.TextView")
    private List<WebElement> ListOfPaymentMethod;

    @FindBy(id = "io.wave.app:id/add_contractor")
    private WebElement ButtonAddContractor;

    @FindBy(id = "io.wave.app:id/add_new_button_button")
    private WebElement ButtonAddNewProductOrService;

    @FindBy(id = "io.wave.app:id/choose_from_list_button")
    private WebElement ChooseProductOrServiceFromTheList;

    @FindBy(id = "io.wave.app:id/add_sale_document_mark_as_paid")
    private WebElement CheckBoxMarkSaleDocumentAsPaid;

    @FindBy(id = "io.wave.app:id/save_draft")
    private WebElement ButtonSaveDraft;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement ButtonXNavigateUp;

    @FindBy(id = "io.wave.app:id/sale_document_save_button")
    private WebElement ButtonSaveSaleDocument;
}

