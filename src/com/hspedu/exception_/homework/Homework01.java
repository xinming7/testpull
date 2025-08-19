package com.hspedu.exception_.homework;

import java.util.Scanner;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        while (true) {
            try {
                System.out.println("请输入一个整数n1");
                n1 = Integer.parseInt(scanner.next());
                System.out.println("输入成功");
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是整数！请重新输入...");
            }
        }
        while (true) {
            try {
                System.out.println("请输入第二个整数n2");
                n2 = Integer.parseInt(scanner.next());
                System.out.println("输入成功");
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是整数！请重新输入...");
            }
        }
//        try {
//            System.out.println("n1/n2= " + n1/n2);
//        } catch (Exception e) {
//            System.out.println("n2不能为0");
//        }

        cal(n1, n2);
    }

    public static void cal(int n1, int n2) {
        try {
            System.out.println("n1/n2= " + (double)n1/n2);
        } catch (Exception e) {
            System.out.println("n2不能为0");
        }
    }
}
