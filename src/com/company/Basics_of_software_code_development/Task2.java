package com.company.Basics_of_software_code_development;

public class Task2 {
    public static void main(String[] args) {
        double a = 3;
        double sqrt;
        double b = 5;
        double c = 7;
        double result;
        double powB;
        double powBm;
        double powA;
        powB = Math.pow(b,2);
        powBm = Math.pow(b,-2);
        sqrt = Math.sqrt(powB + 4*a*c);
        powA = Math.pow(a,3);
        System.out.println(powB + " " + powBm + " " + sqrt + " " + powA);
        result = ((b+sqrt)/(2*a) - ((powA * c) + powBm));
        System.out.println(result);
    }
}
