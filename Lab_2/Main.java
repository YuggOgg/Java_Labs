import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taskIndex = 41;

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task41 task41 = new Task41();
        Task42 task42 = new Task42();

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
            case 41:
                task41.StartTask();
                break;
            case 42:
                task42.StartTask();
                break;
        }
    }
}

class Task1 {
    public void StartTask(){
        int a = 1, b = 2, c = -3;
        double x1 = 0, x2 = 0;

        double D = CalculateDiscriminant(a, b, c);

        if (D < 0){
            System.out.println("D < 0, тому рівняння немає дійсних коренів");
        }
        else{
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);

            System.out.println(x1);
            System.out.println(x2);
        }
    }

    private double CalculateDiscriminant(int a, int b, int c){
        return Math.pow(b,2) - 4 * a * c;
    }
}

class Task2 {
    public void StartTask(){
        int x = 3, y = -2;
        System.out.println(DetermineQuadrant(x, y));
    }

    private int DetermineQuadrant(int x, int y){
        if (x > 0 && y > 0){ return 1; }
        if (x < 0 && y > 0){ return 2; }
        if (x < 0 && y < 0){ return 3; }
        if (x > 0 && y < 0){ return 4; }
        else { return 0; }
    }
}

class Task3 {
    public void StartTask(){
        int x = 12;

        if (x >= 10 && x <= 99 && (x % 2) == 0){
            System.out.println("Задане число: " + x + " є двозначним і парним");
        }
        else{
            System.out.println("Задане число: " + x + " не є двозначним чи парним");
        }
    }
}

class Task41 {
    public void StartTask(){
        System.out.println("Введіть x = ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

        double f_x = CalculateFunctions(x);
        System.out.println(f_x);
    }

    private double CalculateFunctions(double x){
        double f_x = 0;

        if (x < 0){
            f_x = Math.abs(x + 7);
        }
        else if (0 <= x && x <= 5){
            f_x = Math.sqrt(x) + Math.pow(x - 1, 1f / 4f);
        }
        else if (x > 5){
            f_x = Math.log(x);
        }

        return f_x;
    }
}

class Task42 {
    public void StartTask(){
        Scanner scan = new Scanner(System.in);

        boolean loop = true;
        while (loop){
            System.out.println("Введіть число x = ");
            double x = scan.nextDouble();

            System.out.println("Введіть число y = ");
            double y = scan.nextDouble();

            System.out.println();System.out.println();
            System.out.println("Доступні команди = ");
            System.out.println("1     - Добуток x та y");
            System.out.println("2     - Сума x та y");
            System.out.println("3     - Різниця x та y");
            System.out.println();
            System.out.println("Введіть пункт: ");
            int p = scan.nextInt();

            if (p == 0 || p == 1 || p == 2 || p == 3){
                switch(p){
                    case 1:
                        System.out.println("Добуток: " + (x * y));
                        break;
                    case 2:
                        System.out.println("Сума: " + (x + y));
                        break;
                    case 3:
                        System.out.println("Різниця: " + (x - y));
                        break;
                }

                System.out.println();System.out.println();
                System.out.println("Продовжити?");
                System.out.println("1       - Так");
                System.out.println("0       - Ні");
                int c = scan.nextInt();
                if (c == 0){
                    loop = false;
                }
            }
            else{
                System.out.println("Такий пункт відсутній ");
            }
        }
    }
}

