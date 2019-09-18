package NewInvoice;

import objects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContractorSearchPage extends BasePage {
    public NewContractorSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement ButtonXNavigateUp;

    @FindBy(id = "io.wave.app:id/company_radio_button")
    private WebElement RadioButtonCompany;

    @FindBy(id = "io.wave.app:id/natural_person_radio_button")
    private WebElement RadioButtonNaturalPerson;

    @FindBy(id = "io.wave.app:id/text_input_edit_text")
    private WebElement FieldSearchInput;

    @FindBy(id = "io.wave.app:id/search_button")
    private WebElement ButtonSearch;

    @FindBy(id = "io.wave.app:id/fill_manually_button")
    private WebElement ButtonFillDataManually;


}
