class Phone {
    String number, model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone() {
        this.number = "Невідомий";
        this.model = "Невідома";
        this.weight = 0;
    }

    public void ReceiveCall(String callName) {
        System.out.println("Дзвонить " + callName);
    }

    public void ReceiveCall(String callName, String callNumber) {
        System.out.println("Дзвонить " + callName + " з номеру " + callNumber);
    }

    public String GetNumber() {
        return number;
    }

    public void SendMessage(String... phoneNumbers) {
        System.out.print("Надіслано повідомлення на номери: ");

        for (String phoneNumber : phoneNumbers) {
            System.out.print(phoneNumber + " ");
        }
    }
}

class Task2 implements TaskInterface{
    public void StartTask() {
        Phone phone1 = new Phone("3801111111111", "IBanana39", 0.1);
        Phone phone2 = new Phone("3802222222222", "IBanana41");
        Phone phone3 = new Phone();

        PrintPhoneCharacteristics(phone1);
        PrintPhoneCharacteristics(phone2);
        PrintPhoneCharacteristics(phone3);

        System.out.println();
        phone1.ReceiveCall("Тарас");
        phone3.ReceiveCall("Томсон", "3803333333333");

        System.out.println();
        System.out.println(phone1.GetNumber());
        System.out.println(phone2.GetNumber());
        System.out.println(phone3.GetNumber());

        System.out.println();
        phone2.SendMessage(phone1.GetNumber(), "380555555555", "3804444444444");
    }

    private void PrintPhoneCharacteristics(Phone phone) {
        System.out.print("Номер: " + phone.number);
        System.out.print(" Модель: " + phone.model);
        System.out.print(" Вага: " + phone.weight);
        System.out.println();
    }
}
