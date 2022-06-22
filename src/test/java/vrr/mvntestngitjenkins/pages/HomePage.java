package vrr.mvntestngitjenkins.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//li[@data-id='41188']/a[@class='dynamic-link']")
	WebElement homeLink;
	public void clickHomeLink() {
		homeLink.click();
	}
	//@FindBy(xpath="//a[contains(@href,'login')]")//a[text()='Sign In']
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signIn;
	public void clickSignIn() {
		signIn.click();
	}
	@FindBy(xpath="//input[@id='bmwradio']")
	WebElement rdoBtnBmw;
	public void clickRdoBtnBmw() {
		rdoBtnBmw.click();
	}
	
	@FindBy(xpath="//input[@id='benzradio']")
	WebElement rdoBtnBenz;
	public void clickRdoBtnBenz(){
		rdoBtnBenz.click();
	}
	
	@FindBy(xpath="//input[@id='hondaradio']")
	WebElement rdoBtnHonda;
	public void clickRdoBtnHonda(){
		rdoBtnHonda.click();
	}
	public WebElement getBenzRdoBtn() {
		return rdoBtnBenz;
	}
	public Boolean isRdoSelected() {
		return rdoBtnBenz.isSelected();
	}
	@FindBy(xpath="//select[@id='carselect']")
	WebElement drpDwnSelect;
	public void indexSelect(int index) {
		Select oSelect = new Select(drpDwnSelect);
		oSelect.selectByIndex(index);
	}
	public void valueSelect(String value) {
		Select oSelect = new Select(drpDwnSelect);
		oSelect.selectByValue(value);
	}
	public void valueDeselect(String value) {
		Select oSelect = new Select(drpDwnSelect);
		oSelect.selectByValue(value);
	}
	
	
	
	@FindBy(xpath="//select[@id='multiple-select-example']")
	WebElement multSelect;
	public void multipleValueSelect(String value) {
		Select oSelect = new Select(multSelect);
		oSelect.selectByValue(value);
		oSelect.selectByIndex(1);
		oSelect.selectByVisibleText("Apple");
		List <WebElement> selectedOptions = oSelect.getAllSelectedOptions();
		for (WebElement option: selectedOptions) {
			System.out.println("Selected Value: "+ option.getText());
		}
	}
	
	@FindBy(xpath="//input[@id='bmwcheck']")
	WebElement chkBoxBmw;
	public void clickBMWChkBox() {
		chkBoxBmw.click();
	}
	
	@FindBy(xpath="//input[@id='benzcheck']")
	WebElement chkBoxBenz;
	
	@FindBy(xpath="//input[@id='hondacheck']")
	WebElement chkBoxHonda;
	
	@FindBy(xpath="//button[@id='openwindow']")
	WebElement btnOpenWindow;
	
	@FindBy(xpath="//button[@id='opentab']")
	WebElement btnOpenTab;
	
	@FindBy(xpath="//a[contains(@href,'login')]")
	WebElement txtEnterYourName;
	
	@FindBy(xpath="//a[contains(@href,'login')]")
	WebElement tblCourses;
	
	@FindBy(xpath="//a[contains(@href,'login')]")
	WebElement btnDisable;
	
	@FindBy(xpath="//a[contains(@href,'login')]")
	WebElement btnEnable;
	
	@FindBy(xpath="//a[contains(@href,'login')]")
	WebElement txtDisableEnable;
	
	@FindBy(xpath="//a[contains(@href,'login')]")
	WebElement btnHide;
	
	@FindBy(xpath="//a[contains(@href,'login')]")
	WebElement btnShow;
	
	@FindBy(xpath="//a[contains(@href,'login')]")
	WebElement txtHideShow;
	
}
