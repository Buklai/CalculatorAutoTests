package UnitTest;

import UnitTest.Helpers.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Класс для тестирования операции "Минус"
 */
public class MinusTest {

    public AndroidDriver<AndroidElement> androidDriver;

    @BeforeTest
    public void BeforeTest() throws MalformedURLException {
        androidDriver = DriverHelper.initAndroidDriver();
    }

    /**
     * Разность двух целых коротких положительных чисел
     */
    @Test
    public void DeductTwoIntPositiveSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("100");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("50");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "100.00 - 50.00 = 50.00");
    }

    /**
     * Разность двух целых коротких чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoIntNegativeSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("48");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("69");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();


        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "48.00 - 69.00 = -21.00");
    }

    /**
     * Разность двух целых коротких и длинных положительных чисел
     */
    @Test
    public void DeductTwoIntPositiveComplexSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("1234567890");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("15");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "1234567890.00 - 15.00 = 1234567875.00");
    }

    /**
     * Разность двух целых коротких и длинных чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoIntNegativeComplexSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("88");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("65423");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "88.00 - 65423.00 = -65335.00");
    }

    /**
     * Разность двух целых длинных положительных чисел
     */
    @Test
    public void DeductTwoIntPositiveComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("9876543210");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("1234567890");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "9876543210.00 - 1234567890.00 = 8641975320.00");
    }

    /**
     * Разность двух целых длинных чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoIntNegativeComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("1233253");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("5646589");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "1233253.00 - 5646589.00 = -4413336.00");
    }

    /**
     * Разность двух целых пограничных длинных значений с положительным результатом
     */
    @Test
    public void DeductTwoIntBorderlinePositiveComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("9999999");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("11111");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "9999999.00 - 11111.00 = 9988888.00");
    }

    /**
     * Разность двух целых пограничных длинных значений с отрицательным результатом
     */
    @Test
    public void DeductTwoIntBorderlineNegativeComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("111111");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("222222");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "111111.00 - 222222.00 = -111111.00");
    }

    /**
     * Разность двух целых пограничных коротких значений с положительным результатом
     */
    @Test
    public void DeductTwoIntBorderlinePositiveSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("1");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("0");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "1.00 - 0.00 = 1.00");
    }

    /**
     * Разность двух целых пограничных коротких значений с отрицательным результатом
     */
    @Test
    public void DeductTwoIntBorderlineNegativeSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("1");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("9");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "1.00 - 9.00 = -8.00");
    }

    /**
     * Разность двух дробных коротких чисел с положительным результатом
     */
    @Test
    public void DeductTwoDoublePositiveSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("14.97");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("2.65");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "14.97 - 2.65 = 12.32");
    }

    /**
     * Разность двух дробных длинных чисел с положительным результатом
     */
    @Test
    public void DeductTwoDoublePositiveComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("78.945612");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("1.23564");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "78.945612 - 1.23564 = 77.709972");
    }

    /**
     * Разность двух дробных коротких и длинных чисел с положительным результатом
     */
    @Test
    public void DeductTwoDoublePositiveComplexSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("45612");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("17");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "45612.00 - 17.00 = 45595.00");
    }

    /**
     * Разность двух дробных коротких чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleNegativeComplexSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("7");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("321458");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "7.00 - 321458.00 = -321451.00");
    }

    /**
     * Разность двух дробных длинных пограничных значений с положительным результатом
     */
    @Test
    public void DeductTwoDoubleBorderlinePositiveComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("0.9999999");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("0.111111");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.9999999 - 0.111111 = 0.8888889");
    }

    /**
     * Разность двух дробных длинных пограничных значений с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleBorderlineNegativeComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("0.111111");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("0.999999");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.111111 - 0.999999 = -0.888888");
    }

    /**
     * Разность двух дробных коротких пограничных значений с положительным результатом
     */
    @Test
    public void DeductTwoDoubleBorderlinePositiveSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("0.9");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("0.23");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.90 - 0.23 = 0.67");
    }

    /**
     * Разность двух дробных коротких пограничных значений с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleBorderlineNegativeSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("0");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("0.2");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.00 - 0.20 = -0.20");
    }

    /**
     * Разность двух дробных длинных пограничных значений с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleNegativeComplex() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("12.45698741");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("456.8821");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "12.45698741 - 456.8821 = -444,42511259");
    }

    /**
     * Разность двух дробных коротких чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleNegativeSimple() {
        MobileElement el1 = androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("4.6");
        MobileElement el2 = androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("8.9");
        MobileElement el3 = androidDriver.findElementByAccessibilityId("subtractButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "4.6 - 8.9 = -4.3");
    }
}
