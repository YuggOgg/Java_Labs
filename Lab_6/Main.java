import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean checkIsExit = true;

        while(checkIsExit){
            int taskIndex = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.println("Доступні команди:");
                    System.out.println("0 - вихід з програми");
                    System.out.println("1..4 - увімкнути програму від номером");

                    taskIndex = scan.nextInt();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Помилка, не коректне число \n\n\n");
                    scan.next();
                }
            }

            if (taskIndex < 0 || taskIndex > 5 || taskIndex == 3){
                System.out.println("Помилка, такої команди не існує");
            }
            else{
                TaskInterface taskInterface = new Task1();

                switch (taskIndex) {
                    case 0:
                        checkIsExit = false;
                        break;
                    case 1:
                        taskInterface = new Task1();
                        break;
                    case 2:
                        taskInterface = new Task2();
                        break;
                    case 4:
                        taskInterface = new Task4();
                        break;
                    case 5:
                        taskInterface = new Task5();
                        break;
                }

                if (checkIsExit){
                    taskInterface.StartTask();
                }
            }
        }
    }
}

