public class Lab3Task4 {
    public static void main(String[] args){
        int h = 0, min = 0, sec = 0;

        for (h = 0; h <= 3; h++){
            for (min = 0; min < 60; min++){
                for (sec = 0; sec < 60; sec++){
                    System.out.println(h + " h " + min + " min " + sec + " sec");
                }
            }
        }
    }
}
