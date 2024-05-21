import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Program implements Inter {
    String textDocName = "TextDoc.txt";

    public void CheckFile(){
        File file = new File(textDocName);
        if (file.exists()) {
            System.out.println("Файл під назвою " + textDocName + " існує.");
        } else {
            System.out.println("Файл під назвою " + textDocName + " не існує.");
        }
    }

    public void WriteInFile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст для запису в файл:");
        String text = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(textDocName))) {
            writer.write(text);
            System.out.println("Текст було успішно записано в файл.");
        } catch (IOException e) {
            System.err.println("Помилка при записі в файл: " + e.getMessage());
        }
    }

    public void ReadInFile(){
        try {
            File file = new File(textDocName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не знайдено: " + e.getMessage());
        }
    }

    public void Task(){
        int b1 = new Random().nextInt(50 + 1);
        int b2 = new Random().nextInt(100 - 50 + 1) + 50;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(textDocName))) {
            for (int i = b1; i < b2; i++) {
                writer.write(Integer.toString(i) + " \n");
            }

            System.out.println("Текст було успішно записано в файл.");
        } catch (IOException e) {
            System.err.println("Помилка при записі в файл: " + e.getMessage());
        }
    }
}
