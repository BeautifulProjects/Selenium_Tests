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

WebUI.delay(3)

'click | css=.col-sm-3:nth-child(3) > .btn-large |  | '
selenium.click('css=.col-sm-3:nth-child(3) > .btn-large')

WebUI.delay(3)

'click | css=.button-custom:nth-child(1) path |  | '
selenium.click('css=.button-custom:nth-child(1) path')

WebUI.delay(3)

'click | id=saveTr |  | '
selenium.click('id=saveTr')

WebUI.delay(5)

'click | css=.tab-pane:nth-child(1) .green-checkbox:nth-child(1) > label |  | '
selenium.click('css=.tab-pane:nth-child(1) .green-checkbox:nth-child(1) > label')

WebUI.delay(3)

'click | id=frequency |  | '
selenium.click('id=frequency')

WebUI.delay(3)

'select | id=frequency | label=Weekly | '
selenium.select('id=frequency', 'label=Weekly')

WebUI.delay(3)

'click | css=.col-xs-offset-3 > .wcp-btn |  | '
selenium.click('css=.col-xs-offset-3 > .wcp-btn')

WebUI.delay(3)

'click | id=generateRep |  | '
selenium.click('id=generateRep')

'pause | 3000 |  | '
Thread.sleep('3000')

'click | css=.popover-btn-action:nth-child(1) |  | '
selenium.click('css=.popover-btn-action:nth-child(1)')

'pause | 3000 |  | '
Thread.sleep('3000')

'click | css=.cbtn-action:nth-child(2) |  | '
selenium.click('css=.cbtn-action:nth-child(2)')

