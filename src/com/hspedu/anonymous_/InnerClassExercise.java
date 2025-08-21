package com.hspedu.anonymous_;

public class InnerClassExercise {
    public static void main(String[] args) {
        new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪该起床了");
            }
        }.ring();

        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪该起床了");
            }
        });

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });

    }
}

interface Bell {
    void ring();
}

class Cellphone{
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}
