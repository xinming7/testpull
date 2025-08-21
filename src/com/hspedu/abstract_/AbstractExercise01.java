package com.hspedu.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager tom = new Manager("Tom", 1, 8000, 5000);
        tom.work();
        CommonEmployee max = new CommonEmployee("Max", 20, 3000);
        max.work();
    }
}
