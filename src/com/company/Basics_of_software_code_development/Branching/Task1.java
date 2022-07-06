package com.company.Basics_of_software_code_development.Branching;

public class Task1 {
    public static void main(String[] args) {
        int angleOne = 90;
        int angleTwo = 90;
        int angelThree = 180 - (angleOne + angleTwo);
        if (angelThree > 0) {
            System.out.println("the triangle exists");
            if (angelThree == 90 || angleOne == 90 || angleTwo == 90) {
                System.out.println("the triangle is rectangular");
            }else {
                System.out.println("the triangle is not rectangular");
            }
        } else {
            System.out.println("the triangle not exists");
        }
    }

}
