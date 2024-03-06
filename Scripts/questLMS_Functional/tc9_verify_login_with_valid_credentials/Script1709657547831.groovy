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

WebUI.navigateToUrl('https://tibil.questapp.dev/lms/login')

WebUI.setText(findTestObject('Object Repository/object_questApp/login_page/Page_Quest LMS/input_Dual Login_p-inputtext p-component p-_bf18e8'), 
    'tibillearner1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/object_questApp/login_page/Page_Quest LMS/input_Email ID  Mobile Number_p-inputtext p_20a8de'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/object_questApp/login_page/Page_Quest LMS/span_Login'))


WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/login_page/Page_Quest LMS/h1_Welcome Tibil'), 
    'Welcome Tibil')

String res = WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/login_page/Page_Quest LMS/h1_Welcome Tibil'), 
    'Welcome Tibil')
if(res == 'true') {
	WebUI.takeScreenshot('Screenshots/dashboard.png')
	assert true
	
}
else {
	println('Dashboard Screen is not Displaying ')
	assert false
}

WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/login_page/Page_Quest LMS/button_Home'), 'Home')

WebUI.closeBrowser()

