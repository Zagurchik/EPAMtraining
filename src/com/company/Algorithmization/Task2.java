package com.company.Algorithmization;

import java.util.Arrays;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[15];
        int z = 12;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (array[i]>z){
                array[i] = z;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
