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
                        """;

        String output = stringManipulation(userInput);
        System.out.println(output);
    }

    public static String stringManipulation(String input) {
        StringBuilder output = new StringBuilder();
        String[] lines = input.split("\n");

        for (String line : lines) {
            String[] cityAndCountry = line.split(",");

            String city = capitalize(cityAndCountry[0].trim());
            String country = capitalize(cityAndCountry[1].trim());

            output.append(city).append(" is the capital of ").append(country).append("; ");
        }

        if (!output.isEmpty()) output.setLength(output.toString().trim().length() - 1);

        return output.toString();
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
