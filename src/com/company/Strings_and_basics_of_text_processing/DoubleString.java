package com.company.Strings_and_basics_of_text_processing;

//Из заданной строки получить новую, повторив каждый символ дважды.
public class DoubleString {
    public static String toDoubleString(String s) {
        StringBuilder doubleStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char chars = s.charAt(i);
            doubleStr.append(s.charAt(i));
            doubleStr.append(s.charAt(i));
        }
        return doubleStr.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(toDoubleString(s));
    }
}
