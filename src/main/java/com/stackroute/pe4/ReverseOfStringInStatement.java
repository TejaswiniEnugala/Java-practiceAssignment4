package com.stackroute.pe4;//program to reverse each word in the given statement

public class ReverseOfStringInStatement {
    public static String reverseOfStringsOfStatement(String statement) {
        if (statement.length() > 0) {

            String output = "";
            String[] statementSplit = statement.split(" ");
            for (int i = 0; i < statementSplit.length; i++) {
                String input = statementSplit[i] + " ";

                for (int j = input.length() - 1; j >= 0; j--) {
                    String reverse = "";
                    reverse = reverse + input.charAt(j);
                    output = output + reverse;
                }

            }


            return output.trim();

        }
        else {
            return null;
        }
    }
}
