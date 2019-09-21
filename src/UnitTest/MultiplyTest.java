package UnitTest;

import com.calculator.test.objects.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Класс для тестирования операции "Умножения"
 */
public class MultiplyTest {
    public Page page;

    @BeforeTest
    public void BeforeTest() {
        page = new Page("MainPage");
    }

    @AfterMethod
    public void AfterMethod() {
        page.inputFieldLeft.clean();
        page.inputFieldRight.clean();
    }
    /**
     * Умножение двух целых коротких чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoIntPositiveSimple() {
        page.inputFieldLeft.set("5");

        page.inputFieldRight.set("4");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "5.00 * 4.00 = 20.00");
    }

    /**
     * Умножение двух целых длинных чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoIntPositiveComplex() {
        page.inputFieldLeft.set("78945612");

        page.inputFieldRight.set("12345");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "78945612.00 * 12345.00 = 974583580140.00");
    }

    /**
     * Умножение двух целых коротких и длинных чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoIntPositiveSimpleComplex() {
        page.inputFieldLeft.set("456555555");

        page.inputFieldRight.set("1");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "456555555.00 * 1.00 = 456555555.00");
    }

    /**
     * Умножение двух пограничных длинных значений с положительным результатом
     */
    @Test
    public void MultiplyTwoIntBorderlinePositiveComplex() {
        page.inputFieldLeft.set("9999999");

        page.inputFieldRight.set("999999");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "9999999.00 * 999999.00 = 9999989000001.00");
    }

    /**
     * Умножение двух целых пограничных коротких значений с положительным результатом
     */
    @Test
    public void MultiplyTwoIntBorderlinePositiveSimple() {
        page.inputFieldLeft.set("0");

        page.inputFieldRight.set("0");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.00 * 0.00 = 0.00");
    }

    /**
     * Умножение двух дробных коротких чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoDoublePositiveSimple() {
        page.inputFieldLeft.set("5.56");

        page.inputFieldRight.set("0.2");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "5.56 * 0.20 = 1.112");
    }

    /**
     * Умножение двух дробных длинных чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoDoublePositiveComplex() {
        page.inputFieldLeft.set("48.521452");

        page.inputFieldRight.set("74.55551");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "48.521452 * 74.55551 = 3617.54159980052");
    }

    /**
     * Умножение двух дробных коротких и длинных чисел с положительным результатом
     */
    @Test
    public void MultiplyTwoDoublePositiveComplexSimple() {
        page.inputFieldLeft.set("0.789456321");

        page.inputFieldRight.set("0.5");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.789456321 * 0.50 = 0.39472816");
    }

    /**
     * Умножение двух дробных пограничных длинных значений с положительным результатом
     */
    @Test
    public void MultiplyTwoDoubleBorderlinePositiveComplex() {
        page.inputFieldLeft.set("9.9999999");

        page.inputFieldRight.set("9.99999");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "9.9999999 * 9.99999 = 99.999899000001");
    }

    /**
     * Умножение двух дробных пограничных коротких значений с положительным результатом
     */
    @Test
    public void MultiplyTwoDoubleBorderlinePositiveSimple() {
        page.inputFieldLeft.set("0.1");

        page.inputFieldRight.set("0.01");

        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.10 * 0.01 = 0.001");
    }
}
