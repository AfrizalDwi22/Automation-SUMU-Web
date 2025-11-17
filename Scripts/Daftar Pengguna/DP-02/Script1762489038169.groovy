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

WebUI.setText(findTestObject('Object Repository/DP-02/Page_/input_Username_username'), 'admin@sumu.or.id')

WebUI.setEncryptedText(findTestObject('Object Repository/DP-02/Page_/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/DP-02/Page_/button_Lupa                                _b75e14'))

WebUI.click(findTestObject('Object Repository/DP-02/Page_Role Management/span_Permission_menu-text'))

WebUI.click(findTestObject('Object Repository/DP-02/Page_Role Management/a_Pengguna_submenu-text'))

WebUI.click(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/button_Export CSV_font-lato px-4 py-2 text-_d0789d'))

'Ubah nama setiap kali mau run '
WebUI.setText(findTestObject('Object Repository/DP-02/Page_Create Pengguna/input_Name_name'), 'Bang Rex')

'Email juga\r\n'
WebUI.setText(findTestObject('Object Repository/DP-02/Page_Create Pengguna/input_Email_email'), 'bangrex2@gmail.com')

'Nomor juga'
WebUI.setText(findTestObject('Object Repository/DP-02/Page_Create Pengguna/input_Nomor WhatsApp_nomor_whatsapp'), '081123454369')

'Password juga'
WebUI.setEncryptedText(findTestObject('Object Repository/DP-02/Page_Create Pengguna/input_Password_password'), 'h2RSL5Jc7LiJxjRnh7nw0g==')

'Password juga\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/DP-02/Page_Create Pengguna/input_Konfirmasi Password_password_confirmation'), 
    'h2RSL5Jc7LiJxjRnh7nw0g==')

WebUI.click(findTestObject('Object Repository/DP-02/Page_Create Pengguna/button_Cancel_ml-3 inline-flex justify-cent_4d7079'))

WebUI.doubleClick(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/td_-_px-6 py-4 text-sm border border-gray-200'))

WebUI.click(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/td_-_px-6 py-4 text-sm border border-gray-200'))

WebUI.doubleClick(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/td_-_px-6 py-4 text-sm border border-gray-200'))

WebUI.click(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/td_-_px-6 py-4 text-sm border border-gray-200'))

WebUI.click(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/td_-_px-6 py-4 text-sm border border-gray-200'))

WebUI.doubleClick(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/td_-_px-4 py-4 text-sm border border-gray-200'))

WebUI.doubleClick(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/td_-_px-4 py-4 text-sm border border-gray-200'))

WebUI.click(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/td_-_px-4 py-4 text-sm border border-gray-200'))

WebUI.click(findTestObject('Object Repository/DP-02/Page_Daftar Pengguna/td_-_px-4 py-4 text-sm border border-gray-200'))

WebUI.closeBrowser()

