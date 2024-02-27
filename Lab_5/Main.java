import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int taskIndex = 3;

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();

        switch (taskIndex) {
            case 1:
                task1.StartTask();
                break;
            case 2:
                task2.StartTask();
                break;
            case 3:
                task3.StartTask();
                break;
            case 4:
                task4.StartTask();
                break;
        }
    }
}

class Task1 {
    public void StartTask(){
        double radius = 5.6;
        System.out.println(GetCircleArea(radius));
    }

    private double GetCircleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}

class Task2 {
    public void StartTask(){
        int number1 = 3, number2 = 7, number3 = 2;
        int[] array = {3, 7, 2};

        System.out.println(GetSmallestNumber(number1, number2, number3));
        System.out.println(GetSmallestNumberArray(array));
    }

    private int GetSmallestNumber(int n1, int n2, int n3){
        int n = n1;

        if (n2 < n){
            n = n2;
        }
        if (n3 < n){
            n = n3;
        }

        return n;
    }

    private  int GetSmallestNumberArray(int[] array){
        int n = array[0];

        for (int i : array) {
            if (i < n) {
                n = i;
            }
        }

        return n;
    }
}

class Task3 {
    public void StartTask(){
        int[] array = {3, 7, 2, 5, 7, 8, 3, 5};
        PrintArray(array);
    }

    private void PrintArray(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }
}

class Task4 {
    public void StartTask(){
        int number1 = 3, number2 = 7, number3 = 2;
        int[] array = {3, 7, 2};

        System.out.println(GetMostNumber(number1, number2, number3));
        System.out.println(GetMostNumberArray(array));
    }

    private int GetMostNumber(int n1, int n2, int n3){
        int n = n1;

        if (n2 > n){
            n = n2;
        }
        if (n3 > n){
            n = n3;
        }

        return n;
    }

    private int GetMostNumberArray(int[] array){
        int n = array[0];

        for (int i : array) {
            if (i > n) {
                n = i;
            }
        }

        return n;
    }
}