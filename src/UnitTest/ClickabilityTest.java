package UnitTest;

import UnitTest.Helpers.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Класс для тестирования нажатия клавиш
 */
public class ClickabilityTest {

    public AndroidDriver<AndroidElement> androidDriver;

    @BeforeTest
    public void BeforeTest() throws MalformedURLException {
        androidDriver = DriverHelper.initAndroidDriver();
    }

    /**
     * Тестирование клвиши "Плюс" в левом окне
     */
    @Test
    public void ClickLeftPlus() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("additionButton");
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Минус" в левом окне
     */
    @Test
    public void ClickLeftMinus() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("subtractButton");
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Умножить" в левом окне
     */
    @Test
    public void ClickLeftMultiply() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("multiplicationButton");
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Делить" в левом окне
     */
    @Test
    public void ClickLeftDivide() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("divisionButton");
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Отчистить"
     */
    @Test
    public void ClickLeftDivideReset() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("divisionButton");
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("resetButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "");
    }

    /**
     * Тестирование клвиши "Отчистить" приналичии чисел в окнах
     */
    @Test
    public void ClickNumberReset() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("15");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("2");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("additionButton");
        el3.click();
        MobileElement el4 = androidDriver.findElementByAccessibilityId("resetButton");
        el4.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldLeft").getText(), "");
        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldRight").getText(), "");
        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "");
    }

    /**
     * Тестирование клвиши "Плюс" в правом окне
     */
    @Test
    public void ClickRightPlus() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("additionButton");
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Минус" в правом окне
     */
    @Test
    public void ClickRightMinus() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("subtractButton");
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Умножить" в правом окне
     */
    @Test
    public void ClickRightMultiply() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("additionButton");
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Делить" в правом окне
     */
    @Test
    public void ClickRightDivide() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("divisionButton");
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Очистить" в правом окне введенной клавиши "Плюс"
     */
    @Test
    public void ClickRightPlusReset() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("additionButton");
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("resetButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "");
    }

    /**
     * Тестирование ввода отрицательного числа при использовании клавиши "минус" в приложении в левом окне
     */
    @Test
    public void SystemMinusNumberLeft() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("subtractButton");
        el2.click();
        el2.sendKeys("9");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el3.sendKeys("3");
        MobileElement el4 = androidDriver.findElementByAccessibilityId("additionButton");
        el4.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "-9.00 + 3.00 = -7.00");
    }

    /**
     * Тестирование ввода отрицательного числа при использовании клавиши "минус" на клавиатуре Гугл в левом окне
     */
    @Test
    public void KeyboardMinusNumberLeft() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(940, 1255)).perform();
        el1.click();
        el1.sendKeys("9");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el3.sendKeys("3");
        MobileElement el4 = androidDriver.findElementByAccessibilityId("additionButton");
        el4.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "-9.00 + 3.00 = -7.00");
    }

    /**
     * Тестирование ввода отрицательного числа при использовании функции "вставить"
     */
    @Test
    public void PastMinusNumber() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("-5");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("-5");

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldLeft").getText(), "-5");
        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldRight").getText(), "-5");
    }

    /**
     * Тестирование клавиши "Удалить" на клавиатуре Гугл
     */
    @Test
    public void KeyboardDelete() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("123456789");
        (new TouchAction(androidDriver)).tap(PointOption.point(935, 1566)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(944, 1562)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(942, 1560)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("123456789");
        (new TouchAction(androidDriver)).tap(PointOption.point(940, 1560)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(937, 1560)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(935, 1560)).perform();
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldLeft").getText(), "123456");
        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldRight").getText(), "123456");
    }

    /**
     * Тестирование клавиши "Точка" на клавиатуре Гугл
     */
    @Test
    public void KeyboardDote() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(672, 1737)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(676, 1393)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(410, 1413)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(680, 1726)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1713)).perform();
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldLeft").getText(), "8.6");
        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldRight").getText(), "5.0");
    }

    /**
     * Тестирование клавиши "Запятая" на клавиатуре Гугл
     */
    @Test
    public void KeyboardComma() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(400, 1428)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(138, 1732)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(402, 1417)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1264)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(136, 1741)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(138, 1270)).perform();
        el2.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldLeft").getText(), "5,5");
        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/inputFieldRight").getText(), "2,1");
    }
}
