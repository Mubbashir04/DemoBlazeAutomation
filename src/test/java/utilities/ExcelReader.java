package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private Workbook workbook;

	public ExcelReader() {
		try {
			FileInputStream file = new FileInputStream("src/test/resources/testdata/DemoblazeData.xlsx");

			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getCellData(String sheetName, int rowNumber, int cellNumber) {
		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNumber);

		Cell cell = row.getCell(cellNumber);

		return cell.toString();
	}

	public int getRowCount(String sheetName) {
		Sheet sheet = workbook.getSheet(sheetName);

		return sheet.getLastRowNum();
	}

	public int getColumnCount(String sheetName) {
		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(0);

		return row.getLastCellNum();
	}

	public Object[][] getTestData(String sheetName) {
		Sheet sheet = workbook.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum();

		int columnCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}

		return data;
	}
}