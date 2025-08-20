package src.com.hspedu.homework.hw02;

/**
 * @author 小铭同学
 * @version 1.0
 */
public class Homework02 {
}

class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNumber();
    }

    public static int getNextNumber() {
         currentNum += 100;
         return currentNum;
     }

    @Override
    public String toString() {
        return serialNumber + "";
    }
}

class TestFrock {
    public static void main(String[] args) {
        System.out.println("Num="  + Frock.getNextNumber());
        System.out.println("Num="  + Frock.getNextNumber());
        Frock frock = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock + " " + frock2 + " " + frock3);
    }
}
