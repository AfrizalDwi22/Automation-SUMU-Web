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

WebUI.setText(findTestObject('Object Repository/LP-01/Page_/input_Username_username'), 'admin@sumu.or.id')

WebUI.setEncryptedText(findTestObject('Object Repository/LP-01/Page_/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/LP-01/Page_/button_Lupa                                _b75e14'))

WebUI.click(findTestObject('Object Repository/LP-01/Page_Role Management/span_Verifikasi Pengguna_menu-text'))

'Pastikan nama pembuat tampil utuh tanpa terpotong'
WebUI.click(findTestObject('Object Repository/LP-01/Page_Role Management/a_Postingan_flex items-center w-full p-2 te_5f3f98'))

'Pastikan nama pembuat tampil utuh tanpa terpotong\r\n'
WebUI.click(findTestObject('Object Repository/LP-01/Page_Laporan Postingan/img_Block_w-6 h-6 cursor-pointer'))

'Pastikan nama pembuat tampil utuh tanpa terpotong'
WebUI.click(findTestObject('Object Repository/LP-01/Page_Laporan Postingan/div_Detail Postingan_px-5 space-y-5 text-left'))

'Pastikan nama pembuat tampil utuh tanpa terpotong'
WebUI.click(findTestObject('Object Repository/LP-01/Page_Laporan Postingan/p_Detail Postingan_text-gray-500'))

WebUI.closeBrowser()

