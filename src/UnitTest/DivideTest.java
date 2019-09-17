package UnitTest;

import UnitTest.Helpers.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Класс для тестирования операции "Деления"
 */
public class DivideTest {
    public AndroidDriver<AndroidElement> androidDriver;

    @BeforeTest
    public void BeforeTest() throws MalformedURLException {
        androidDriver = DriverHelper.initAndroidDriver();
    }

    /**
     * Деление двух целых коротких чисел с положительным результатом
     */
    @Test
    public void DivideTwoIntPositiveSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("20");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("5");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "20.00 / 5.00 = 4.00");
    }

    /**
     * Деление двух целых длинных чисел с положительным результатом
     */
    @Test
    public void DivideTwoIntPositiveComplex() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("456123");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("7899999");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "456123.00 / 7899999.00 = 0.0577371");
    }

    /**
     * Деление двух целых коротких и длинных чисел с положительным результатом
     */
    @Test
    public void DivideTwoIntPositiveComplexSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("8");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("456789");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "8.00 / 456789.00 = 0.000017513556587");
    }

    /**
     * Деление двух целых пограничных длинных значений с положительным результатом
     */
    @Test
    public void DivideIntBorderlinePositiveComplex() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("99999999");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("99999");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "99999999.00 / 999999.00 = 100.000099000099");
    }

    /**
     * Деление двух целых пограничных кортких значений с положительным результатом
     */
    @Test
    public void DivideIntBorderlinePositiveSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("2");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("0");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "2.00 / 0.00 = Please, fill the input fields correctly");
    }

    /**
     * Деление двух дробных короткий чисел с положительным результатом
     */
    @Test
    public void DivideTwoDoublePositiveSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("5.56");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("0.2");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "5.56 / 0.20 = 27.80");
    }

    /**
     * Деление двух дробных длинных чисел с положительным результатом
     */
    @Test
    public void DivideTwoDoublePositiveComplex() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("65.412356");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("2.432111");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "65.875233 / 2.432111 = 27.08561944");
    }

    /**
     * Деление двух дробных короткий и длинных чисел с положительным результатом
     */
    @Test
    public void DivideTwoDoublePositiveComplexSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("65.412356");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("0.3");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "65.875233 / 0.30 = 219.58411");
    }

    /**
     * Деление двух дробных пограничных длинных значений с положительным результатом
     */
    @Test
    public void DivideTwoDoubleBorderlinePositiveComplex() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("111.1111");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("0.9999");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "111.1111 / 0.9999 = 111.122212");
    }


    /**
     * Деление двух дробных пограничных коротких значений с положительным результатом
     */
    @Test
    public void DivideTwoDoubleBorderlinePositiveSimple() {
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldLeft");
        el1.click();
        el1.sendKeys("0.1");
        MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("inputFieldRight");
        el2.click();
        el2.sendKeys("0.1");
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("divisionButton");
        el3.click();

        org.testng.Assert.assertEquals(androidDriver.findElementById("com.vbanthia.androidsampleapp:id/resultTextView").getText(), "0.10 / 0.10 = 1");
    }
}
