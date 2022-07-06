package com.company.Basics_of_software_code_development;
//Дано действительное число R вида nnn.ddd (три цифровых разряда
// в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.
public class Task4 {
    public static void main(String[] args) {
        double num = 152.695;
        String stringNum = String.valueOf(num);
        StringBuilder builder = new StringBuilder();
        builder.append(stringNum);
        builder.reverse();
        String reverseStringNum = builder.toString();
        System.out.println(reverseStringNum);
    }
}
