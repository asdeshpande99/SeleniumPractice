package Pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicContent {
	protected WebDriver driver;
	protected WebDriverWait wait;
	private By dynamicContentText = By.xpath("//*[text()='Dynamic Content']");
	private By dynamicContent = By.xpath("//div[@class='large-10 columns']");
	
	
	public DynamicContent(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void navigateToURLandValidate() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicContentText));
		driver.findElement(dynamicContentText).click();
		List<WebElement> webelement= driver.findElements(dynamicContent);
		int count =1;
		
		for(WebElement element : webelement) {
			System.out.println("Element " + count + " " +  element.getText());
			count++;
		}
	}
}
