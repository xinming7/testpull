package com.hspedu;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        outer outer = new outer();
        //(1)在外部类的show方法中创建inner对象，并访问inner中的show方法
        outer.show();
        //(2)把new inner()看成是outer的成员，再调用其方法
        outer.inner inner = outer.new inner();
        inner.show();
        //(3)创建outer成员的同时创建inner成员，并调用其show方法
        new outer().new inner().show();

    }
}

class outer {
    private String name = "张三";
    int id = 1;

    class inner {
        public void show() {
            System.out.println("name " + name + " id " + id);
        }
    }

    public void show() {
        inner inner = new inner();
        inner.show();
    }

    public inner getInstance() {
        return new inner();
    }
}
