package com.hspedu.exception_;

import java.util.Scanner;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class TryCatchExceptionEx01 {
    public static void main(String[] args) {
        String intputstr = "";
        int num;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入一个整数");
            intputstr = scanner.next();
            try {
                num = Integer.parseInt(intputstr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数:");
            }
        } while (true);
        System.out.println("你输入的整数 = " + num);
    }
}
