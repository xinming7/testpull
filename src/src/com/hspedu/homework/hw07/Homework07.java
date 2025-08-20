package src.com.hspedu.homework.hw07;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(42);
//        Car.Air air = car.new Air();
        car.new Air().flow();
        Car car2 = new Car(20);
        car2.new Air().flow();
        Car car3 = new Car(-10);
        car3.new Air().flow();
        Car car4 = new Car(67);
        car4.getAir().flow();

//        new Car(60);
    }
}

class Car {
    private  double temperature;

    Car(double temperature) {
        this.temperature = temperature;
//        new Air().flow();
    }

    class Air {
        public void flow() {
            if ( temperature > 40) {
                System.out.println("吹冷气");
            } else if ( temperature < 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("关闭空调");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }
}

