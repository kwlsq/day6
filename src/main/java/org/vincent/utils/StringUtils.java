package org.vincent.utils;

import java.lang.String;

public class StringUtils {
    public static String reverse(String inputText) {
        StringBuilder textSB = new StringBuilder();

        for (int i = inputText.length() - 1; i >= 0; i--) {
            textSB.append(inputText.charAt(i));
        }
        return textSB.toString();
    }
}
