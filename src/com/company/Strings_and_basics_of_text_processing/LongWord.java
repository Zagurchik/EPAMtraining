package com.company.Strings_and_basics_of_text_processing;

import java.io.IOException;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать
public class LongWord {
    public static String toFindLongWord(String str) {
        String longestWord = "";
        int maxLenght = 0;
        String[] words = str.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLenght) {
                maxLenght = words[i].length();
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) throws IOException {
        String line = "Найти самое длинное слово";
        System.out.println(toFindLongWord(line));
    }
}
