package com.company.Strings_and_basics_of_text_processing;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.
public class Spaces {
    public static String toDeleteSpaces(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = str.trim();
        boolean isSpace = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (!isSpace) {
                    stringBuilder.append(str.charAt(i));
                }
                isSpace = true;
            } else {
                isSpace = false;
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = " Hi. How are you? Do   you   agree with him?    ";
        System.out.println(toDeleteSpaces(s));
    }
}

