package com.calculator.test.objects;

import UnitTest.Helpers.DriverHelper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

/**
 * Класс страницы приложения
 */
public class Page {

    /**
     * Название страницы
     */
    public String Name;


    public Button plusButton;
    public Button minusButton;
    public Button divisionButton;
    public Button multiplicationButton;
    public Button resetButton;

    public Input inputFieldLeft;
    public Input inputFieldRight;
    public Input resultTextView;

    public GBoardButton button1;
    public GBoardButton button2;
    public GBoardButton button3;
    public GBoardButton button4;
    public GBoardButton button5;
    public GBoardButton button6;
    public GBoardButton button7;
    public GBoardButton button8;
    public GBoardButton button9;
    public GBoardButton button0;
    public GBoardButton buttonComma;
    public GBoardButton buttonDot;
    public GBoardButton buttonDelete;
    public GBoardButton buttonGBoardMinus;

    public static final String AppName = "com.vbanthia.androidsampleapp";

    public static AndroidDriver<AndroidElement> Driver;

    static {
        try {
            Driver = DriverHelper.initAndroidDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public Page(String name) {
        Name = name;

        initPageButtons();
        initPageInputs();
        initPageGBoardButtons();
    }

    private void initPageButtons(){
        plusButton = new Button("Plus", "additionButton");
        minusButton = new Button( "Minus", "subtractButton");
        divisionButton = new Button( "Division", "divisionButton");
        multiplicationButton = new Button( "Multiplication", "multiplicationButton");
        resetButton = new Button( "Reset", "resetButton");
    }

    private void initPageInputs(){
        inputFieldLeft = new Input( "LeftField","inputFieldLeft");
        inputFieldRight = new Input("RightField", "inputFieldRight");
        resultTextView = new Input("ResultField", "resultTextView");
    }

    private void initPageGBoardButtons(){
        button1 = new GBoardButton(139, 1252);
        button2 = new GBoardButton(403, 1256);
        button3 = new GBoardButton(672, 1257);
        button4 = new GBoardButton(140, 1415);
        button5 = new GBoardButton(406, 1415);
        button6 = new GBoardButton(672, 1415);
        button7 = new GBoardButton(132, 1557);
        button8 = new GBoardButton(404, 1562);
        button9 = new GBoardButton(674, 1562);
        button0 = new GBoardButton(402, 1717);
        buttonComma = new GBoardButton(134, 1730);
        buttonDot = new GBoardButton(667, 1722);
        buttonDelete = new GBoardButton(937, 1564);
        buttonGBoardMinus = new GBoardButton(937, 1257);
    }
}
