package com.calculator.test.objects;

import io.appium.java_client.MobileElement;

public class Input {

        /**
         * Имя поля
         */
        public String Name;

        /**
         * Идентификатор поля
         */
        public String Id;
        public MobileElement Element;

        public Input(String name, String id) {
            Name = name;
            Id = id;
            Element = Page.Driver.findElementByAccessibilityId(id);
        }

        public void click(){
            Element.click();
        }
}
