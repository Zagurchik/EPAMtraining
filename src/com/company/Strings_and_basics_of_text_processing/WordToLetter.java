package com.company.Strings_and_basics_of_text_processing;

//2. Замените в строке все вхождения 'word' на 'letter'
public class WordToLetter {
    public static String wordToLetter(String withWord) {
        String withoutWord = withWord.replace("word", "letter");
        return withoutWord;
    }

    public static void main(String[] args) {
        String str = "Hi this is word 'a'";
        System.out.println(wordToLetter(str));
    }
}
