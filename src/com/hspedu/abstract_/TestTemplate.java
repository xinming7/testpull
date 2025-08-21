package com.hspedu.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.job();
    }
}

class AA {
    public void job() {
        long sum = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10000000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class BB {

}