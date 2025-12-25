package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlerts {
	protected WebDriver driver;
	
	public JSAlerts(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private By clickonJSAlert = By.xpath("//button[text()='Click for JS Alert']");
	private By JSAlert = By.xpath("//a[text()='JavaScript Alerts']");
	private By clickOnJSConfirm = By.xpath("//button[text()='Click for JS Confirm']");
	private By result = By.id("result");
	
	
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

}
