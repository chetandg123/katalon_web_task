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

WebUI.verifyElementPresent(findTestObject('Object Repository/object_orangeHRM/official/Page_OrangeHRM/img'), 0)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/official/Page_OrangeHRM/img'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/official/Page_Human Resources Management Software  O_31d1a1/h1_Peace of mind is just a few clicks away'), 
    'Peace of mind is just a few clicks away!')

WebUI.verifyElementPresent(findTestObject('Object Repository/object_orangeHRM/official/Page_Human Resources Management Software  O_31d1a1/p_Supercharge your HR team  empower your pe_e04427'), 
    0)

String res = WebUI.verifyElementVisible(findTestObject('Object Repository/object_orangeHRM/official/Page_Human Resources Management Software  O_31d1a1/input_Email_EmailHomePage'))


if(res == 'true') {
	assert true
	
}
else {
	println('Official Dashboard Screen is not Displaying ')
	WebUI.takeScreenshot('Screenshots/official_website_not_opened.png')	
	assert false
}

WebUI.closeBrowser()

