package com.app.strings;

public class CapitalizeLetter {
    private final String str;

    CapitalizeLetter(String str) {
        this.str = str;
    }

    public String capitalizeLetter() {
        if (this.str == null || this.str.isEmpty()) {
            return this.str;
        }
        return this.str.substring(0, 1).toUpperCase() + this.str.substring(1);
    }
}
