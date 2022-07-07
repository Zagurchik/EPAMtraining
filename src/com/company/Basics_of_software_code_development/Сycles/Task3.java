package com.company.Basics_of_software_code_development.Сycles;
//3. Найти сумму квадратов первых ста чисел.
public class Task3 {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 0; i < 100; i++) {
            result += Math.pow(i,2);
        }
        System.out.println(result);
    }
}
