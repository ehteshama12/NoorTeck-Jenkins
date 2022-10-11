package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;

public class MercuryRegisterPage {
	@FindBy(name = "firstName")
	WebElement firstNameField;

	@FindBy(name = "lastName")
	WebElement lastNameField;

	@FindBy(name = "phone")
	WebElement phoneField;

	@FindBy(name = "userName")
	WebElement emailField;

	@FindBy(name = "address1")
	WebElement addressField;

	@FindBy(name = "city")
	WebElement cityField;

	@FindBy(name = "state")
	WebElement stateField;

	@FindBy(name = "postalCode")
	WebElement postalCodeField;
	@FindBy(name = "country")
	WebElement countryDropdown;

	@FindBy(name = "email")
	WebElement usernameField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(name = "confirmPassword")
	WebElement confirmPasswordField;

	@FindBy(name = "submit")
	WebElement submitButton;

	public MercuryRegisterPage() {
		PageFactory.initElements(Constants.driver, this);

	}

	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void enterPhone(String phone) {
		phoneField.sendKeys(phone);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterAddress(String address) {
		addressField.sendKeys(address);
		
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterPostalCode(String postalCode) {
		postalCodeField.sendKeys(postalCode);
	}

	public void selectCountry(String country) {
		Select obj = new Select(countryDropdown);
		
		obj.selectByVisibleText(country);
	}

	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void enterConfirmPassword(String password) {
		confirmPasswordField.sendKeys(password);
	}

	public void clickSubmit() {
		submitButton.click();
	}

}
