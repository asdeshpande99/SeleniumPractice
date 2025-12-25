package Pages;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class DynamicControls {
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public DynamicControls(WebDriver driver) {
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	private By dynamicContolsHeader = By.xpath("//h4[text()='Dynamic Controls']");
	private By dynamicControlText = By.xpath("//*[text()='Dynamic Controls']");
	
	private By checkBox =  By.xpath("//input[@type ='checkbox']");
	private By removebutton = By.xpath("//button[normalize-space(text())='Remove']");
	private By addButton = By.xpath("//button[normalize-space(text())='Add']");
	
	public void validatecontents() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicControlText));
		driver.findElement(dynamicControlText).click();
		Assert.assertEquals(driver.findElement(dynamicContolsHeader).getText(), "Dynamic Controls");
		System.out.println("Current Title" + driver.getTitle());
	}
	
	
	public void validateRemoveCheckBox() {
		System.out.println("Check Box VAlue " + driver.findElement(checkBox).isSelected());
		driver.findElement(checkBox).click();
		System.out.println("Check Box VAlue " + driver.findElement(checkBox).isSelected());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(removebutton).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Check Box Displayed ?  " + driver.findElement(removebutton).isDisplayed());

	}
	
	public void validateaddButton() {
		System.out.println("Add button " + driver.findElement(addButton).isDisplayed());
		driver.findElement(addButton).click();
		System.out.println("checkbox id added ? "+driver.findElement(checkBox).isDisplayed());
	}
}
