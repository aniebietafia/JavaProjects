package com.app.strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String userInput =
                """
                        paris, france
                        london, england
                        tokyo, japan
                        abuja, nigeria
                        ontario, canada
                        new delhi, india
                        sao tome, sao tome & principe
                        """;

        StringManipulation stringManipulation = new StringManipulation(userInput);
        String output = stringManipulation.execute();

        System.out.println(output);
    }

}
