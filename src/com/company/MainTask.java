package com.company;


import java.util.Random;
import java.util.Scanner;

/*1.     Приветствовать любого пользователя при вводе его имени через командную строку.

2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.

3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.*/
public class MainTask {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }*/
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something");
        for (int i = 1; true; i++) {
            StringBuilder builder = new StringBuilder(scanner.nextLine());
            builder.reverse();
            System.out.println(builder.toString());
        }
    }*/
   /* public static void main(String[] args) {
        Random generator = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(500);
            System.out.print(array[i] + " ");
        }
    }*/
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num");
        int [] array = new int [3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array [i] = scanner.nextInt();
        }
        for (int num : array) {
            sum += num;
        }
        System.out.println(sum);
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number 1-12");
        switch (scanner.nextInt()){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Please, try again");
        }
    }
}