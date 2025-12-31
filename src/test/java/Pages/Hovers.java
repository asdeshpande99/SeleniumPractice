package Pages;


import org.openqa.selenium.WebDriver;


import Utility.CommonMethods ;

public class Hovers {
	private WebDriver driver;

	public Hovers(WebDriver driver) {
		super();
		this.driver = driver;
		
	}	
	
	public void validateHovers() {
		CommonMethods methods = new CommonMethods(this.driver);
		methods.clickOnElement("Hovers");
	}
}
