public class Lab3Task3 {
    public static void main(String[] args){
        int h = 0, min = 0;

        while(h < 3){
            while (min < 60){
                System.out.println(h + " h " + min + " min");
                min++;
            }

            min = 0;
            h++;
        }
    }
}
