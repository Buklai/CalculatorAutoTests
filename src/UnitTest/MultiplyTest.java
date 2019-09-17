package UnitTest;

import UnitTest.Helpers.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Класс для тестирования операции "Умножения"
 */
public class MultiplyTest {

    public AndroidDriver<AndroidElement> androidDriver;

    @BeforeTest
    public void BeforeTest() throws MalformedURLException {
        androidDriver = DriverHelper.initAndroidDriver();
    }
    /**
     * Умножение двух целых коротких чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoIntPositiveSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("5");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("4");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "5.00 * 4.00 = 20.00");
    }

    /**
     * Умножение двух целых длинных чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoIntPositiveComplex() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("78945612");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("12345");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "78945612.00 * 12345.00 = 974583580140.00");
    }

    /**
     * Умножение двух целых коротких и длинных чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoIntPositiveSimpleComplex() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("456555555");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("1");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "456555555.00 * 1.00 = 456555555.00");
    }

    /**
     * Умножение двух пограничных длинных значений с положительным результатом
     */
    @Test
    public void MultiplyTwoIntBorderlinePositiveComplex() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("9999999");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("99999");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "9999999.00 * 999999.00 = 9999989000001.00");
    }

    /**
     * Умножение двух целых пограничных коротких значений с положительным результатом
     */
    @Test
    public void MultiplyTwoIntBorderlinePositiveSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("0");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("0");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.00 * 0.00 = 0.00");
    }

    /**
     * Умножение двух дробных коротких чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoDoublePositiveSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("5.56");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("0.2");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "5.56 * 0.20 = 1.112");
    }

    /**
     * Умножение двух дробных длинных чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoDoublePositiveComplex() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("48.521452");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("74.55551");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "48.521452 * 74.55551 = 3617.54159980052");
    }

    /**
     * Умножение двух дробных коротких и длинных чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoDoublePositiveComplexSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("0.789456321");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("0.5");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.789456321 * 0.50 = 0.39472816");
    }

    /**
     * Умножение двух дробных пограничных длинных значений с положительным результатом
     */
    @Test
    public void MultiplyTwoDoubleBorderlinePositiveComplex() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("9.9999999");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("9.99999");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "9.9999999 * 9.99999 = 99.999899000001");
    }

    /**
     * Умножение двух дробных пограничных коротких значений с положительным результатом
     */
    @Test
    public void MultiplyTwoDoubleBorderlinePositiveSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("0.1");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.sendKeys("0.01");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("multiplicationButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.1 * 0.01 = 0.001");
    }
}
