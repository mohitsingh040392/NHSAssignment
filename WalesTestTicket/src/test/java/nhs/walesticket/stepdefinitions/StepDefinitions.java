package nhs.walesticket.stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import nhs.walesticket.helper.DriverInstance;

public class StepDefinitions {
	
	WebDriver driver = null;
	@Given("User is on the start page")
	public void user_is_on_the_start_page() {
		
		
		driver = DriverInstance.getDriverInstance();	
		DriverInstance.DriverWaitCondtion();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
     	WebElement Start_button = driver.findElement(By.id("next-button"));
     	Start_button.click();
	}
	
	@When("User select country as Wales")
	public void user_select_country_as_Wales() {
		
		WebElement wales_radio_button = driver.findElement(By.id("label-wales"));
		wales_radio_button.click();
		driver.findElement(By.id("next-button")).submit();
		
		
		
	}
	@When("User enters his details")
	public void user_enters_his_details() throws Exception  {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		WebElement dob_day = driver.findElement(By.id("dob-day"));
		dob_day.sendKeys("04");
		
		WebElement dob_month = driver.findElement(By.id("dob-month"));
		dob_month.sendKeys("03");
		WebElement dob_yr = driver.findElement(By.id("dob-year"));
		dob_yr.sendKeys("1992");
		driver.findElement(By.id("next-button")).submit();
		
		wait.until(ExpectedConditions.urlContains("partner"));
		wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.id("label-no"))));
		WebElement partner_radio_button = driver.findElement(By.id("label-no"));
		partner_radio_button.click();
		driver.findElement(By.id("next-button")).submit();
		
		
		wait.until(ExpectedConditions.urlContains("claim"));
		wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.id("label-no"))));
		WebElement claims_radio_button = driver.findElement(By.id("label-no"));
		claims_radio_button.click();
		driver.findElement(By.id("next-button")).submit();
		
		
		wait.until(ExpectedConditions.urlContains("pregnant"));
		wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.id("label-no"))));
		WebElement pregnancy_radio_button = driver.findElement(By.id("label-no"));
		pregnancy_radio_button.click();
		driver.findElement(By.id("next-button")).submit();
		
		
		wait.until(ExpectedConditions.urlContains("pensioner"));
		wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.id("label-no"))));
		WebElement injury_radio_button = driver.findElement(By.id("label-no"));
		injury_radio_button.click();
		driver.findElement(By.id("next-button")).submit();
			
		
		wait.until(ExpectedConditions.urlContains("diabetes"));
		wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.id("label-no"))));
		WebElement diabetes_radio_button = driver.findElement(By.id("label-no"));
		diabetes_radio_button.click();
		driver.findElement(By.id("next-button")).submit();

		
		wait.until(ExpectedConditions.urlContains("glaucoma"));
		wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.id("label-no"))));
		WebElement glaucoma_radio_button = driver.findElement(By.id("label-no"));
		glaucoma_radio_button.click();
		driver.findElement(By.id("next-button")).submit();

		
		wait.until(ExpectedConditions.urlContains("care"));
		wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.id("label-no"))));
		WebElement carehome_radio_button = driver.findElement(By.id("label-no"));
		carehome_radio_button.click();
		driver.findElement(By.id("next-button")).submit();
		
		
		wait.until(ExpectedConditions.urlContains("savings"));
		wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.id("label-no"))));
		WebElement investment_radio_button = driver.findElement(By.id("label-no"));
		investment_radio_button.click();
		driver.findElement(By.id("next-button")).submit();
		
		
	}

	@Then("User gets results of whether will get help with his NHS cost or not")
	public void user_gets_results_of_whether_will_get_help_with_his_NHS_cost_or_not() {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		wait.until(ExpectedConditions.urlContains("result"));
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		
		DriverInstance.setDriverIntanceToNull();
		
		
	}

}
