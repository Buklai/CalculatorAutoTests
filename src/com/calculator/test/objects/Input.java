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

        public String getText() {
            return Element.getText();
        }

        public void click(){
            Element.click();
        }
        public void clean() {
            Element.clear();
        }
      public void set(String value){
        Element.setValue(value);
    }
}
