package com.company.Strings_and_basics_of_text_processing;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”
public class Concatenation {
    public static void main(String[] args) {
        String informatics = "информатика";
        String cake = String.valueOf(informatics.charAt(informatics.indexOf('т')));
         cake += String.valueOf(informatics.charAt(informatics.indexOf('о')));
         cake += String.valueOf(informatics.charAt(informatics.indexOf('р')));
         cake += String.valueOf(informatics.charAt(informatics.indexOf('т')));
        System.out.println(cake);


    }
}
