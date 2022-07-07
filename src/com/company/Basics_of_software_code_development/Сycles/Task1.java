package com.company.Basics_of_software_code_development.Сycles;

import java.util.Scanner;

//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Введите любое целое положительное число");
        int num = scanner.nextInt();
        if (num > 0 && num % 2 == 0) {
            for (int i = 0; i < num; i++) {
                result += i;
            }
            System.out.println(result);
        } else {
            if (num < 0 || num % 2 != 0) {
                System.out.println("Вы ввели неправильное число");
            }
        }
    }
}
