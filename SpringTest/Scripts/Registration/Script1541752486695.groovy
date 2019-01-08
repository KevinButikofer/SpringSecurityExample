import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

println(System.getenv('local_addr'))

WebUI.navigateToUrl(('http://' + System.getenv('local_addr')) + '/registration')

WebUI.setText(findTestObject('Page_Registration Form/input_Registration Form_name'), 'user1')

WebUI.setText(findTestObject('Page_Registration Form/input_Registration Form_email'), 'user1@mail.com')

WebUI.setEncryptedText(findTestObject('Page_Registration Form/input_Registration Form_passwo'), 'qkSM9dMGTRU=')

WebUI.click(findTestObject('Page_Registration Form/button_Register User'))

WebUI.verifyTextPresent('User has been registered successfully', false)

WebUI.closeBrowser()

