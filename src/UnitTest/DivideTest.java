package UnitTest;

import com.calculator.test.objects.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Класс для тестирования операции "Деления"
 */
public class DivideTest {
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
     * Деление двух целых коротких чисел с положительным результатом
     */
    @Test
    public void DivideTwoIntPositiveSimple() {
        page.inputFieldLeft.set("20");

        page.inputFieldRight.set("5");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "20.00 / 5.00 = 4.00");
    }

    /**
     * Деление двух целых длинных чисел с положительным результатом
     */
    @Test
    public void DivideTwoIntPositiveComplex() {
        page.inputFieldLeft.set("456123");

        page.inputFieldRight.set("7899999");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "456123.00 / 7899999.00 = 0.0577371");
    }

    /**
     * Деление двух целых коротких и длинных чисел с положительным результатом
     */
    @Test
    public void DivideTwoIntPositiveComplexSimple() {
        page.inputFieldLeft.set("8");

        page.inputFieldRight.set("456789");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "8.00 / 456789.00 = 0.000017513556587");
    }

    /**
     * Деление двух целых пограничных длинных значений с положительным результатом
     */
    @Test
    public void DivideIntBorderlinePositiveComplex() {
        page.inputFieldLeft.set("99999999");

        page.inputFieldRight.set("999999");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "99999999.00 / 999999.00 = 100.000099000099");
    }

    /**
     * Деление двух целых пограничных кортких значений с положительным результатом
     */
    @Test
    public void DivideIntBorderlinePositiveSimple() {
        page.inputFieldLeft.set("2");

        page.inputFieldRight.set("0");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "2.00 / 0.00 = Error");
    }

    /**
     * Деление двух дробных короткий чисел с положительным результатом
     */
    @Test
    public void DivideTwoDoublePositiveSimple() {
        page.inputFieldLeft.set("5.56");

        page.inputFieldRight.set("0.2");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "5.56 / 0.20 = 27.80");
    }

    /**
     * Деление двух дробных длинных чисел с положительным результатом
     */
    @Test
    public void DivideTwoDoublePositiveComplex() {
        page.inputFieldLeft.set("65.875233");

        page.inputFieldRight.set("2.432111");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "65.875233 / 2.432111 = 27.08561944");
    }

    /**
     * Деление двух дробных короткий и длинных чисел с положительным результатом
     */
    @Test
    public void DivideTwoDoublePositiveComplexSimple() {
        page.inputFieldLeft.set("65.875233");

        page.inputFieldRight.set("0.3");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "65.875233 / 0.30 = 219.58411");
    }

    /**
     * Деление двух дробных пограничных длинных значений с положительным результатом
     */
    @Test
    public void DivideTwoDoubleBorderlinePositiveComplex() {
        page.inputFieldLeft.set("111.1111");

        page.inputFieldRight.set("0.9999");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "111.1111 / 0.9999 = 111.122212");
    }


    /**
     * Деление двух дробных пограничных коротких значений с положительным результатом
     */
    @Test
    public void DivideTwoDoubleBorderlinePositiveSimple() {
        page.inputFieldLeft.set("0.1");

        page.inputFieldRight.set("0.1");

        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "0.10 / 0.10 = 1");
    }
}
