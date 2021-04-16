package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(joinNow));
		assert (driver.getTitle().contains("Play Online Casino Games Now | MoneyGaming.com"));

	}

	WebDriver driver;
	@FindBy(xpath= "//a[@class='newUser green']")
	private WebElement joinNow;

	@FindBy(xpath= "//a[@class='promoReg green']")
	private WebElement confirmJoinNow;


	@FindBy(css = "div.hamburger__front_lang i.icons.glyph")
	private WebElement contactIcon;

	@FindBy(css = "label.hamburger")
	private WebElement showMenu;

	@FindBy(css = "li.navigation__menu__item a[href='/about/']")
	private WebElement aboutMenu;

	@FindBy(css = "li.navigation__menu__item a[href='/services/']")
	private WebElement servicesMenu;

	@FindBy(css = "li.navigation__menu__item a[href='/cases/']")
	private WebElement workMenu;

	public void clickToJoin(){
    joinNow.click();
	}
}
