import java.util.HashMap;
import java.util.Map;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 implements InFace{
    Map<String, String> phoneBook;
    public void StartTask() {
        phoneBook = CreatePhoneBook();

        System.out.println("\n\n\n");
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\n\n\n");

        Scanner scan = new Scanner(System.in);

        boolean loop = true;

        while (loop){
            int checkFindContact = 0;

            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.println("Хочете знайти контакт по імені?");
                    System.out.println("0 - НІ");
                    System.out.println("1 - ТАК");

                    checkFindContact = scan.nextInt();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Помилка, не коректна команда \n\n\n");
                    scan.next();
                }
            }

            if (checkFindContact == 1){
                System.out.println("Введіть ім'я для пошуку");
                String searchLastName = scan.next();

                if (phoneBook.containsKey(searchLastName)) {
                    String phoneNumber = phoneBook.get(searchLastName);
                    System.out.println("Номер телефону для " + searchLastName + ": " + phoneNumber);
                } else {
                    System.out.println("У книзі відсутній абонент з прізвищем " + searchLastName);
                }
            }
            else{
                loop = false;
            }
        }

        System.out.println("\n\n");
        loop = true;

        while (loop){
            int removeFindContact = 0;

            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.println("Хочете видалити контакт по імені?");
                    System.out.println("0 - НІ");
                    System.out.println("1 - ТАК");

                    removeFindContact = scan.nextInt();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Помилка, не коректна команда \n\n\n");
                    scan.next();
                }
            }

            if (removeFindContact == 1){
                System.out.println("Введіть ім'я для видалення");
                String removeLastName = scan.next();
                phoneBook.remove(removeLastName);

                System.out.println("Кількість записів у книзі: " + phoneBook.size());
            }
            else{
                loop = false;
            }
            System.out.println("\n\n");
        }
    }

    private static Map<String, String> CreatePhoneBook() {
        Map<String, String> phoneBook = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        int contact = 0;
        while(contact == 0){
            int addContact = 0;

            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.println("Додати контакт?");
                    System.out.println("0 - НІ");
                    System.out.println("1 - ТАК");

                    addContact = scan.nextInt();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Помилка, не коректна команда \n\n\n");
                    scan.next();
                }
            }

            if (addContact >= 0 && addContact <= 1){
                if (addContact == 1){
                    contact++;

                    System.out.println("Ім'я користовача: ");
                    String contactName = scan.next();

                    boolean validInputNumber = false;

                    while (!validInputNumber){
                        System.out.println("Номер телефону користовача: ");
                        String contactNumber = scan.next();

                        if (contactNumber.length() == 12){
                            phoneBook.put(contactName, contactNumber);

                            System.out.println("Контак створено \n\n\n");
                            validInputNumber = true;
                        }
                        else{
                            System.out.println("Помилка, номер телефона менша або більша ніж 12 символів");
                        }

                    }
                }
            }

            contact--;
        }
        return phoneBook;
    }

    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(Map<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }
}
