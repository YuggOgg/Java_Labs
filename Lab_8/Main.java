import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        Inter inter = new Program();

        while (loop){
            System.out.println("\n      Доступні команди:");
            System.out.println("CHECK - перевірити чи існує файл");
            System.out.println("WRITE - написати в файл");
            System.out.println("READ - прочитати файл");
            System.out.println("TASK - виконати завдання до лабораторної роботи");
            System.out.println("END - закінчити програму");

            String command = scan.next();

            switch (command){
                case "CHECK":
                    inter.CheckFile();
                    break;

                case "WRITE":
                    inter.WriteInFile();
                    break;

                case "READ":
                    inter.ReadInFile();
                    break;

                case "TASK":
                    inter.Task();
                    break;

                case "END":
                    loop = false;
                    break;
            }

            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
        }
    }
}
