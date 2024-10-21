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

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.TextView - SKIP (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.Button (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. 8xxxxx (4)'), 0)

//dont forget to check the object repository for every field with text
Mobile.setText(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. 8xxxxx (5)'), '83119349227', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123 (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123 (5)'), 'password', 0)

Mobile.hideKeyboard()
	
Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.Button (9)'), 0)

Mobile.delay(15)

//Mobile.pressBack()

//close the walkthrough text
Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.FrameLayout (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.Button (10)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/com.horcrux.svg.PathView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - Jisooyaaa (2)'), 0)

Mobile.hideKeyboard()

Mobile.swipe(500, 1200, 500, 500)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.TextView - Change Password'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.TextView - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123 (6)'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123 (7)'), 'password', 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123 (8)'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123 (9)'), 'password', 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123 (10)'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123 (11)'), 'password', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Edit Profile/com.horcrux.svg.PathView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/com.horcrux.svg.PathView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/com.horcrux.svg.PathView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.TextView - OK'), 0)

Mobile.delay(7)

Mobile.closeApplication()

