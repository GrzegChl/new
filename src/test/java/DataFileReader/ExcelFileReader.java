package DataFileReader;
import java.io.IOException;
import java.util.List;

/**Class reading an excel file*/
public class ExcelFileReader {

    public static void main(String[] args) {

        ExcelSheetReader excelSheetReaderForClientData = new ExcelSheetReader();


        /**A n index specifying a column called Search Query in the test sheet*/
        int invoiceNumber = 0;
        int nipNumber = 1;
        int companyName = 2;
        int street = 3;
        int number = 4;
        int local = 5;
        int zipCode = 6;
        int city = 7;
        int email = 8;
        int phone = 9;

        ExcelSheetReader excelSheetReaderForProductData = new ExcelSheetReader();
        int nameOfService = 0;
        int pKWiU = 1;
        int netPrice = 2;
        int grossPrice = 3;
        int quantityOfProduct = 4;

        try {

            /**Reading/downloading a file named FILE_NAME.xslx and a spreadsheet inside a file named FileName*/
            String excelFileLocation = System.getProperty("user.dir") + "/src/main/resources/" + "test.data.xlsx";
            excelSheetReaderForClientData.setExcelFileSheet(excelFileLocation, "Client data");
            excelSheetReaderForProductData.setExcelFileSheet(excelFileLocation, "Product data");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**Reference of downloaded customer data*/
        SheetDataReader sheetDataReader = new SheetDataReader(excelSheetReaderForClientData.getExcelSheet());


        /**Download values for the Search query column*/
        List<String> InvoiceNumberList = sheetDataReader.getDataForColumn(invoiceNumber);
        List<String> NipNumberList = sheetDataReader.getDataForColumn(nipNumber);
        List<String> CompanyNameList = sheetDataReader.getDataForColumn(companyName);
        List<String> StreetList = sheetDataReader.getDataForColumn(street);
        List<String> NumberList = sheetDataReader.getDataForColumn(number);
        List<String> LocalList = sheetDataReader.getDataForColumn(local);
        List<String> ZipCodeList = sheetDataReader.getDataForColumn(zipCode);
        List<String> CityList = sheetDataReader.getDataForColumn(city);
        List<String> EmailList = sheetDataReader.getDataForColumn(email);
        List<String> PhoneList = sheetDataReader.getDataForColumn(phone);


        System.out.println("InvoiceNumberList"+InvoiceNumberList.toString());
        System.out.println("NipNumberList"+NipNumberList.toString());
        System.out.println("CompanyNameList"+CompanyNameList.toString());
        System.out.println("StreetList"+StreetList.toString());
        System.out.println("NumberList"+NumberList.toString());
        System.out.println("LocalList"+LocalList.toString());
        System.out.println("ZipCodeList"+ZipCodeList.toString());
        System.out.println("CityList"+CityList.toString());
        System.out.println("EmailList"+EmailList.toString());
        System.out.println("PhoneList"+PhoneList.toString());

        /**Reference of downloaded product data*/
        SheetDataReader sheetDataReaderNextSheet = new SheetDataReader(excelSheetReaderForProductData.getExcelSheet());

        /**Download values for the Search query column*/
        List<String> NameOfServiceList = sheetDataReaderNextSheet.getDataForColumn(nameOfService);
        List<String> PkwiuList = sheetDataReaderNextSheet.getDataForColumn(pKWiU);
        List<String> NetPriceList = sheetDataReaderNextSheet.getDataForColumn(netPrice);
        List<String> GrossPriceList = sheetDataReaderNextSheet.getDataForColumn(grossPrice);
        List<String> QuantityOfProductList = sheetDataReaderNextSheet.getDataForColumn(quantityOfProduct);


        System.out.println("NameOfServiceList"+NameOfServiceList.toString());
        System.out.println("PkwiuList"+PkwiuList.toString());
        System.out.println("NetPriceList"+NetPriceList.toString());
        System.out.println("GrossPriceList"+GrossPriceList.toString());
        System.out.println("QuantityOfProductList"+QuantityOfProductList.toString());


    }


}