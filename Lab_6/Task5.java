import java.util.Scanner;
class PassengerBaggage {
    private int numItems;

    private double totalWeight;

    public PassengerBaggage() {
        numItems = 0;
        totalWeight = 0;
    }

    public void inputItems() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість предметів: ");
        numItems = scanner.nextInt();
        for (int i = 0; i < numItems; i++) {
            System.out.print("Введіть вагу товару " + (i + 1) + ": ");
            double weight = scanner.nextDouble();
            totalWeight += weight;
        }
    }

    public void displayTotalWeight() {
        System.out.println("Загальна вага багажу: " + totalWeight);
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getNumItems() {
        return numItems;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}

public class Task5 implements TaskInterface{
    public void StartTask(){
        PassengerBaggage bag = new PassengerBaggage();
        bag.inputItems();
        bag.displayTotalWeight();
    }
}
