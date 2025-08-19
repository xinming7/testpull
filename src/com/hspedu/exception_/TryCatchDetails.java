package com.hspedu.exception_;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class TryCatchDetails {
    public static int method() {
        int i = 1;//i = 1
        try {
            i++;//1=2
            String[] names = new String[3];
            //检测到异常后try块中的代码不再执行，而是执行对应的catch块
            if (names[1].equals("tom")) { //空指针
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            //因为有finally语句，先执行finally语句，因为finally没有return，所以会有临时变量temp保存要返回的值，最后返回temp！
            return ++i;//i=3=>保存临时变量 temp = 3；
        } finally {//不管是否捕获到异常，finally块都要执行
            ++i; //i=4
            System.out.println("i=" + i);// i = 4
        }
    }

    public static void main(String[] args) {
        System.out.println(method());// 3
    }
}
//i=4,3
