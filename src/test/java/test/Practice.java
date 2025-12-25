package test;

import org.testng.annotations.Test;

import Pages.*;
import base.BaseClass;

public class Practice extends BaseClass{
	


	@Test
	public void validateDynamicContent(){
		DynamicContent dynamic = new DynamicContent(getDriver());
		dynamic.navigateToURLandValidate();
		
	}
	
	@Test
	public void validateDynamicControls() {
		DynamicControls dynamiccontrols = new DynamicControls(getDriver());
		dynamiccontrols.validatecontents();
		dynamiccontrols.validateRemoveCheckBox();
		dynamiccontrols.validateaddButton();
		
	}
	
	@Test
	public void valdiateAlerts() {
		JSAlerts jsalerts = new JSAlerts(getDriver());
		jsalerts.valdiateAlerts();
		jsalerts.vaidateJSConfirm();
	}
	
}