package com.company.Basics_of_software_code_development.Branching;

//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
public class Task4 {
    public boolean sizeHoleAndBrick(int heightHole, int widthHole, int heightBrick, int widthBrick) {
        return ((heightHole + widthHole) * 2 > (heightBrick + widthBrick) * 2);
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.sizeHoleAndBrick(10, 58, 4, 123));
    }
}
