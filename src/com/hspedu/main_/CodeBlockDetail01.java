package com.hspedu.main_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        AA aa = new AA();
        new AA();
    }
}

class AA {
    static {
        System.out.println("AA代码块被执行~");
    }
}