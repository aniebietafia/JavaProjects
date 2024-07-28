package com.app.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalizeLetter {
    private final String str;

    CapitalizeLetter(String str) {
        this.str = str;
    }

    public String capitalizeLetter() {
        ArrayList<String> stringList = new ArrayList<>();
        if (this.str == null || this.str.isEmpty()) {
            return this.str;
        }
        String[] strings = this.str.split(" ");
        for (String string : strings) {
            String capitalizedWord = string.substring(0, 1).toUpperCase() + string.substring(1);
            stringList.add(capitalizedWord);

        }
        return String.join(" ", stringList);
    }
}
