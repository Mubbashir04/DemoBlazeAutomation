package utilities;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	@DataProvider(name = "loginData")
	public Object[][] loginData() {
		ExcelReader excel = new ExcelReader();

		return excel.getTestData("LoginData");
	}

	@DataProvider(name = "signupData")
	public Object[][] signupData() {
		ExcelReader excel = new ExcelReader();

		return excel.getTestData("SignupData");
	}
}