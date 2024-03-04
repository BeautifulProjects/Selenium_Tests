import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium as KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable as Callable
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'

'This test case script is generated by Katalon Studio'

'Generated date: 02-Oct-2023 10:22:47 AM'

'File path: C:\\Users\\Ayman\\Downloads\\Selenium Test Cases\\All test cases\\Assessment.side'

'Generated by: akamoun@masaratapp.com'

'----------------------------------------------------'
String baseUrl = 'https://portal.ekareinc.com/#/login'

WebUI.openBrowser('')

WebUI.maximizeWindow()

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

'open |  |  | '
selenium.open('')

WebUI.delay(3)

'type | name=username | ayman100 | '
selenium.type('name=username', 'ayman100')

'type | name=password | Ekaretest@1 | '
selenium.type('name=password', 'Ekaretest@1')

'click | css=.btn-ekare |  | '
selenium.click('css=.btn-ekare')

WebUI.delay(3)

'click | css=.ng-scope:nth-child(1) > .ng-binding:nth-child(5) |  | '
selenium.click('css=.ng-scope:nth-child(1) > .ng-binding:nth-child(5)')

WebUI.delay(3)

'click | css=.col-sm-3:nth-child(2) > .btn-large |  | '
selenium.click('css=.col-sm-3:nth-child(2) > .btn-large')

WebUI.delay(3)

'click | css=.button-custom:nth-child(1) path:nth-child(1) |  | '
selenium.click('css=.button-custom:nth-child(1) path:nth-child(1)')

WebUI.delay(3)

'click | css=.panel:nth-child(2) .panel-title .panel-title |  | '
selenium.click('css=.panel:nth-child(2) .panel-title .panel-title')

WebUI.delay(3)

'click | id=Not-attached |  | '
selenium.click('id=Not-attached')

WebUI.delay(3)

'click | css=.panel:nth-child(3) .panel-title .panel-title |  | '
selenium.click('css=.panel:nth-child(3) .panel-title .panel-title')

WebUI.delay(3)

'click | id=blistering_eruption |  | '
selenium.click('id=blistering_eruption')

WebUI.delay(3)

'click | css=.panel:nth-child(6) .panel-title .panel-title |  | '
selenium.click('css=.panel:nth-child(6) .panel-title .panel-title')

WebUI.delay(3)

'click | id=malodorous |  | '
selenium.click('id=malodorous')

WebUI.delay(3)

'click | css=.panel:nth-child(11) .panel-title .panel-title |  | '
selenium.click('css=.panel:nth-child(11) .panel-title .panel-title')

WebUI.delay(3)

'click | css=.row:nth-child(1) > .col-xs-6:nth-child(2) > .staging |  | '
selenium.click('css=.row:nth-child(1) > .col-xs-6:nth-child(2) > .staging')

WebUI.delay(3)

'click | css=.cbtn-action:nth-child(2) |  | '
selenium.click('css=.cbtn-action:nth-child(2)')
