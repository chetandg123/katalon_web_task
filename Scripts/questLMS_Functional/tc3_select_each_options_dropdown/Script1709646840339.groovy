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

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div_English'))

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/span_'))

WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div_'), 'ગુજરાતી')

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div_'))

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/span__1'))

WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div__1'), 'ಕನ್ನಡ')

WebUI.takeScreenshot('Screenshots/kannada_language.png')

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div__1'))

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/span__1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/span__1_2'), 'മലയാളം')

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div__1_2'))

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/span__1_2_3'))

WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div__1_2_3'), 'मराठी')

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div__1_2_3'))

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/span__1_2_3_4'))

WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div__1_2_3_4'), 'தமிழ்')

WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div__1_2_3_4'))

//WebUI.click(findTestObject('Object Repository/object_questApp/dropdown/Page_Quest LMS/div__cdk-overlay-backdrop cdk-overlay-trans_79376f'))
WebUI.closeBrowser()

