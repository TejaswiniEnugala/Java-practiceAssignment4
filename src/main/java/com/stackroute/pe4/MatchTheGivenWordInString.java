package com.stackroute.pe4;//Program to find the index of the given pattern string in the given string

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchTheGivenWordInString {
    public String matchTheGivenWordInTheInputString(String string,String patternString)
    {
        String str="";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while(matcher.find()) {
            count++;
          str= str+"found: " + count + " : "
                    + matcher.start() + " - " + matcher.end()+"\n";
        }
return str;
    }
}
