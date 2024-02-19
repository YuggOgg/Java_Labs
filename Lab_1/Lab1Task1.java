public class Lab1Task1 {
    static int[] numbers = new int[10];
    static int minRange = 1, maxRange = 10;

    public static void main(String[] args) {
        System.out.print("10 початкович чисел: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = GenerateRandomNumber();
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        int sum = Sum();
        int sub = Sub();
        int mul = Mul();
        float div = Div();

        System.out.println("Додавання: " + sum);
        System.out.println("Віднімання: " + sub);
        System.out.println("Множення: " + mul);
        System.out.println("Ділення: " + div);
    }

    private static int GenerateRandomNumber(){
        int random = (int)(minRange + Math.random() * maxRange);
        return random;
    }

    private static int Sum(){
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }

        return result;
    }

    private static int Sub(){
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result = result - numbers[i];
        }

        return result;
    }

    private static int Mul(){
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = result * numbers[i];
        }

        return result;
    }

    private static float Div(){
        float result = (float)numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = result / numbers[i];
        }

        return result;
    }
}
