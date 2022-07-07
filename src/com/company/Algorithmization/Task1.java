package com.company.Algorithmization;

import java.util.Arrays;
import java.util.Random;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
public class Task1 {
    public static void main(String[] args) {
        int k = 3;
        int sum = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }
}
