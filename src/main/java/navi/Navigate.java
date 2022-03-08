package navi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigate {

	WebDriver driver;
	By navimg = By.xpath("//a[@class='navbar-brand']");
	By form = By.xpath("//a[@class='btn btn-lg' and text()='Complete Web Form']");
	
	
	
	public Navigate(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void openForm()
	{
		clickNavimg();
		clickForm();
	}

	private void clickForm() {
		driver.findElement(navimg).clear();
		
	}

	private void clickNavimg() {
		driver.findElement(form).click();
		
	}
	
	

}
