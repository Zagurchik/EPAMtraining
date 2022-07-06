package com.company.elearn;

import java.io.OutputStream;
import java.util.*;

/*Задание. Ввести n чисел с консоли.
1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

2.     Вывести числа в порядке возрастания (убывания) значений их длины.

3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.*/
public class OptionalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longNum = 0;
        int shortNum = 0;
        int longLenght = 0;
        int shortLenght = 0;
        double average = 0;
        int[] array = new int[5];
        int[] numlenght = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            String num = String.valueOf(array[i]);
            numlenght[i] = num.length();
            if (numlenght[i] > numlenght[0]) {
                longNum = array[i];
                longLenght = numlenght[i];
            }
            if (numlenght[i] < numlenght[0]) {
                shortNum = array[i];
                shortLenght = numlenght[i];
            }
            average += numlenght[i];
        }

        average = average / numlenght.length;

        for (int i = 0; i < array.length; i++) {
            if (numlenght[i] < average) {
                System.out.println("1) " + array[i] + " the lenght: " + numlenght[i] + " ");
            } else {
                System.out.println("2) " + array[i] + " the lenght: " + numlenght[i] + " ");
            }

        }
        System.out.println(average + " ср. арифм.");
        System.out.println("Long num is:" + longNum + " lenght is:" + longLenght);
        System.out.println("Short num is:" + shortNum + " lenght is:" + shortLenght);
    }

}
