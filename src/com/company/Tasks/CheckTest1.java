package com.company.Tasks;

public class CheckTest1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1(1,2);
        test1.print();
        test1.setA(3);
        test1.setB(4);
        System.out.println();
        test1.print();
        System.out.println();
        System.out.println(test1.sum());
        System.out.println(test1.getMax());


    }
}
