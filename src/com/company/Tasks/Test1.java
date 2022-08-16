package com.company.Tasks;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class Test1 {
    int a = 1;
    int b = 2;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void print() {
        System.out.printf("a = %d , b = %d", a, b);
    }

    public int sum() {
        return a + b;
    }

    public int getMax() {
        return Math.max(a, b);
    }
}

