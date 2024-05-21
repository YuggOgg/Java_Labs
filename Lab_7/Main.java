import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.StartTask();

        Scanner scan = new Scanner(System.in);
        boolean checkIsExit = true;

        while(checkIsExit) {
            int taskIndex = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.println("Доступні команди:");
                    System.out.println("0 - вихід з програми");
                    System.out.println("1, 2 - увімкнути програму від номером");

                    taskIndex = scan.nextInt();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Помилка, не коректне число \n\n\n");
                    scan.next();
                }
            }

            if (taskIndex < 0 || taskIndex > 2) {
                System.out.println("Помилка, такої команди не існує");
            } else {
                InFace taskInterface = null;
                InFace1 taskInterface1 = null;

                switch (taskIndex) {
                    case 0:
                        checkIsExit = false;
                        break;
                    case 1:
                        taskInterface1 = new Task1();
                        break;
                    case 2:
                        taskInterface = new Task2();
                        break;
                }

                if (checkIsExit) {
                    if (taskIndex == 1){
                        taskInterface1.StartTask();
                    }
                    else{
                        taskInterface.StartTask();
                    }
                }
            }
        }
    }
}