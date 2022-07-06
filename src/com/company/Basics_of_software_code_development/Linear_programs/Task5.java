package com.company.Basics_of_software_code_development.Linear_programs;

//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task5 {
    public static void main(String[] args) {
        Task5 time = new Task5();
        int sec = 3_447_328;
        System.out.println(time.clock(sec));
    }

    public  String clock(int second) {
        int min = second / 60;
        int hours = min / 60;
        int second1 = second % 60 ;
        String time = hours + "ч " + min % 60 + "мин " + second1 + "с";
        return time;
    }
}
