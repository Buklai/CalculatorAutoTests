package com.calculator.test.objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * Класс страницы приложения
 */
public class Page {

    /**
     * Название страницы
     */
    public String Name;


    public Button PlusButton;
    public Button MinusButton;
    public Button DivisionButton;
    public Button MultiplicationButton;
    public Button ResetButton;

    public Input inputFieldLeft;
    public Input inputFieldRight;

    public static final String AppName = "com.vbanthia.androidsampleapp";

    public static AndroidDriver<AndroidElement> Driver;

    public Page(String name) {
        Name = name;

        initPageButtons();
        initPageInputs();
    }

    private void initPageButtons(){
        PlusButton = new Button("Plus", "additionButton");
        MinusButton = new Button( "Minus", "subtractButton");
        DivisionButton = new Button( "Division", "divisionButton");
        MultiplicationButton = new Button( "Multiplication", "multiplicationButton");
        ResetButton = new Button( "Reset", "resetButton");
    }

    private void initPageInputs(){
        inputFieldLeft = new Input( "LeftField","inputFieldLeft");
        inputFieldRight = new Input("RightField", "inputFieldRight");
    }
}
