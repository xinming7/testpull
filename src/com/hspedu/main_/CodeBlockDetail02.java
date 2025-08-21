package com.hspedu.main_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
//        CulCirlce culCirlce = new CulCirlce();
//        culCirlce.setRadius(2);
//        double area = CulCirlce.getPI() * culCirlce.getRadius() * culCirlce.getRadius();
//        System.out.println("Area of CulCirlce is: " + area);
//        CulCirlce2 culCirlce2 = new CulCirlce2();
//        culCirlce2.setRadius(2);
//        CulCirlce2.setPI(3.14);
//        double area2 = CulCirlce2.getPI() * culCirlce2.getRadius() * culCirlce2.getRadius();
//        System.out.println("Area of CulCirlce is: " + area2);
//        CulCirlce3 culCirlce3 = new CulCirlce3();
//        culCirlce3.setRadius(2);
////        CulCirlce3.setPI(3.14);
//        double area3 = CulCirlce3.getPI() * culCirlce3.getRadius() * culCirlce3.getRadius();
//        System.out.println("Area of CulCirlce is: " + area3);
        CulCirlce4 culCirlce4 = new CulCirlce4(2);
//        culCirlce4.setRadius(2);
//        CulCirlce3.setPI(3.14);
        double area4 = CulCirlce4.getPI() * culCirlce4.getRadius() * culCirlce4.getRadius();
        System.out.println("Area of CulCirlce is: " + area4);
    }
}

class CulCirlce {
    private double radius;
    private static double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        CulCirlce.PI = PI;
    }
}

class CulCirlce2 {
    private double radius;
    private static double PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        CulCirlce2.PI = PI;
    }
}

class CulCirlce3 {
    private double radius;
    private static double PI;
    static {
        PI = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        CulCirlce3.PI = PI;
    }
}

class CulCirlce4 {
    private double radius;
    private static double PI;

    public CulCirlce4(double radius) {
        PI = 3.14;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        CulCirlce4.PI = PI;
    }
}

