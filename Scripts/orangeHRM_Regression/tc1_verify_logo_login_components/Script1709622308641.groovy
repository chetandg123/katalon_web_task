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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.navigateToUrl(GlobalVariable.app_url)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_orangeHRM/login_page/Page_OrangeHRM/div_Login_orangehrm-login-branding'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/login_page/Page_OrangeHRM/h5_Login'), 'Login')

//WebUI.verifyElementPresent(findTestObject('Object Repository/object_orangeHRM/login_page/Page_OrangeHRM/input_Username_username'), 
//    0)
//
//def result = WebUI.verifyImagePresent(findTestObject('Object Repository/object_orangeHRM/login_page/Page_OrangeHRM/image_logo'))
//if (result == 'true'){
//	println("Application Logo is exist ")
//}
WebUI.verifyElementPresent(findTestObject('Object Repository/object_orangeHRM/login_page/Page_OrangeHRM/input_Password_password'), 
    0)

String res = WebUI.verifyElementPresent(findTestObject('Object Repository/object_orangeHRM/login_page/Page_OrangeHRM/button_Login'), 
    0)

if(res == 'true') {
	assert true
	
}
else {
	println('Dashboard Screen is not Displaying ')
	WebUI.takeScreenshot('Screenshots/logo_buttons_not_present_at_login_page.png')
	
	assert false
}

WebUI.closeBrowser()

