package com.calculator.test.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class GBoardButton {
    /**
     * Координаты кнопки
     */
    public int xOffset;
    public int yOffset;
    public TouchAction touchAction;

    public GBoardButton(int x, int y) {
        xOffset = x;
        yOffset = y;
        touchAction = new TouchAction(Page.Driver);
    }

    /**
     * Нажатие кнопки
     */
    public void click() {
        touchAction.tap(PointOption.point(xOffset, yOffset)).perform();
    }
}
