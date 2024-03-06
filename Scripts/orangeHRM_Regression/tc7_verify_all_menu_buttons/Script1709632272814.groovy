import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('orangeHRM_Regression/login_to_orangeHRM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Admin'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Admin'), 'Admin')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_PIM'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/div_PIM'), 'PIM')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Leave'))

WebUI.verifyElementPresent(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Leave'), 0)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Time'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Time'), 'Time')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/span_Recruitment'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Recruitment'), 
    'Recruitment')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_My Info'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_PIM'), 'PIM')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Performance'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Performance'), 
    'Performance')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Dashboard'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Dashboard'), 'Dashboard')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Directory'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Directory'), 'Directory')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Maintenance'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Administrator Access'), 
    'Administrator Access')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/button_Cancel'))

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Maintenance'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Administrator Access'), 
    'Administrator Access')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/button_Cancel'))

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Claim'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Claim'), 'Claim')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/a_Buzz'))

String res = WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/menu_buttons/Page_OrangeHRM/h6_Buzz'), 'Buzz')

if(res == 'true') {
	assert true
	
}
else {
	println('Menu Buttons are not working  ')
	WebUI.takeScreenshot('Screenshots/menu_buttons_are_not_working.png')
	
	assert false
}


WebUI.closeBrowser()

