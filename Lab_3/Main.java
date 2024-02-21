public class Main {
    public static void main(String[] args) {
        int taskIndex = 1;

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task41 = new Task4();
        Task5 task42 = new Task5();

        switch (taskIndex) {
            case 1:
                task1.StartTask();
                break;
            case 2:
                task2.StartTask();
                break;
            case 3:
                task3.StartTask();
                break;
            case 4:
                task41.StartTask();
                break;
            case 5:
                task42.StartTask();
                break;
        }
    }
}

class Task1 {
    public void StartTask(){
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

class Task2 {
    public void StartTask(){
        int h = 0, min = 0;

        for (h = 0; h <= 3; h++){
            for (min = 0; min < 60; min++){
                System.out.println(h + " h " + min + " min");
            }
        }
    }
}

class Task3 {
    public void StartTask(){
        int h = 0, min = 0;

        while(h < 4){
            while (min < 60){
                System.out.println(h + " h " + min + " min");
                min++;
            }

            min = 0;
            h++;
        }
    }
}

class Task4 {
    public void StartTask(){
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

class Task5 {
    public void StartTask(){
        int min = -1, max = 2;
        double step = 0.2;

        for (double x = min; x <= max; x += step) {
            System.out.println(F(x));
        }
    }

    private double F(double x) {
        return Math.pow(x, 5) - x + 1.8f;
    }
}