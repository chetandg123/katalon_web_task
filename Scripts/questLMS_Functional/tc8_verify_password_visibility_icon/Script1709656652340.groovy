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

WebUI.navigateToUrl(GlobalVariable.quest_url)

String first_name = CustomKeywords.'generate_values.generateRandomFirstName'()

println('../Generated First Name ' + first_name)

WebUI.setText(findTestObject('Object Repository/object_questApp/password/Page_Quest LMS/input_Dual Login_p-inputtext p-component p-_bf18e8'), 
    first_name + '@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/object_questApp/password/Page_Quest LMS/input_Email ID  Mobile Number_p-inputtext p_20a8de'), 
    'HwXnxaZD17M=')

//WebUI.click(findTestObject('Object Repository/object_questApp/password/Page_Quest LMS/i_Email ID  Mobile Number_ng-tns-c110-2 pi _803115'))
//
//WebUI.click(findTestObject('Object Repository/object_questApp/password/Page_Quest LMS/input_Dual Login_p-inputtext p-component p-_bf18e8'))
//
//WebUI.click(findTestObject('Object Repository/object_questApp/password/Page_Quest LMS/i_Email ID  Mobile Number_ng-tns-c110-2 ng-_7e3268'))
WebUI.verifyElementClickable(findTestObject('Object Repository/object_questApp/password/Page_Quest LMS/i_Email ID  Mobile Number_ng-tns-c110-2 pi _803115'))

WebUI.click(findTestObject('Object Repository/object_questApp/password/Page_Quest LMS/i_Email ID  Mobile Number_ng-tns-c110-2 pi _803115'))

//WebUI.verifyElementNotVisible(findTestObject('Object Repository/object_questApp/password/Page_Quest LMS/i_Email ID  Mobile Number_ng-tns-c110-2 ng-_7e3268'))
WebUI.takeScreenshot('Screenshots/password_visible.png')

WebUI.click(findTestObject('Object Repository/object_questApp/password/Page_Quest LMS/i_Email ID  Mobile Number_ng-tns-c110-2 ng-_7e3268'))

WebUI.closeBrowser()

