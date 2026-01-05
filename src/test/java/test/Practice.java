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
		jsalerts.validateJSPrompt();
	}
	
	@Test
    public void validateDragAndDropTest() throws InterruptedException {
       drag_and_drop dragPage = new drag_and_drop(getDriver());
        dragPage.validateDragAndDrop();
    }
	@Test
	public void validateHOvers() {
		Hovers hover = new Hovers(getDriver());
		hover.validateHovers();
	}
	
}