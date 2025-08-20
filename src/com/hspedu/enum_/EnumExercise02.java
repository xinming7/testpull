package com.hspedu.enum_;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        for (Week days : Week.values()) {
            System.out.println(days.getDayInfo());
        }
    }
}

enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四") , FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private String dayInfo;

    Week(String dayInfo) {
        this.dayInfo = dayInfo;
    }

    public String getDayInfo() {
        return dayInfo;
    }
}