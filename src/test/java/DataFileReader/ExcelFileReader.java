package DataFileReader;

import java.io.IOException;
import java.util.List;

public class ExcelFileReader {

    public static void main(String[] args) {

        //Indeks określający kolumnę o nazwie Search Query w arkuszu GoogleSearch
        int queryColumn = 0;

        //Indeks określający kolumnę o nazwie Expected result w arkuszu GoogleSearch
        int expectedResultColumn = 1;


        ExcelSheetReader excelSheetReader = new ExcelSheetReader();

        try {
            //Odczytanie/Pobranie pliku o nazwie DDT_FILE.xslx oraz arkusza wewnątrz pliku o nazwie GoogleSearch
            //Reading/downloading a file named FILE_NAME.xslx and a spreadsheet inside a file named FileName
            String excelFileLocation = System.getProperty("user.dir") + "/src/main/resources/" + "DDT_FILE.xlsx";
            excelSheetReader.setExcelFileSheet(excelFileLocation, "GoogleSearch");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SheetDataReader sheetDataReader = new SheetDataReader(excelSheetReader.getExcelSheet());
        List<String> searchQueryList = sheetDataReader.getDataForColumn(queryColumn);
        List<String> expectedResultList = sheetDataReader.getDataForColumn(expectedResultColumn);

        System.out.println(searchQueryList.toString());
        System.out.println(expectedResultList.toString());
    }

}