public class Lab2Task3 {
    public static void main(String[] args){
        int x = 12;

        if (x >= 10 && x <= 99 && (x % 2) == 0){
            System.out.println("Задане число: " + x + " є двозначним і парним");
        }
        else{
            System.out.println("Задане число: " + x + " не є двозначним чи парним");
        }
    }
}
