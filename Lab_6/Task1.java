class Person {
    String fullName;
    int age;

    public Person() {
        fullName = "Безіменний";
        age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void Move() {
        System.out.println(this.fullName + " рухається");
    }

    public void Talk() {
        System.out.println(this.fullName + " говорить");
    }
}

class Task1 implements TaskInterface {
    public void StartTask() {
        Person person1 = new Person();
        Person person2 = new Person("Кисильов Юрій", 20);

        person1.Move();
        person2.Move();

        person1.Talk();
        person2.Talk();
    }
}
