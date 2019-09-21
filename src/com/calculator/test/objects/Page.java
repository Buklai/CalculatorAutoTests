package com.calculator.test.objects;

import UnitTest.Helpers.DriverHelper;
import com.calculator.test.objects.GBoard.GBoardButton;
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
}
