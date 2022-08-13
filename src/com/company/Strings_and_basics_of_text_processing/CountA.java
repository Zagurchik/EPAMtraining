package com.company.Strings_and_basics_of_text_processing;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class CountA {
    static public Integer toCountA(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char chars = s.charAt(i);
            if (chars == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "My name is Dasha";
        System.out.println(toCountA(s));
    }
}
