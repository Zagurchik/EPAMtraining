package com.company.Basics_of_software_code_development.Linear_programs;

public class Task3 {
    public static void main(String[] args) {
        double x = 258;
        double y = 165;
        double result;
        result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.println("Result = " + result);
        System.out.println("Sin x = " + Math.sin(x));
        System.out.println("Sin y = " + Math.sin(y));
        System.out.println("Cos y = " + Math.cos(y));
        System.out.println("Cos x = " + Math.cos(x));
        System.out.println("Tan y*x = " + Math.tan(x*y));

    }
}
