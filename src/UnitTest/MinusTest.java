package UnitTest;

import com.calculator.test.objects.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Класс для тестирования операции "Минус"
 */
public class MinusTest {
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
     * Разность двух целых коротких положительных чисел
     */
    @Test
    public void DeductTwoIntPositiveSimple() {
        page.inputFieldLeft.set("100");

        page.inputFieldRight.set("50");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "100.00 - 50.00 = 50.00");
    }


    /**
     * Разность двух целых коротких чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoIntNegativeSimple() {
        page.inputFieldLeft.set("48");

        page.inputFieldRight.set("69");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "48.00 - 69.00 = -21.00");
    }

    /**
     * Разность двух целых коротких и длинных положительных чисел
     */
    @Test
    public void DeductTwoIntPositiveComplexSimple() {
        page.inputFieldLeft.set("1234567890");

        page.inputFieldRight.set("15");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "1234567890.00 - 15.00 = 1234567875.00");
    }


    /**
     * Разность двух целых коротких и длинных чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoIntNegativeComplexSimple() {
        page.inputFieldLeft.set("88");

        page.inputFieldRight.set("65423");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "88.00 - 65423.00 = -65335.00");
    }

    /**
     * Разность двух целых длинных положительных чисел
     */
    @Test
    public void DeductTwoIntPositiveComplex() {
        page.inputFieldLeft.set("9876543210");

        page.inputFieldRight.set("1234567890");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "9876543210.00 - 1234567890.00 = 8641975320.00");
    }

    /**
     * Разность двух целых длинных чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoIntNegativeComplex() {
        page.inputFieldLeft.set("1233253");

        page.inputFieldRight.set("5646589");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "1233253.00 - 5646589.00 = -4413336.00");
    }

    /**
     * Разность двух целых пограничных длинных значений с положительным результатом
     */
    @Test
    public void DeductTwoIntBorderlinePositiveComplex() {
        page.inputFieldLeft.set("9999999");

        page.inputFieldRight.set("11111");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "9999999.00 - 11111.00 = 9988888.00");
    }

    /**
     * Разность двух целых пограничных длинных значений с отрицательным результатом
     */
    @Test
    public void DeductTwoIntBorderlineNegativeComplex() {
        page.inputFieldLeft.set("111111");

        page.inputFieldRight.set("222222");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "111111.00 - 222222.00 = -111111.00");
    }

    /**
     * Разность двух целых пограничных коротких значений с положительным результатом
     */
    @Test
    public void DeductTwoIntBorderlinePositiveSimple() {
        page.inputFieldLeft.set("1");

        page.inputFieldRight.set("0");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "1.00 - 0.00 = 1.00");
    }

    /**
     * Разность двух целых пограничных коротких значений с отрицательным результатом
     */
    @Test
    public void DeductTwoIntBorderlineNegativeSimple() {
        page.inputFieldLeft.set("1");

        page.inputFieldRight.set("9");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "1.00 - 9.00 = -8.00");
    }

    /**
     * Разность двух дробных коротких чисел с положительным результатом
     */
    @Test
    public void DeductTwoDoublePositiveSimple() {
        page.inputFieldLeft.set("14.97");

        page.inputFieldRight.set("2.65");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "14.97 - 2.65 = 12.32");
    }

    /**
     * Разность двух дробных длинных чисел с положительным результатом
     */
    @Test
    public void DeductTwoDoublePositiveComplex() {
        page.inputFieldLeft.set("78.945612");

        page.inputFieldRight.set("1.23564");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "78.945612 - 1.23564 = 77.709972");
    }

    /**
     * Разность двух дробных коротких и длинных чисел с положительным результатом
     */
    @Test
    public void DeductTwoDoublePositiveComplexSimple() {
        page.inputFieldLeft.set("45612");

        page.inputFieldRight.set("17");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "45612.00 - 17.00 = 45595.00");
    }

    /**
     * Разность двух дробных коротких чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleNegativeComplexSimple() {
        page.inputFieldLeft.set("7");

        page.inputFieldRight.set("321458");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "7.00 - 321458.00 = -321451.00");
    }

    /**
     * Разность двух дробных длинных пограничных значений с положительным результатом
     */
    @Test
    public void DeductTwoDoubleBorderlinePositiveComplex() {
        page.inputFieldLeft.set("0.9999999");

        page.inputFieldRight.set("0.111111");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.9999999 - 0.111111 = 0.8888889");
    }

    /**
     * Разность двух дробных длинных пограничных значений с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleBorderlineNegativeComplex() {
        page.inputFieldLeft.set("0.111111");

        page.inputFieldRight.set("0.999999");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.111111 - 0.999999 = -0.888888");
    }

    /**
     * Разность двух дробных коротких пограничных значений с положительным результатом
     */
    @Test
    public void DeductTwoDoubleBorderlinePositiveSimple() {
        page.inputFieldLeft.set("0.9");

        page.inputFieldRight.set("0.23");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.90 - 0.23 = 0.67");
    }

    /**
     * Разность двух дробных коротких пограничных значений с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleBorderlineNegativeSimple() {
        page.inputFieldLeft.set("0");

        page.inputFieldRight.set("0.2");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.00 - 0.20 = -0.20");
    }

    /**
     * Разность двух дробных длинных пограничных значений с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleNegativeComplex() {
        page.inputFieldLeft.set("12.45698741");

        page.inputFieldRight.set("456.8821");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "12.45698741 - 456.8821 = -444,42511259");
    }

    /**
     * Разность двух дробных коротких чисел с отрицательным результатом
     */
    @Test
    public void DeductTwoDoubleNegativeSimple() {
        page.inputFieldLeft.set("4.6");

        page.inputFieldRight.set("8.9");

        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "4.60 - 8.90 = -4.30");
    }
}
