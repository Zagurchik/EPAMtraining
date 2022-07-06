package com.company.Basics_of_software_code_development.Branching;
//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
// Определить, будут ли они расположены на одной прямой.
public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println(task3.lieOnStraightLine(2,3,-1,-3,0,-9));
    }
    public boolean lieOnStraightLine (int x1, int y1, int x2, int y2, int x3, int y3){
        return (y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1);
    }
}
