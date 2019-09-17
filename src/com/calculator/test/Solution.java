package com.calculator.test;

import com.calculator.test.objects.Button;

public class Solution {
    public static void main (String[] args) {
        System.out.println("main method invoked");
        var plusButton = new Button("Plus", "com.vbanthia.androidsampleapp:id/additionButton");
        plusButton.click();
    }
}
