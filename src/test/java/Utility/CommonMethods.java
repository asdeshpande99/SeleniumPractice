package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	protected WebDriver driver;
	protected WebDriverWait wait;
	public CommonMethods(WebDriver driver) {
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}	
	
	public void clickOnElement(String text) {
		By elementToClick = By.xpath("//*[text()='"+text+"']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementToClick));

		driver.findElement(elementToClick).click();
	}

}
