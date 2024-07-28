package com.app.strings;

public class StringManipulation {
    private String input;

    public StringManipulation(String input) {
        this.input = input;
    }

    public String execute() {
        StringBuilder output = new StringBuilder();
        String[] lines = this.input.split("\n");

        for (String line : lines) {

            String[] cityAndCountry = line.split(",");

            String city = new CapitalizeLetter(cityAndCountry[0].trim()).capitalizeLetter();
            String country = new CapitalizeLetter(cityAndCountry[1].trim()).capitalizeLetter();

            output.append(city).append(" is the capital of ").append(country).append("; ").append("\n");
        }

        if (!output.isEmpty()) output.setLength(output.toString().trim().length() - 1);

        return output.toString();
    }
}
