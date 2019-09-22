package com.calculator.test.objects;

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
