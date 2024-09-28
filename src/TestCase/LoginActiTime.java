package TestCase;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginActiTime extends BaseTest
{
	@Test
	public void loginMethod()
	{
		LoginPage login = new LoginPage(driver);
		login.loginPageMethod();
	}
	
	@Test(dependsOnMethods = "loginMethod")
	public void logoutMethod()
	{
		HomePage homePage = new HomePage(driver);
		homePage.logoutMethod();
	}
}
