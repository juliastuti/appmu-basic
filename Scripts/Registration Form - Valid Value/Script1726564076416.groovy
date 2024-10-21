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

Mobile.tap(findTestObject('Object Repository/Registration/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.view.ViewGroup (3)'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button'), 0)

Mobile.delay(5)

//Mobile.swipe(540, 1200, 540, 540)
//Mobile.scrollUp(10) // Scroll up a little
Mobile.scrollToText('NEXT')

Mobile.scrollToText('Please fill in your personal data completely.')



'Swipe Vertical from top to bottom'
Mobile.swipe(540, 300, 540, 1200)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. John Sbastian'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. John Sbastian (1)'), 'Tester Name', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. johnsbastiangmail.com'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. johnsbastiangmail.com (1)'), 
    'testeremail@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. 8xxxxx'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. 8xxxxx (1)'), '83119349228', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. 29 September 1991'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView - 2024'), 0)

Mobile.swipe(500, 1500, 500, 2500)

Mobile.swipe(500, 1000, 500, 2500)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView - 1977'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.view.View - 21'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. Indonesia'), 0)

Mobile.swipe(500, 1400, 500, 800)

Mobile.swipe(500, 1400, 200, 500)

Mobile.swipe(500, 1400, 500, 200)

Mobile.swipe(500, 1400, 500, 400)

Mobile.swipe(500, 1400, 500, 700)

Mobile.swipe(500, 1400, 500, 700)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView - Indonesia'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. Civil Servant'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView - Other'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. Living Alone'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView - Living alone'), 0)

Mobile.swipe(500, 500, 500, 1500)

Mobile.tap(findTestObject('Object Repository/Registration/com.horcrux.svg.CircleView'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (2)'), 0)

Mobile.swipe(500, 1500, 500, 500)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - 83119349228'), 0)

Mobile.clearText(findTestObject('Object Repository/Registration/android.widget.EditText - 83119349228'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. 8xxxxx'), '83119349201', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. Abc123'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. Abc123 (1)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. same like first password'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - e.g. same like first password (1)'), 
    'password', 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (5)'), 0 //
    )

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView -'), 0)

//Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView -'), 0) //
Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (5)'), 0 //
    )

Mobile.tap(findTestObject('Object Repository/Registration/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (7)'), 0)

Mobile.closeApplication()

