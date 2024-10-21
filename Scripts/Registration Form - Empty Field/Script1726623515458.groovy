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

Mobile.startApplication('D:/Katalon/Appmu-Basic-Test-Case-20240929T084751Z-001/Appmu-Basic-Test-Case/app-delibali-debug (7).apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Registration/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. 8xxxxx (2)'), 0)

Mobile.hideKeyboard()

Mobile.swipe(500, 1500, 500, 500)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (9)'), 0)

Mobile.closeApplication()

