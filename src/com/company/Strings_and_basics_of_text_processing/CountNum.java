package com.company.Strings_and_basics_of_text_processing;

// В строке найти количество цифр.
public class CountNum {
    public static Integer toCountNum(String str) {
        int count = 0;
        char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < str.length(); i++) {
            for (char num : chars) {
                if (num == str.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "Hi, my name is Dasha, i'm 22 years old";
        System.out.println(toCountNum(string));

    }
}
