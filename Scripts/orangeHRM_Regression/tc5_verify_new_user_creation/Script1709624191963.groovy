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

String name = CustomKeywords.'generate_values.generateRandomFirstName'()

println('../Generated First Name ' + name)

WebUI.navigateToUrl(GlobalVariable.app_url)

WebUI.setText(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/input_Username_username'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/button_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/a_Admin'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/div_-- Select --role'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/input'), 'M')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/div_-- Select --role'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    name)

WebUI.setEncryptedText(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/create_user/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

