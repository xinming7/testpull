package com.hspedu.exception_.homework;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class Homework0102 {
    public static void main(String[] args) {//利用应用程序的实参来输入参数
        try {
            //这里是自定义判断是否抛出异常，条件+主动throw，检查输入的参数是否为2个
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不正确");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println("res = " + res);
        } catch (ArrayIndexOutOfBoundsException e) {//将运行时可能发生异常的代码统一放入catch块中，再根据异常类型分别捕获
            System.out.println(e.getMessage());;
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输入整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0的异常");
        }
    }

    public static double cal(int n1, int n2) {
        //除数为整数时，才会抛出ArithmeticException
        return n1 / n2;
    }
}
