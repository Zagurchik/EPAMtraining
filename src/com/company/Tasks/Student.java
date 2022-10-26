package com.company.Tasks;

import java.util.Arrays;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10
public class Student {
    private String surname_N_P;
    private int group;
    private int[] progress;

    public Student(String surname_N_P, int group, int[] progress) {
        this.surname_N_P = surname_N_P;
        this.group = group;
        this.progress = progress;
    }

    public static void printExcellentStudent(Student [] students){
        for (Student student : students) {
            int minGrade = 10;
            int[] ints = student.progress;
            for (int grade : ints) {
                if (grade < minGrade) {
                    minGrade = grade;
                }
            }
            if (minGrade >= 9) {
                System.out.printf("Excellent student: %s, from group %d. %n", student.surname_N_P, student.group);
            }
        }
    }

    @Override
    public String toString() {
        return "Student " +
                "surname_N_P='" + surname_N_P + '\'' +
                ", group=" + group +
                ", progress=" + Arrays.toString(progress) + '\n';
    }


}
