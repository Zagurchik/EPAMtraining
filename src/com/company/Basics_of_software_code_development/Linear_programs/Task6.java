package com.company.Basics_of_software_code_development.Linear_programs;

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        System.out.println(task6.aBoolean(-3,2));
    }

    public boolean aBoolean(int x, int y) {
        boolean b = false;
        if (x <= 2 && y <= 4) {
            if (x <= 4 && y >= -3) {
                if (x >= -2 && y <= 4) {
                    if (x >= -4 && y >= -3){
                        b = true;
                    }
                }
            }
        }
        return b;

    }
}
