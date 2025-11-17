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

WebUI.navigateToUrl('https://app-sumu.wins.web.id/')

WebUI.setText(findTestObject('Object Repository/F-05/Page_/input_Username_username'), 'admin@sumu.or.id')

WebUI.setEncryptedText(findTestObject('Object Repository/F-05/Page_/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/F-05/Page_/button_Lupa                                _b75e14'))

WebUI.click(findTestObject('Object Repository/F-05/Page_Role Management/span_Laporan                               _fffbac'))

WebUI.click(findTestObject('Object Repository/F-05/Page_Role Management/a_Forum_flex items-center w-full p-2 text-b_246870'))

WebUI.click(findTestObject('Object Repository/F-05/Page_Forum/img_Aktif_w-6 h-6 cursor-pointer'))

WebUI.click(findTestObject('Object Repository/F-05/Page_Forum/button_Kembali_confirm-delete'))

WebUI.click(findTestObject('Object Repository/F-05/Page_Forum/td_PRM Sukamulya_px-6 py-4 text-sm border b_945b66'))

WebUI.closeBrowser()

