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

WebUI.openBrowser('https://app-sumu.wins.web.id/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('DB-05/Page_/input_Username_username'), 'admin@sumu.or.id')

WebUI.setEncryptedText(findTestObject('DB-05/Page_/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('DB-05/Page_/button_Lupa                                _b75e14'))

WebUI.click(findTestObject('DB-05/Page_Role Management/span_Administrator_menu-text'))

WebUI.click(findTestObject('DB-05/Page_Dashboard/p_Apriana R. Syahuri_mt-2 text-sm text-center font-semibold text-gray-900 truncate w-full'))

WebUI.click(findTestObject('DB-05/Page_Dashboard/p_Apriana R. Syahuri_mt-2 text-sm text-center font-semibold text-gray-900 truncate w-full'))

WebUI.click(findTestObject('DB-05/Page_Dashboard/p_Apriana R. Syahuri_mt-2 text-sm text-center font-semibold text-gray-900 truncate w-full'))

WebUI.closeBrowser()

