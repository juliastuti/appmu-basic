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

//Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.FrameLayout'), 0)
Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. 8xxxxx'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. 8xxxxx (1)'), '83119349227', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile/android.widget.EditText - e.g. Abc123 (1)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.Button (1)'), 0)

Mobile.delay(7)

//close the walkthrough text
Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.FrameLayout (3)'), 0)

//close the walkthrough text part 2
//Mobile.tap(findTestObject('Object Repository/Edit Profile/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/com.horcrux.svg.PathView'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - Bastian'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile/android.widget.EditText - Bastian (1)'), 'Jisooyaaa', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.EditText - bastiansteelgmail.com'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile/android.widget.EditText - bastiansteelgmail.com (1)'), 'jisooya12@gmail.com', 
    0)

Mobile.hideKeyboard()

//Mobile.swipe(500, 1500, 500, 500)

Mobile.scrollToText('EDIT PROFILE')

//Mobile.swipe(540, 1200, 540, 300)

Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.Button (3)'), 0)

Mobile.delay(5)

Mobile.closeApplication()

