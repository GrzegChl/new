package NewInvoice;

import objects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewContractorManuallyAddData extends BasePage {
    public NewContractorManuallyAddData(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement ButtonXNavigateUp;

    @FindBy(id = "io.wave.app:id/company_radio_button")
    private WebElement RadioButtonCompany;

    @FindBy(id = "io.wave.app:id/natural_person_radio_button")
    private WebElement RadioButtonNaturalPerson;

    @FindBy(id = "io.wave.app:id/text_input_edit_text")
    private WebElement FieldNipNumber;

    @FindBy(id = "io.wave.app:id/company_name_input")
    private WebElement FieldCompanyName;

    @FindBy(id = "io.wave.app:id/street_input")
    private WebElement FieldStreet;

    @FindBy(id = "io.wave.app:id/street_number_input")
    private WebElement FieldStreetNumber;

    @FindBy(id = "io.wave.app:id/building_number_input")
    private WebElement FieldLocal;

    @FindBy(id = "io.wave.app:id/postal_code_input")
    private WebElement FieldZipCode;

    @FindBy(id = "io.wave.app:id/city_input")
    private WebElement FieldCity;

    @FindBy(id = "io.wave.app:id/email_input")
    private WebElement FieldEmail;

    @FindBy(id = "io.wave.app:id/phone_input")
    private WebElement FieldPhoneNumber;

    @FindBy(id = "io.wave.app:id/save_contractor_button")
    private WebElement ButtonSaveContractor;


}
