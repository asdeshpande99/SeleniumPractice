package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSAlerts {
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public JSAlerts(WebDriver driver) {
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	}

	private By clickonJSAlert = By.xpath("//button[text()='Click for JS Alert']");
	private By JSAlert = By.xpath("//a[text()='JavaScript Alerts']");
	private By clickOnJSConfirm = By.xpath("//button[text()='Click for JS Confirm']");
	private By result = By.id("result");
	private By clickOnJSPrompt = By.xpath("//button[text()='Click for JS Prompt']");
	
	
	public void valdiateAlerts() {
		driver.findElement(JSAlert).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(clickonJSAlert).click();
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Alert message "+ alert.getText());
		alert.accept();
		System.out.println("Alert result "+driver.findElement(result).getText());
		System.out.println("Alert result "+driver.findElement(result).getText());
		
	}
	
	public void vaidateJSConfirm() {
		driver.findElement(clickOnJSConfirm).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert message :" + alert.getText());
		alert.dismiss();
		System.out.println();
		System.out.println("Alert result "+driver.findElement(result).getText());		
	}
	
	
	public void validateJSPrompt() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnJSPrompt ));
		driver.findElement(clickOnJSPrompt).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert message : "+alert.getText());
		alert.sendKeys("Apoorva here!!!!");
		alert.accept();
		System.out.println("Alert result : "+driver.findElement(result).getText());
		
	}

}
