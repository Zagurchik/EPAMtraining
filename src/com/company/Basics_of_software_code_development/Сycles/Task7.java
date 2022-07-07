package com.company.Basics_of_software_code_development.Сycles;

import java.util.Scanner;

//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = m; i < n; i++) {
            System.out.println();
            System.out.print("Делители для числа " + m + " = ");
            for (int j = 2; j < m; j++) {
                if (m % j == 0) {
                    System.out.print(j + " ");
                }
            }
            m++;
        }
    }
}
