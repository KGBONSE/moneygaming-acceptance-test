package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class JoinNowPage {
	public JoinNowPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver, 40);
	}

    WebDriver driver;
	@FindBy(xpath= "//input[@class='promoReg green']")
	private WebElement joinNow;

	@FindBy(id="title")
	private WebElement selectTitle;

	@FindBy(id="forename")
	private WebElement enterFirstName;

	@FindBy(name="map(lastName)")
	private WebElement enterLastName;

	@FindBy(id="dobDay")
	private WebElement enterDay;

	@FindBy(id="dobMonth")
	private WebElement enterMonth;

	@FindBy(id="dobYear")
	private WebElement enterYear;

	@FindBy(id="checkbox")
	private WebElement termsCond;

	public void shouldVerifyPageTitle(String title){
		Assert.assertTrue ("page not found", driver.getTitle().contains(title));

	}

	public void findByExpath(String xpath) {
		driver.findElement(By.xpath(xpath)).getText();
	}

	public void clickToJoin() {
      joinNow.click();
      WebDriverWait wait = new WebDriverWait(driver, 40);
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//select[@class='title required error']"))));

	}

	public void enterDetails() {
		selectTitle.sendKeys();
		enterFirstName.sendKeys();
		enterLastName.sendKeys();
		enterDay.sendKeys();
		enterDay.sendKeys();
		enterDay.sendKeys();
	}

	public void termsAndCondtion() {
		termsCond.click();
	}
	}
