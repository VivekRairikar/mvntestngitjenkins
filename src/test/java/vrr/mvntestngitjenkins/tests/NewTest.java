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

public class NewTest extends Base{
	private String baseURL;
	HomePage homePage;
	LoginPage loginPage;
		
	@BeforeClass
	public void beforeClass() throws IOException {
		driver = initializeDriver();
	}
	
	@BeforeMethod
	public void preRequisite() throws IOException {
		System.out.println("Before method from 1st class!!!");
		
		baseURL = prop.getProperty("url");
		driver.get(baseURL);
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
	}
	

	@Test
	public void homePageTest() throws InterruptedException {
		homePage.clickHomeLink();
		homePage.clickSignIn();
		loginPage.enterEmailAddress("test@test.com");
		loginPage.enterPassword("test");
		Thread.sleep(4000);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getLoginErrMessage(), "Your username or password is invalid. Please try again.");
		//driver.close();
		System.out.println("New Test - first test!!!");
	}
	@Test(groups = {"imp"})
	public void secondTest() {
		System.out.println("New Test - second test!!!");
	}
	@Test(groups = {"imp"})
	public void thirdTest() {
		System.out.println("New Test - 3rd test!!!");
	}
	@Test(groups = {"imp"})
	public void fourthTest() {
		System.out.println("New Test - 4th test!!!");
	}
	@Test(groups = {"imp"})
	public void fifthTest() {
		System.out.println("New Test - 5th test!!!");
	}

	/**@throws IOException 
	 * @BeforeTest
	public void beforeTest() {
	
		baseURL = "https://courses.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(baseURL);
	}*/
	
	@AfterClass
	public void closing() {
		System.out.println("closing!!!");
		driver.close();
	}

}
