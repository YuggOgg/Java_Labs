import java.util.Scanner;

public class Lab2Task4_2 {
    public static void main(String[] args){
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
