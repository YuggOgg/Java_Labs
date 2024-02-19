import java.util.Scanner;

public class Lab2Task4_1 {
    public static void main(String[] args){
        System.out.println("Введіть x = ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

        double f_x = CalculateFunctions(x);
        System.out.println(f_x);
    }

    private static double CalculateFunctions(double x){
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
