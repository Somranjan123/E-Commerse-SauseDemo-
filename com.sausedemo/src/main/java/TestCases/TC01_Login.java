package TestCases;
import org.testng.annotations.Test;

import com.sausedemo.Pages.Login;
import com.sausedemo.Pages.Logout;

import Utility.BaseClass;


public class TC01_Login extends Login{


	
	@Test
	    public static void tc001(){
		BaseClass.openApplication();
		Login.login();
	    Logout.logout();
	    BaseClass.closeApplication();
	}
	}


