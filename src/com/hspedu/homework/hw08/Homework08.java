package com.hspedu.homework.hw08;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class Homework08 {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.show();
        //switch中还可以放枚举类enum中的对象，是根据enum类中的ordinal常量系数来比较的
        switch (red) {
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            case BLACK:
                System.out.println("Black");
                break;
            case YELLOW:
                System.out.println("Yellow");
                break;
                default:
                    System.out.println("Unknown");
        }
    }
}

enum Color implements IC {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("redValue=" + redValue + ",greenValue=" + greenValue + ",blueValue=" + blueValue);
    }
}

interface IC {
    void show();
}