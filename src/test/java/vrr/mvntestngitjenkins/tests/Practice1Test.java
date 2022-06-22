package vrr.mvntestngitjenkins.tests;

import org.testng.annotations.Test;
import vrr.mvntestngitjenkins.Base;
import vrr.mvntestngitjenkins.pages.HomePage;
import vrr.mvntestngitjenkins.pages.LoginPage;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Practice1Test extends Base {
	private String baseURL;
	HomePage homePage;
	LoginPage loginPage;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		driver = initializeDriver();
	}
	
	@BeforeMethod
	public void preRequisite() throws IOException {
		System.out.println("Before Method!!!");
		
		baseURL = prop.getProperty("url");
		driver.get(baseURL);
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
	}

	@Test(priority = 0)
	public void clickRB() throws InterruptedException {
		homePage.clickRdoBtnBmw();
		Thread.sleep(2000);
		homePage.clickRdoBtnHonda();
		Thread.sleep(2000);
		homePage.clickRdoBtnBenz();
		Thread.sleep(2000);
		Assert.assertTrue(homePage.isRdoSelected());
		// driver.close();
		// driver.quit();
		System.out.println("1st test!!!");
	}

	@Test(priority = 1)
	public void selectFromDropdown() throws Throwable {
		homePage.indexSelect(2);
		Thread.sleep(2000);
		homePage.valueSelect("bmw");
		Thread.sleep(2000);
		// homePage.valueDeselect("BMW");
		// Thread.sleep(2000);
		// driver.close();
		// driver.quit();
		System.out.println("2nd test!!!");
	}

	@Test(priority = 2)
	public void multiSelectExample() {
		homePage.multipleValueSelect("peach");
		// driver.close();
		// driver.quit();
		System.out.println("3rd test!!!");
	}

	@Test(priority = 3)
	public void checkBoxExample() {
		homePage.clickBMWChkBox();
		System.out.println("4th test!!!");
		// driver.quit();
		// driver.close();
	}

	@Test(priority = 4)
	public void loginExample() throws Throwable {
		homePage.clickHomeLink();
		homePage.clickSignIn();
		loginPage.enterEmailAddress("test@test.com");
		loginPage.enterPassword("test");
		Thread.sleep(2000);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getLoginErrMessage(), "Your username or password is invalid. Please try again.");
		// driver.close();
		// driver.quit();
		System.out.println("5th test!!!");
	}

	

	@AfterClass
	public void closing() {
		System.out.println("closing!!!");
		driver.close();
	}
}
