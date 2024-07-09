package TestCases;

import org.testng.annotations.Test;

import com.sausedemo.Pages.Login;
import com.sausedemo.Pages.Logout;
import com.sausedemo.Pages.SearchProduct;

import Utility.BaseClass;

public class TC02_Search_Product extends Login{
	@Test
	public static void tc02() {
		BaseClass.openApplication();
		Login.login();
		SearchProduct.assertion();
		SearchProduct.searchProduct();
		Logout.logout();
		BaseClass.closeApplication();
	}

}
