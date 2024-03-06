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

String first_name = CustomKeywords.'generate_values.generateRandomFirstName'()

println("../Generated First Name " + first_name)

String last_name = CustomKeywords.'generate_values.generateRandomLastName'()

println("../Generated Last Name " + last_name)

String id = CustomKeywords.'generate_values.generateRandomNumber'()

println("../Generated ID No:  " + id)

WebUI.callTestCase(findTestCase('orangeHRM_Regression/login_to_orangeHRM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/span_PIM'))

WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/h6_PIM'), 'PIM')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input_Employee Full Name_firstName'), 
    first_name)

WebUI.setText(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input_Employee Full Name_middleName'), 
    last_name)

WebUI.setText(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    last_name)

//WebUI.clearText(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'))
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'), 
//    '0367')

WebUI.click(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.doubleClick(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    id)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/h6_QA T'), 0)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/a_Employee List'))

WebUI.setText(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/input'), first_name)

WebUI.click(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/button_Search'))

String res = WebUI.verifyElementText(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/div_qa T'), first_name+ " " +last_name)

if(res == 'true') {
	assert true
	
}
else {
	println('PIM User is not created  ')
	WebUI.takeScreenshot('Screenshots/pim_user_creation_failed.png')
	
	assert false
}


WebUI.click(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('Object Repository/object_orangeHRM/pmi_create/Page_OrangeHRM/button_Yes, Delete'))

WebUI.closeBrowser()

