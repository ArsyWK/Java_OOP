import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Train {
    private Integer serialNumber;
    public Integer serialNumber2;
    int x;

    // No-argument constructor
    public Train() {
        x = 5;
    }

    // Constructor with one parameter
    public Train(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Constructor with two parameters
    public Train(Integer serialNumber, Integer serialNumber2) {
        this.serialNumber = serialNumber;
        this.serialNumber2 = serialNumber2;
    }

    // Constructor with three parameters
    public Train(Integer serialNumber, Integer serialNumber2, int x) {
        this.serialNumber = serialNumber;
        this.serialNumber2 = serialNumber2;
        this.x = x;
    }

    // Getter methods for the private field
    public Integer getSerialNumber() {
        return serialNumber;
    }

    // Getter methods for the public field
    public Integer getSerialNumber2() {
        return serialNumber2;
    }

    public int getX() {
        return x;
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the no-argument constructor
        Train trainNum1 = new Train();
        System.out.println("trainNum1.x: " + trainNum1.x);

        // Using the constructor with one parameter
        Train trainNum2 = new Train(100);
        System.out.println("trainNum2.serialNumber: " + trainNum2.getSerialNumber());

        // Using the constructor with two parameters
        Train trainNum3 = new Train(101, 202);
        System.out.println("trainNum3.serialNumber: " + trainNum3.getSerialNumber());
        System.out.println("trainNum3.serialNumber2: " + trainNum3.getSerialNumber2());

        // Using the constructor with three parameters
        Train trainNum4 = new Train(102, 203, 7);
        System.out.println("trainNum4.serialNumber: " + trainNum4.getSerialNumber());
        System.out.println("trainNum4.serialNumber2: " + trainNum4.getSerialNumber2());
        System.out.println("trainNum4.x: " + trainNum4.getX());
    }
}
