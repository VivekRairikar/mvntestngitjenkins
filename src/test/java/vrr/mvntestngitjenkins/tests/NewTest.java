package vrr.mvntestngitjenkins.tests;

import org.testng.annotations.Test;

import vrr.mvntestngitjenkins.pages.HomePage;
import vrr.mvntestngitjenkins.pages.LoginPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;



public class NewTest {
	private String baseURL;
	WebDriver driver = new EdgeDriver();
	HomePage homePage = new HomePage(driver);
	LoginPage loginPage = new LoginPage(driver);

	@Test
	public void homePageTest() throws InterruptedException {
		homePage.clickHomeLink();
		homePage.clickSignIn();
		loginPage.enterEmailAddress("test@test.com");
		loginPage.enterPassword("test");
		Thread.sleep(2000);
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

	/**@BeforeTest
	public void beforeTest() {
	
		baseURL = "https://courses.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(baseURL);
	}*/
	@BeforeMethod
	public void preRequisite() {
		System.out.println("Before method from 1st class!!!");
		baseURL = "https://courses.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(baseURL);
	}

}
