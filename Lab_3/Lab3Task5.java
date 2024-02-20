
public class Lab3Task5 {
    public static void main(String[] args) {
        int min = -1, max = 2;
        double step = 0.2;

        for (double x = min; x <= max; x += step) {
            System.out.println(F(x));
        }
    }

    private static double F(double x) {
        return Math.pow(x, 5) - x + 1.8f;
    }
}