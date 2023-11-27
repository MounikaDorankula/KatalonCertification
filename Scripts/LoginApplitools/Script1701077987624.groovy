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

WebUI.navigateToUrl('https://demo.applitools.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/ApplitetoolsLogin/Page_ACME Demo App by Applitools/input_Username_username'), 
    'Test123')

WebUI.setEncryptedText(findTestObject('Object Repository/ApplitetoolsLogin/Page_ACME Demo App by Applitools/input_Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/ApplitetoolsLogin/Page_ACME Demo App by Applitools/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/ApplitetoolsLogin/Page_ACME demo app/input_text'), 'Starbucks')

WebUI.sendKeys(findTestObject('Object Repository/ApplitetoolsLogin/Page_ACME demo app/input_text'), Keys.chord(Keys.ENTER))

WebUI.takeElementScreenshot(findTestObject('ApplitetoolsLogin/Page_ACME demo app/span_View Statement'))

WebUI.click(findTestObject('Object Repository/ApplitetoolsLogin/Page_ACME demo app/span_View Statement'))

WebUI.closeBrowser()

