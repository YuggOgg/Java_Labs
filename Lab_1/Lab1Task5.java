public class Lab1Task5 {
    public static void main(String[] args) {
        int number = (int)(123 + Math.random() * 999);

        System.out.println("Вхідне число: " + number);
        System.out.println("Вихідне число: " + FlipNumber(number));
    }

    private static int FlipNumber(int number){
        int n1 = number % 10;
        int n2 = (number / 10) % 10;
        int n3 = number / 100;

        int flipNumber = n1 * 100 + n2 * 10 + n3;

        return flipNumber;
    }
}
