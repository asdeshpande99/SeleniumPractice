package Pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utility.CommonMethods ;

public class Hovers {
	private WebDriver driver;
	private WebDriverWait wait;
	
	private By image= By.xpath("//*[@class='figure']"); 


	public Hovers(WebDriver driver) {
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}	
	
	public void validateHovers() {
		CommonMethods methods = new CommonMethods(this.driver);
		methods.clickOnElement("Hovers");
		List<WebElement> images = driver.findElements(image);
		Actions actions = new Actions(this.driver);
		int count =1;
		for (WebElement img : images ) {
			By hovered_element = By.xpath("//a[@href = '/users/"+count+"']");
			actions.moveToElement(img).perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(hovered_element));

			Assert.assertTrue(
				    driver.findElement(hovered_element).isDisplayed(),
				    "User " + count + " is NOT visible on hover"
				);

			count++;
		}
	}
}
