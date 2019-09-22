package com.calculator.test.objects.GBoard;

public class GBoard {
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

    public GBoard() {
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
