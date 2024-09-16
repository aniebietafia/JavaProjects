package com.brints.advancedjava.examples.example03;

public class AdvancedClassesExample03 {
    private String name = "John Smith";

    public void example(int x, int y) {
        int number = 23;

        class Local {
            void method() {
                System.out.println(x + y);
                System.out.println(number);

                System.out.println(name);

            }
        }

        var obj = new Local();
        obj.method();
    }
}
