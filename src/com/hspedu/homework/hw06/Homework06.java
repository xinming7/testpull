package com.hspedu.homework.hw06;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        //用Person类的对象作为行使方法的主体
        //初始化人物和交通工具
        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.passRiver();
        tang.passRiver();
        tang.passMountain();
        tang.common();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况骑马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("遇到大河乘船");
    }
}

class Plane implements Vehicles {
    @Override
    public void work() {
        System.out.println("坐飞机过火山");
    }
}

class VehicleFactory {
    //西游记唐僧一直骑的是白龙马，用静态成员可以不用创建VehicleFactory对象，相当于提供交通工具的工具类
    private static Horse horse = new Horse();

    private VehicleFactory() {}

    public static Horse createHorse() {
        return horse;
    }

    public static Boat createBoat() {
        return new Boat();
    }

    public static Plane createPlant() {
        return new Plane();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void passRiver() {
        //过河时，如果1.vehicles为null，就为false
        //          2.vehicles不为Boat，也为false
        //          3.只有当vehicles为Boat时，才是true
        if (!(vehicles instanceof Boat)) {
            vehicles = VehicleFactory.createBoat();
        }
        vehicles.work();
    }

    public void passMountain() {
        if (!(vehicles instanceof Plane)) {
            vehicles = VehicleFactory.createPlant();
        }
        vehicles.work();
    }

    public void common() {
        if (!(vehicles instanceof Horse)) {
            vehicles = VehicleFactory.createHorse();
        }
        vehicles.work();
    }
}
