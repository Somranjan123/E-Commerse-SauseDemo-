package TestCases;

import org.testng.annotations.Test;

import com.sausedemo.Pages.Login;
import com.sausedemo.Pages.Logout;
import com.sausedemo.Pages.ProductCheckOut;
import com.sausedemo.Pages.SearchProduct;

import Utility.BaseClass;

public class TC03_CheckOut extends Login{
	@Test
	public static void tc03Checkout() {
		BaseClass.openApplication();
		Login.login();
		SearchProduct.assertion();
		SearchProduct.searchProduct();
		ProductCheckOut.addToCart();
		ProductCheckOut.cart();
		ProductCheckOut.checkout();
		ProductCheckOut.assertion();
		ProductCheckOut.finish();
		Logout.logout();
		BaseClass.closeApplication();

		
	}

}
