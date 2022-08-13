package com.company.Strings_and_basics_of_text_processing;

// Проверить, является ли заданное слово палиндромом.
public class Palindrome {
    public static boolean isPalindrome(String s) {
        boolean palindrome = false;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse();
        String reverseString = stringBuilder.toString();
        if (s.equalsIgnoreCase(reverseString)) {
            palindrome = true;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        String s = "довод";
        System.out.println(isPalindrome(s));
    }
}
