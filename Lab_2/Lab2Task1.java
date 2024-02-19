public class Lab2Task1 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = -3;
        double d;
        double x1 = 0, x2 = 0;

        d = CalculateDiscriminant(a, b, c);
        System.out.println(d);

        if (d < 0){
            System.out.println("D < 0, тому рівняння немає дійсних коренів");
        }
        else{
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);

            System.out.println(x1);
            System.out.println(x2);
        }
    }

    private static double CalculateDiscriminant(int a, int b, int c){
        return Math.pow(b,2) - 4 * a * c;
    }
}
