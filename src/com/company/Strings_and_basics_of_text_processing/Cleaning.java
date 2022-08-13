package com.company.Strings_and_basics_of_text_processing;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".
public class Cleaning {
    public static String toCleaning(String s) {
        StringBuilder cleanString = new StringBuilder(s);
        for (int i = 0; i < cleanString.length(); i++) {
            char chars = cleanString.charAt(i);
            if (chars == ' ') {
                cleanString.deleteCharAt(i);
                i--;
            }
            for (int j = i + 1; j < cleanString.length(); j++) {
                if (chars == cleanString.charAt(j)) {
                    cleanString.deleteCharAt(j);
                }
            }
        }
        return cleanString.toString();
    }

    public static void main(String[] args) {
        String s = "abc cde def";
        System.out.println(toCleaning(s));
    }
}

