package com.hspedu.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        CulCirlce3 culCirlce3 = new CulCirlce3(2);
    }
}

class CulCirlce {
    private double radius;
    private final static double PI = 3.14;

    public CulCirlce(double radius) {
        this.radius = radius;
    }
}

class CulCirlce2 {
    private double radius;
    private final static double PI;

    static {
        PI = 3.14;
    }

    public CulCirlce2(double radius) {
        this.radius = radius;
    }
}

class CulCirlce3 {
    private double radius;
    private final double PI;

    public CulCirlce3(double radius) {
        System.out.println("构造器被执行");
        PI = 3.14;
        this.radius = radius;
    }

    {
        System.out.println("代码块被执行");
    }
}
