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

WebUI.navigateToUrl(GlobalVariable.quest_url)

WebUI.verifyElementPresent(findTestObject('Object Repository/object_questApp/Page_Quest LMS/img'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/Page_Quest LMS/h1_Welcome to Quest App'), 'Welcome to Quest App')

WebUI.verifyElementPresent(findTestObject('Object Repository/object_questApp/Page_Quest LMS/div_Single Login'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/object_questApp/Page_Quest LMS/div_Dual Login'), 'Dual Login')

WebUI.verifyElementPresent(findTestObject('Object Repository/object_questApp/Page_Quest LMS/span_Login with OTP'), 0)

WebUI.takeScreenshot('Screenshots/login_page.png')

WebUI.closeBrowser()

