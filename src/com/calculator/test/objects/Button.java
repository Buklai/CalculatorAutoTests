package com.calculator.test.objects;

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

    public Button(String name, String id) {
        Name = name;
        Id = id;
    }

    /**
     * Нажатие кнопки
     */
    public void Click() {
        System.out.println("Button " + Name + " Clicked");
    }
}
