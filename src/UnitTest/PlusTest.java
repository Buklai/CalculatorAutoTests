package UnitTest;

import UnitTest.Helpers.DriverHelper;
import com.calculator.test.objects.Page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Класс для тестирования операции "Плюс"
 */
public class PlusTest {

    public Page page;
    public AndroidDriver<AndroidElement> androidDriver;

    @BeforeTest
    public void BeforeTest() throws MalformedURLException {
        androidDriver = DriverHelper.initAndroidDriver();
        page = new Page("MainPage");
    }

    /**
     * Сумма двух целых коротких положительных чисел
     */
    @Test
    public void SumTwoIntPositiveSimple() {
        page.inputFieldLeft.click();



        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(419, 1259)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(426, 1445)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(678, 1421)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(406, 1415)).perform();
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("additionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "25.00 + 65.00 = 90.00");
    }

    /**
     * Сумма двух целых коротких и длинных положительных чисел
     */
    @Test
    public void SumTwoIntPositiveComplexSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(136, 1257)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1261)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1266)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(134, 1415)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(406, 1413)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(627, 1408)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(145, 1547)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(674, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1713)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(834, 153)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1261)).perform();
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("additionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "1234567890.00 + 2.00 = 123456791.00");
    }

    /**
     * Сумма двух целых длинных положительных чисел
     */
    @Test
    public void SumTwoIntPositiveComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1408)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1408)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1408)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1408)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1408)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1408)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1408)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(674, 1257)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(674, 1257)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(674, 1257)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(674, 1257)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(674, 1257)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(674, 1257)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(674, 1257)).perform();
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("additionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "5555555.00 + 3333333.00 = 8888888.00");

    }

    /**
     * Сумма двух целых длинных пограничных значений
     */
    @Test
    public void SumTwoIntBorderlineComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1560)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1560)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(134, 1259)).perform();
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("additionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "999999999.00 + 1.00 = 1000000000.00");
    }

    /**
     * Сумма двух целых коротких пограничных значений
     */
    @Test
    public void SumTwoIntBorderlineSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(406, 1709)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(136, 1259)).perform();
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("additionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.00 + 1.00 = 1.00");
    }

    /**
     * Сумма двух дробных коротких чисел
     */
    @Test
    public void SumTwoDoubleSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(140, 1251)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(410, 1257)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(667, 1747)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(402, 1419)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(400, 1398)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(665, 1732)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(140, 1549)).perform();
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("additionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "12.50 + 5.70 = 18.20");
    }

    /**
     * Сумма двух дробных длинных чисел
     */
    @Test
    public void SumTwoDoubleComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(138, 1557)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(667, 1264)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(661, 1724)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(138, 1266)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(402, 1255)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(672, 1266)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(672, 1264)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(672, 1264)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(672, 1264)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(410, 1417)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(136, 1261)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(672, 1739)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(408, 1570)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1264)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1264)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1264)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1264)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(404, 1264)).perform();
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("additionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "73.123333 + 51.822222 = 124.945555");
    }

    /**
     * Сумма двух дробных пограничных значений
     */
    @Test
    public void SumTwoDoubleBorderline() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(402, 1715)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(670, 1730)).perform();
        el1.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(134, 1259)).perform();
        el1.click();
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(406, 1709)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(667, 1732)).perform();
        el2.click();
        (new TouchAction(androidDriver)).tap(PointOption.point(678, 1566)).perform();
        el2.click();
        MobileElement el3 = androidDriver.findElementByAccessibilityId("additionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.10 + 0.90 = 1.00");
    }


}
