package com.stackroute.pe4;//program to replace all d's with f and all l's with t

public class ReplacementOfCharacters {
    public static String replacementOfACharacter(String string) {
        if (string.equals(" ")) {
            return "null";
        } else {
            String result = string.replaceAll("d", "f");//replacing d with f
            String display = result.replaceAll("l", "t"); //replacing l with t
            return display;
        }
    }
}
