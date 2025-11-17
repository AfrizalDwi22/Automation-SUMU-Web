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

WebUI.setText(findTestObject('Object Repository/DP-10/Page_/input_Username_username'), 'admin@sumu.or.id')

WebUI.setEncryptedText(findTestObject('Object Repository/DP-10/Page_/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/DP-10/Page_/button_Lupa                                _b75e14'))

WebUI.click(findTestObject('Object Repository/DP-10/Page_Role Management/span_Permission_menu-text'))

WebUI.click(findTestObject('Object Repository/DP-10/Page_Role Management/a_Pengguna_submenu-text'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DP-10/Page_Daftar Pengguna/select_Showing 10 of                    265_cacde6'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/DP-10/Page_Daftar Pengguna/span_Create_font-lato font-bold text-md tex_ebbcc0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/DP-10/Page_Daftar Pengguna/select_Showing 10 of                    265_cacde6'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/DP-10/Page_Daftar Pengguna/div_Create_flex items-center justify-betwee_3cd9d2'))

WebUI.click(findTestObject('Object Repository/DP-10/Page_Daftar Pengguna/span_Create_font-lato font-bold text-md tex_ebbcc0_1'))

WebUI.click(findTestObject('Object Repository/DP-10/Page_Daftar Pengguna/span_Create_font-lato font-bold text-md tex_ebbcc0_1'))

WebUI.closeBrowser()

