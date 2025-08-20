package com.hspedu.homework.hw05;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        new A().useB();
    }
}

class A {
    private final String name = "小红";
    public void useB() {
        class B {
            private final static String NAME = "小铭";
            public void show() {
                System.out.println("B类中的name " + NAME + " A类中的name " + A.this.name);
            }
        }
        new B().show();
    }
}
