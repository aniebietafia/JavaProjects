package com.brints.advancedjava.examples.example02;

public class AdvancedClassesExample02 {
    public static void main(String[] args) {
        var enclosing = new Enclosing();
        var inner = enclosing.new Inner();
    }
}
