package com.company.Basics_of_software_code_development.Сycles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        HashSet <Double> hashSet = new HashSet<>();
        ArrayList<Double> arrayList1 = new ArrayList<>();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        arrayList1 = arrayNumbers(num1);
        arrayList2 = arrayNumbers(num2);
        for (int i = 0; i < arrayList1.size(); i++) {
            double num = arrayList1.get(i);
            for (int j = 0; j < arrayList2.size(); j++) {
               if (num == arrayList2.get(j))
                   hashSet.add(num);
            }
        }
        System.out.println(hashSet);
    }

    public static ArrayList arrayNumbers(double num) {
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            if (num % 10 > 0) {
                arrayList.add(i, num % 10);
                num = Math.floor(num / 10);
            }
        }
        return arrayList;
    }
}
