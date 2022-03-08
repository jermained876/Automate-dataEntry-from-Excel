package component;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import file.data;

public class Form {

	By firstNameTextBox  = By.id("first-name");
	By lastNameTextBox  = By.id("last-name");
	By jobTitleTextBox  = By.id("job-title");
	
	By highRadio  = By.id("radio-button-1");  //high school
	By collegeRadio  = By.id("radio-button-2");  // college
	By gradRadio  = By.id("radio-button-3"); // grad school
	
	By maleCheck  = By.id("checkbox-1");  // male
	By femaleCheck  = By.id("checkbox-2"); //female
	By prefCheck  = By.id("checkbox-3"); // Prefer not to say
	
	By selectYear  = By.id("select-menu"); // years
	
	By datepick = By.id("datepicker");
	WebDriver ddriver;
	
	By submitButton = By.xpath("//a[@class='btn btn-lg btn-primary']");
	
	
		public void updateForm(data newdata , WebDriver driver) throws InterruptedException
		{
			this.ddriver = driver;
			setFirstName(newdata.getFirstName());
			Thread.sleep(500);
			setlastName(newdata.getLastName());
			Thread.sleep(500);
			setJobTitle(newdata.getJobTitle());
			Thread.sleep(500);
			setLevel(newdata.getLevel());
			Thread.sleep(500);
			setSex(newdata.getSex());
			Thread.sleep(500);
			setYear(newdata.getYear());
			Thread.sleep(500);
			setDate(newdata.getDate());
			Thread.sleep(500);
			
			// submit 
			
			ddriver.findElement(submitButton).click();
			Thread.sleep(500);
			// verify it was submitted 
			String expected ="Thanks for submitting your form";
			//System.out.println(driver.findElement(By.xpath("//h1")).getText());
			Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(), expected );	
			Thread.sleep(1000);
		}


		private void setDate(String date) {
		
		 WebElement edate =	ddriver.findElement(datepick);
		 	edate.sendKeys(date);
			edate.sendKeys(Keys.ENTER);
		}


		private void setYear(String sex) {
			
			Select yearselect= new Select(ddriver.findElement(selectYear));
			yearselect.selectByVisibleText(sex);
		}


		private void setSex(String sex) {
			
			switch (sex) {
			  case "Male":
			    ddriver.findElement(maleCheck).click();
			    break;
			  case "Female":
				  ddriver.findElement(femaleCheck).click();
			    break;
			  case "Prefer not to say":
				  ddriver.findElement(prefCheck).click();
			    break;
			 
			}
			
		}


		private void setLevel(String level) {
			
		
			
			switch (level) {
			  case "High School":
			    ddriver.findElement(highRadio).click();
			    break;
			  case "College":
				  ddriver.findElement(collegeRadio).click();
			    break;
			  case "Grad School":
				  ddriver.findElement(gradRadio).click();
			    break;
			 
			}
			
		}


		private void setlastName(String lastName) {
			ddriver.findElement(lastNameTextBox).sendKeys(lastName);
			
		}


		private void setJobTitle(String jobTitle) {
			ddriver.findElement(jobTitleTextBox).sendKeys(jobTitle);
			
		}


		private void setFirstName(String firstName) {
			//stem.out.println(ddriver.getPageSource());
			ddriver.findElement(firstNameTextBox ).sendKeys(firstName);
			
		}
	

}
