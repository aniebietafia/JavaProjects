package com.brints.advancedjava.examples.example04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AdvancedClassesExample04 {
    public static void main(String[] args) {
        var names = new ArrayList<>(List.of("Joe", "Susan", "John", "Louise"));

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        names.sort(Comparator.comparingInt(String::length));

        System.out.println(names);
    }
}
