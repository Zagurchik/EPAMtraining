package com.company.Strings_and_basics_of_text_processing;

//В строке найти количество чисел.
public class CountNumber {
    public static Integer toCountNumber (String str){
        int count = 0;
        char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < str.length(); i++) {
            for (char num : chars) {
                if (num == str.charAt(i)) {
                    if (str.charAt(i+1)==' '|| str.charAt(i+1)=='-'){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String string = "Hi, my 12 name is 4-56 Dasha, i'm 22 years old";
        System.out.println(toCountNumber(string));

    }
}
