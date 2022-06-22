package vrr.mvntestngitjenkins.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Email Address']")
	WebElement emailAddress;

	public void enterEmailAddress(String userName) {
		emailAddress.sendKeys(userName);
	}

	@FindBy(id = "password")
	WebElement password;

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	@FindBy(xpath = "//input[@type='submit']")
	WebElement logInButton;

	public void clickLoginButton() {
		logInButton.click();
	}
	@FindBy(xpath="//span[contains(text(),'Your username or password is invalid.')]")
	WebElement loginErrMessage;
	public String getLoginErrMessage() {
		return loginErrMessage.getText();
	}
}
