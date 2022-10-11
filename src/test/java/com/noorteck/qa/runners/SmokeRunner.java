package com.noorteck.qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		
			features = "src/test/resources/ntk1/", 
			glue = {"steps" },
			plugin = {"pretty", "html:target/cucumber.html",
					  "json:target/cucumber.json"},
			monochrome = true
	
			
		)

public class SmokeRunner {
	


}
 

