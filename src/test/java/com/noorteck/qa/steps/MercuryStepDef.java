package com.noorteck.qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.MercuryHompage;
import com.noorteck.qa.pages.MercuryRegisterPage;
import com.noorteck.qa.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MercuryStepDef extends Constants {

	@Given("user navigate to Mercury Application")
	public void navigateToApp() {
		String url = "https://demo.guru99.com/test/newtours/index.php";
//		String key = "webdriver.chrome.driver";
//		String path = "C:\\Users\\extre\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe"; 
//		System.setProperty(key, path);
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		mercuryHomeObj = new MercuryHompage();
		mercuryRegisterObj  =new MercuryRegisterPage();
	}

	@Given("User clicks Register Link")
	public void clickRegisterLink() {
		mercuryHomeObj.clickRegisterLink();

	}

	@When("User provides Contact Information {string} {string} {string} {string}")
	public void enterContactInfo(String firstName, String lastName, String phone, String email) {

		mercuryRegisterObj.enterFirstName(firstName);
		mercuryRegisterObj.enterLastName(lastName);
		mercuryRegisterObj.enterPhone(phone);
		mercuryRegisterObj.enterEmail(email);
	}

	@When("User provides Mailing Infomration {string} {string} {string} {string} {string}")
	public void enterMailingInfo(String address, String city, String state, String postalCode, String country) {

		mercuryRegisterObj.enterAddress(address);
		mercuryRegisterObj.enterCity(city);
		mercuryRegisterObj.enterState(state);
		mercuryRegisterObj.enterPostalCode(postalCode);
		mercuryRegisterObj.selectCountry(country);
	}

	@When("User provides User Information {string} {string} {string}")
	public void enterUserInfo(String username, String password, String confirmPassword) {
		mercuryRegisterObj.enterUsername(username);
		mercuryRegisterObj.enterPassword(password);
		mercuryRegisterObj.enterConfirmPassword(confirmPassword);
	}

	@When("User clicks submit button")
	public void clickSubmit() {
		mercuryRegisterObj.clickSubmit();
	}

	@Then("User verifies success message {string}")
	public void verifyMessage(String string) {
		System.out.println("SUCCESS...");
		
		driver.quit();
	}
	
	
 


}
