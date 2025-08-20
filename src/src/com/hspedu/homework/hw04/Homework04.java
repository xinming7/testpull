package src.com.hspedu.homework.hw04;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class Homework04 {
}

interface Calculator {
    double work(double n1, double n2);
}

class Cellphone{
    public void testWork(Calculator c, double n1, double n2) {
        System.out.println(c.work(n1, n2));
    }
}

class Computer implements Calculator{
    @Override
    public double work(double n1, double n2) {
        return n1 + n2;
    }
}

class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public double work(double n1, double n2) {
                System.out.println("匿名内部类重写了work()方法");
                return n1 + n2;
            }
        };
        System.out.println(calculator.work(10.2, 11.5));

        new Cellphone().testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                System.out.println("匿名内部类重写了work()方法");
                return n1 + n2;
            }
        }, 10, 11);

        System.out.println(new Computer().work(10.2, 11.5));
    }
}
