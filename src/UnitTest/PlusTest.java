package UnitTest;

import com.calculator.test.objects.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Класс для тестирования операции "Плюс"
 */
public class PlusTest {
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
     * Сумма двух целых коротких положительных чисел
     */
    @Test
    public void SumTwoIntPositiveSimple() {
        page.inputFieldLeft.set("25");

        page.inputFieldRight.set("65");

        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "25.00 + 65.00 = 90.00");
    }

    /**
     * Сумма двух целых коротких и длинных положительных чисел
     */
    @Test
    public void SumTwoIntPositiveComplexSimple() {
        page.inputFieldLeft.set("1234567890");

        page.inputFieldRight.set("2");

        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "1234567890.00 + 2.00 = 123456791.00");
    }

    /**
     * Сумма двух целых длинных положительных чисел
     */
    @Test
    public void SumTwoIntPositiveComplex() {
        page.inputFieldLeft.set("5555555");

        page.inputFieldRight.set("3333333");

        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "5555555.00 + 3333333.00 = 8888888.00");
    }

    /**
     * Сумма двух целых длинных пограничных значений
     */
    @Test
    public void SumTwoIntBorderlineComplex() {
        page.inputFieldLeft.set("999999999");

        page.inputFieldRight.set("1");

        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "999999999.00 + 1.00 = 1000000000.0");
    }

    /**
     * Сумма двух целых коротких пограничных значений
     */
    @Test
    public void SumTwoIntBorderlineSimple() {
        page.inputFieldLeft.set("0");

        page.inputFieldRight.set("1");

        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.00 + 1.00 = 1.00");
    }

    /**
     * Сумма двух дробных коротких чисел
     */
    @Test
    public void SumTwoDoubleSimple() {
        page.inputFieldLeft.set("12.5");

        page.inputFieldRight.set("5.7");

        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "12.50 + 5.70 = 18.20");
    }

    /**
     * Сумма двух дробных длинных чисел
     */
    @Test
    public void SumTwoDoubleComplex() {
        page.inputFieldLeft.set("73.123333");

        page.inputFieldRight.set("51.822222");

        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "73.123333 + 51.822222 = 124.945555");
    }

    /**
     * Сумма двух дробных пограничных значений
     */
    @Test
    public void SumTwoDoubleBorderline() {
        page.inputFieldLeft.set("0.1");

        page.inputFieldRight.set("0.9");

        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.10 + 0.90 = 1.00");
    }


}
