package com.company.Strings_and_basics_of_text_processing;
// В строке вставить после каждого символа 'a' символ 'b'.

public class addB {
    public static String toAddB(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char chars = s.charAt(i);
            if (chars == 'a') {
                stringBuilder.append(s.charAt(i));
                stringBuilder.append('b');
            } else stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "day, evening, afternoon";
        System.out.println(toAddB(s));
    }
}
