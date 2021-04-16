package stepDefTest;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import java.util.concurrent.TimeUnit;

public class userRegisterStepDefTest {
	public userRegisterStepDefTest() {
		super();
	}

	WebDriver driver;
	private HomePage homePage;
	private JoinNowPage joinNowPage;


	@Before
	public void prepare() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		String baseUrl = "https://moneygaming.qa.gameaccount.com/";
		driver.get(baseUrl);
	}

	@After
	public void cleanUp() {
		driver.close();
	}

	@Given("^I decide to join moneygaming$")
	public void i_am_on_the_moneygaming_home_page() throws Throwable {
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickToJoin();
	}

	@Then("^I should see the page\"([^\"]*)\"$")
    public void i_should_see_the_page_title(String title) throws Throwable {
		joinNowPage = PageFactory.initElements(driver, JoinNowPage.class);
		joinNowPage.shouldVerifyPageTitle(title);
	}

	@Then("^I should see the text on the page \"([^\"]*)\" using xpath \"([^\"]*)\"$")
	public void i_should_see_the_page_title(String text, String xpath) throws Throwable {
		joinNowPage = PageFactory.initElements(driver, JoinNowPage.class);
		joinNowPage.findByExpath(xpath); equals(text);

}
	@Then("^I click to join$")
	public void I_click_to_join() throws Throwable {
		joinNowPage.clickToJoin();
	}

	@Then("^I provide my details as follows:$")
	public void I_provide_my_details_as_follows(DataTable table) throws Throwable {
		joinNowPage.enterDetails();
		joinNowPage.termsAndCondtion();
	}

}