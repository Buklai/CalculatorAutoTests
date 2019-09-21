package UnitTest;

import com.calculator.test.objects.GBoard.GBoard;
import com.calculator.test.objects.Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Класс для тестирования нажатия клавиш
 */
public class ClickabilityTest {

    public Page page;
    public GBoard gBoard;

    @BeforeTest
    public void BeforeTest() {
        page = new Page("MainPage");
        gBoard = new GBoard();
    }

    @AfterMethod
    public void AfterMethod() {
        page.inputFieldLeft.clean();
        page.inputFieldRight.clean();
    }

    /**
     * Тестирование клвиши "Плюс" в левом окне
     */
    @Test
    public void ClickLeftPlus() {
        page.inputFieldLeft.click();
        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Минус" в левом окне
     */
    @Test
    public void ClickLeftMinus() {
        page.inputFieldLeft.click();
        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Умножить" в левом окне
     */
    @Test
    public void ClickLeftMultiply() {
        page.inputFieldLeft.click();
        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Делить" в левом окне
     */
    @Test
    public void ClickLeftDivide() {
        page.inputFieldLeft.click();
        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Отчистить" в поле результата
     */
    @Test
    public void ClickLeftDivideReset() {
        page.inputFieldLeft.click();
        page.divisionButton.click();
        page.resetButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "");
    }

    /**
     * Тестирование клвиши "Отчистить" при наличии чисел в окнах
     */
    @Test
    public void ClickNumberReset() {
        page.inputFieldLeft.set("15");
        page.inputFieldRight.set("2");
        page.plusButton.click();
        page.resetButton.click();

        org.testng.Assert.assertEquals(page.inputFieldLeft.getText(), "");
        org.testng.Assert.assertEquals(page.inputFieldRight.getText(), "");
        org.testng.Assert.assertEquals(page.resultTextView.getText(), "");
    }

    /**
     * Тестирование клвиши "Плюс" в правом окне
     */
    @Test
    public void ClickRightPlus() {
        page.inputFieldRight.click();
        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Минус" в правом окне
     */
    @Test
    public void ClickRightMinus() {
        page.inputFieldRight.click();
        page.minusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "Please, fill the input fields correctly");
    }

    /**
     * Тестирование клвиши "Умножить" в правом окне
     */
    @Test
    public void ClickRightMultiply() {
        page.inputFieldRight.click();
        page.multiplicationButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "Please, fill the input fields correctly");
    }
    /**
     * Тестирование клвиши "Делить" в правом окне
     */
    @Test
    public void ClickRightDivide() {
        page.inputFieldRight.click();
        page.divisionButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "Please, fill the input fields correctly");
    }


    /**
     * Тестирование ввода отрицательного числа при использовании клавиши "минус" в приложении в левом окне
     */
    @Test
    public void SystemMinusNumberLeft() {
        page.inputFieldLeft.click();
        page.minusButton.click();
        gBoard.button9.click();

        page.inputFieldRight.set("3");
        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "-9.00 + 3.00 = -7.00");
    }

    /**
     * Тестирование ввода отрицательного числа при использовании клавиши "минус" на клавиатуре Гугл в левом окне
     */
    @Test
    public void KeyboardMinusNumberLeft() {
        page.inputFieldLeft.click();
        gBoard.buttonGBoardMinus.click();
        gBoard.button9.click();

        page.inputFieldRight.set("3");
        page.plusButton.click();

        org.testng.Assert.assertEquals(page.resultTextView.getText(), "-9.00 + 3.00 = -7.00");
    }

    /**
     * Тестирование ввода отрицательного числа при использовании функции "вставить"
     */
    @Test
    public void PastMinusNumber() {
        page.inputFieldLeft.set("-5");

        page.inputFieldRight.set("-5");

        org.testng.Assert.assertEquals(page.inputFieldLeft.getText(), "-5");
        org.testng.Assert.assertEquals(page.inputFieldRight.getText(), "-5");
    }

    /**
     * Тестирование клавиши "Удалить" на клавиатуре Гугл
     */
    @Test
    public void KeyboardDelete() {
        page.inputFieldLeft.set("123456789");
        gBoard.buttonDelete.click();
        gBoard.buttonDelete.click();
        gBoard.buttonDelete.click();


        page.inputFieldRight.set("123456789");
        gBoard.buttonDelete.click();
        gBoard.buttonDelete.click();
        gBoard.buttonDelete.click();

        org.testng.Assert.assertEquals(page.inputFieldLeft.getText(), "123456");
        org.testng.Assert.assertEquals(page.inputFieldRight.getText(), "123456");
    }

    /**
     * Тестирование клавиши "Точка" на клавиатуре Гугл
     */
    @Test
    public void KeyboardDote() {
        page.inputFieldLeft.click();
        gBoard.button8.click();
        gBoard.buttonDot.click();
        gBoard.button6.click();

        page.inputFieldRight.click();
        gBoard.button5.click();
        gBoard.buttonDot.click();
        gBoard.button1.click();

        org.testng.Assert.assertEquals(page.inputFieldLeft.getText(), "8.6");
        org.testng.Assert.assertEquals(page.inputFieldRight.getText(), "5.1");
    }

    /**
     * Тестирование клавиши "Запятая" на клавиатуре Гугл
     */
    @Test
    public void KeyboardComma() {
        page.inputFieldLeft.click();
        gBoard.button5.click();
        gBoard.buttonComma.click();
        gBoard.button7.click();

        page.inputFieldRight.click();
        gBoard.button2.click();
        gBoard.buttonComma.click();
        gBoard.button3.click();

        org.testng.Assert.assertEquals(page.inputFieldLeft.getText(), "5,7");
        org.testng.Assert.assertEquals(page.inputFieldRight.getText(), "2,3");

    }
    @Test
    public void NumberButtons() {
        page.inputFieldLeft.click();
        gBoard.button1.click();
        gBoard.button2.click();
        gBoard.button3.click();
        gBoard.button4.click();
        gBoard.button5.click();
        gBoard.button6.click();
        gBoard.button7.click();
        gBoard.button8.click();
        gBoard.button9.click();
        gBoard.button0.click();

        page.inputFieldRight.click();
        gBoard.button1.click();
        gBoard.button2.click();
        gBoard.button3.click();
        gBoard.button4.click();
        gBoard.button5.click();
        gBoard.button6.click();
        gBoard.button7.click();
        gBoard.button8.click();
        gBoard.button9.click();
        gBoard.button0.click();

        org.testng.Assert.assertEquals(page.inputFieldLeft.getText(), "1234567890");
        org.testng.Assert.assertEquals(page.inputFieldRight.getText(), "1234567890");
    }
}
