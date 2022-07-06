package com.company.Basics_of_software_code_development.Branching;

public class Task5 {
    public static void main(String[] args) {
        double x = 4;
        if (x <= 3) {
            x = Math.pow(x, 2) - (3 * x) + 9;
        } else {
            x = 1 / (Math.pow(x,3) + 6);
        }
        System.out.println("x: " + x);
    }
}
