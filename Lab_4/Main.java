public class Main {
    public static void main(String[] args) {
        int taskIndex = 4;

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();

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
                task4.StartTask();
                break;
        }
    }
}

class Task1 {
    public void StartTask(){
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(i);
        }
    }
}

class Task2 {
    public void StartTask(){
        int[] array = {2,17,13,6,22,31,45,66,100,-18};

        System.out.println("перебрати його циклом while");
        int i = 0;
        while (i < array.length){
            System.out.println(array[i]);
            i++;
        }

        System.out.println("перебрати його циклом for");
        for (int j : array) {
            System.out.println(j);
        }

        System.out.println("перебрати циклом while та вивести  числа тільки з непарним індексом");
        i = 0;
        while (i < array.length){
            if (array[i] % 2 == 1){
                System.out.println(array[i]);
            }
            i++;
        }

        System.out.println("перебрати циклом for та вивести  числа тільки з парним індексом");
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        System.out.println("вивести масив в зворотньому порядку");
        i = array.length-1;
        while (i > 0){
            System.out.println(array[i]);
            i--;
        }
    }
}

class Task3 {
    public void StartTask(){
        int[] array = {2,17,13,6,22,31,45,66,100,-18};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        System.out.println(sum);
    }
}

class Task4 {
    public void StartTask(){
        int[] array = {2,-17,13,-6,22,31,45,-66,100,-18};

        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
            System.out.println(array[i]);
        }
    }
}