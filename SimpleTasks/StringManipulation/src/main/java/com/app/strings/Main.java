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

            String city = new CapitalizeLetter(cityAndCountry[0].trim()).capitalizeLetter();
            String country = new CapitalizeLetter(cityAndCountry[1].trim()).capitalizeLetter();

            output.append(city).append(" is the capital of ").append(country).append("; ");
        }

        if (!output.isEmpty()) output.setLength(output.toString().trim().length() - 1);

        return output.toString();
    }

}
