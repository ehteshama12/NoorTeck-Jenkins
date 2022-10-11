package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.Constants;

public class MercuryHompage {
	@FindBy(linkText = "REGISTER")
	WebElement registerLink;
 

	public MercuryHompage() {
		PageFactory.initElements(Constants.driver, this);

	}

	public void clickRegisterLink() {
		registerLink.click();
	}
}
