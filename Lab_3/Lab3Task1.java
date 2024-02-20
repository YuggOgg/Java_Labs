public class Lab3Task1 {
    public static void main(String[] args){
        String text = "Будь-яка фраза на Мій вибір!";

        for (int i = 0; i < 50; i++){
            System.out.println("for(), " + (i+1) + " " + text);
        }

        int j = 50;

        while (j > 0){
            System.out.println("while(), " + (51 - j) + " " + text);
            j--;
        }
    }
}
