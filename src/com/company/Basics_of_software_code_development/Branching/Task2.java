package com.company.Basics_of_software_code_development.Branching;
//2. Найти max{min(a, b), min(c, d)}.
public class Task2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 65;
        int c = 85;
        int d = 8;
        System.out.println(Math.max(Math.min(a,b), Math.min(c,d)));
    }
}
