package com.company.Tasks;


import static com.company.Tasks.Student.printExcellentStudent;

public class StudentTest {
    public static void main(String[] args) {
        Student [] students = new Student[10];
        students[0] = new Student("Jackson M.M.", 215, new int[]{7, 6, 8, 7, 9});
        students[1] = new Student("Ivan I.I.", 200, new int[]{9, 8, 8, 10, 9});
        students[2] = new Student("Borisov M.V.", 215, new int[]{4, 5, 7, 10, 6});
        students[3] = new Student("Krauchuk A.S.", 245, new int[]{10, 10, 10, 10, 10});
        students[4] = new Student("Kovalchuk E.A.", 200, new int[]{7, 6, 8, 7, 9});
        students[5] = new Student("Plotich Y.A.", 245, new int[]{9, 9, 10, 10, 9});
        students[6] = new Student("Davidov I.V.", 215, new int[]{9, 9, 8, 10, 9});
        students[7] = new Student("Tajson M.M.", 215, new int[]{3, 6, 5, 7, 4});
        students[8] = new Student("Tramp D.A.", 215, new int[]{7, 9, 8, 7, 9});
        students[9] = new Student("Mask I.P.", 215, new int[]{10, 9, 9, 10, 9});
        printExcellentStudent(students);
    }
}
