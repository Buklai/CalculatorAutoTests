package com.calculator.test.objects.GBoard;

import UnitTest.Helpers.DriverHelper;
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
        touchAction = new TouchAction(DriverHelper.Driver);
    }

    /**
     * Нажатие кнопки
     */
    public void click() {
        touchAction.tap(PointOption.point(xOffset, yOffset)).perform();
    }
}
