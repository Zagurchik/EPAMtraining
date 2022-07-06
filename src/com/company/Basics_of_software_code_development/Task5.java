package com.company.Basics_of_software_code_development;

//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task5 {
    public static void main(String[] args) {
        Task5 time = new Task5();
        int sec = 12012;
        System.out.println(time.clock(sec));
    }

    public  String clock(int second) {
        int min = second / 60;
        int hours = min / 60;
        String time = hours + "ч " + min + "мин " + second + "с";
        return time;
    }
}
