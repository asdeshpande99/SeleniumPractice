package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class drag_and_drop {
	private WebDriver driver;

	public drag_and_drop(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private By dragAndDrop = By.xpath("//a[text()='Drag and Drop']");
	
	 private By columnA = By.id("column-a");
	 private By columnB = By.id("column-b");
	
	 public void validateDragAndDrop() throws InterruptedException {
		 	driver.findElement(dragAndDrop).click();
	        WebElement source = driver.findElement(columnA);
	        WebElement target = driver.findElement(columnB);

	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(source, target).perform();

	        // Validation
	        String headerText = source.findElement(By.tagName("header")).getText();
	        Assert.assertEquals(headerText, "B", "Drag and Drop failed");
	        Thread.sleep(10);
	    }
}

