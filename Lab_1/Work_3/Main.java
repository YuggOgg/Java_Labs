//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class User {
    int id, age;
    String name, surname;
    double weight, height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
}

public class Main {
    static User[] users = new User[10];

    public static void main(String[] args) {
        users[0] = new User(1, 25, "Грива", "Храпливий ", 70.5, 175.0);
        users[1] = new User(2, 30, "Хриса", "Гуменяк ", 60.8, 160.0);
        users[2] = new User(3, 22, "Bob", "Шульга ", 85.2, 182.5);
        users[3] = new User(4, 28, "Шерлок", "Вихрущ ", 55.0, 165.0);
        users[4] = new User(5, 35, "Павла", "Фіґоль ", 75.3, 178.0);
        users[5] = new User(6, 26, "Харитя", "Танцюра ", 68.9, 170.5);
        users[6] = new User(7, 32, "Йосип", "Гребінь ", 90.0, 188.0);
        users[7] = new User(8, 29, "Іоанн", "Фовицький ", 62.4, 162.5);
        users[8] = new User(9, 24, "Фаїна", "Катрич ", 80.7, 176.0);
        users[9] = new User(10, 31, "Фросина", "Шестопал ", 58.6, 157.5);

        int sumAge = 0;
        double sumWeight = 0.0;
        double sumHeight = 0.0;

        for (User user : users) {
            sumAge += user.age;
            sumWeight += user.weight;
            sumHeight += user.height;
        }

        System.out.println("Сумма возрастов: " + sumAge);
        System.out.println("Сумма весов: " + sumWeight);
        System.out.println("Сумма ростов: " + sumHeight);
    }
}