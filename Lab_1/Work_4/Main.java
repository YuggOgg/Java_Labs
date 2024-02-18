//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Car {
    int power, engineCapacity;
    double width, height, length;
    String licensePlate, color;
    public Car(int power, int engineCapacity, double width, double height, double length, String licensePlate, String color) {
        this.power = power;
        this.engineCapacity = engineCapacity;
        this.width = width;
        this.height = height;
        this.length = length;
        this.licensePlate = licensePlate;
        this.color = color;
    }
}

public class Main {
    static Car[] cars = new Car[10];

    public static void main(String[] args) {
        cars[0] = new Car(150, 2000, 1.8, 1.5, 4.5, "AB1234", "Red");
        cars[1] = new Car(120, 1800, 1.6, 1.4, 4.2, "CD5678", "Blue");
        cars[2] = new Car(200, 2500, 2.0, 1.7, 4.8, "EF9012", "Green");
        cars[3] = new Car(180, 2200, 1.9, 1.6, 4.6, "GH3456", "White");
        cars[4] = new Car(160, 1900, 1.7, 1.5, 4.3, "IJ7890", "Black");
        cars[5] = new Car(170, 2100, 1.8, 1.6, 4.4, "KL1234", "Silver");
        cars[6] = new Car(140, 1700, 1.5, 1.4, 4.0, "MN5678", "Gray");
        cars[7] = new Car(190, 2300, 2.2, 1.8, 5.0, "OP9012", "Yellow");
        cars[8] = new Car(130, 1600, 1.4, 1.3, 4.1, "QR3456", "Purple");
        cars[9] = new Car(150, 2000, 1.7, 1.5, 4.5, "ST7890", "Orange");

        int sumPower = 0, sumCapacity = 0;

        for (Car car : cars){
            sumPower += car.power;
            sumCapacity += car.engineCapacity;
        }

        System.out.println(sumPower);
        System.out.println(sumCapacity);
    }
}