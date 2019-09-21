package com.calculator.test.objects;

import io.appium.java_client.MobileElement;

/**
 * Класс кнопки приложения
 */
public class Button {
    /**
     * Имя кнопки
     */
    public String Name;

    /**
     * Идентификатор кнопки
     */
    public String Id;
    public MobileElement Element;

    public Button(String name, String id) {
        Name = name;
        Id = id;
        Element = Page.Driver.findElementByAccessibilityId(id);
    }

    /**
     * Нажатие кнопки
     */
    public void click() {
       Element.click();
    }
}
