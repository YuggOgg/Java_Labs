import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Car{
    String mark;
    double power;
    Driver driver;
    double price;
    int graduationYear;

    public Car(String mark, double power, Driver driver, double price, int graduationYear) {
        this.mark = mark;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.graduationYear = graduationYear;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getMark() {
        return mark;
    }

    public double getPower() {
        return power;
    }

    public Driver getDriver() {
        return driver;
    }

    public double getPrice() {
        return price;
    }

    public int getGraduationYear() {
        return graduationYear;
    }
}

class Driver{
    String name;
    int age;
    int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

class Helper {
    public void CallToRandomCar(List<Car> cars){
        Random random = new Random();
        int randomCar = random.nextInt(cars.size());
        TellMove(cars.get(randomCar));
        TellReady(cars.get(randomCar));
    }

    private void TellMove(Car car){
        System.out.println("Автомобіль марки " + car.getMark() + " з водієм " + car.getDriver().getName() + " виїхав за вами");
    }

    private void TellReady(Car car){
        System.out.println("Водій " + car.getDriver().getName() + " прибув на місце");
    }
}

class Task1 implements InFace1{
    private final List<Car> cars = new ArrayList<Car>();
    public void StartTask(){
        CreateCars();

        for (int i = 0; i < cars.size() / 2; i++) {
            EngineRepair(cars.get(i), 5);
            RecruitDriver(cars.get(i));
        }

        for (int i = 0; i < cars.size(); i += 2) {
            EngineRepair(cars.get(i), 10);
            AddPrice(cars.get(i), 5);
        }

        CheckDriversExperience();

        Helper helper = new Helper();
        helper.CallToRandomCar(cars);
    }

    private void CreateCars(){
        cars.add(new Car("A1", 10, new Driver("Salo", 20,1), 1000, 2001));
        cars.add(new Car("A2", 11, new Driver("Pablo", 21,2), 1500, 2022));
        cars.add(new Car("A3", 12, new Driver("Diablo", 22,3), 1300, 2036));
        cars.add(new Car("B1", 13, new Driver("Mambo", 23,4), 1000, 2011));
        cars.add(new Car("B2", 14, new Driver("Homho", 24,3), 1400, 2021));
        cars.add(new Car("B2", 15, new Driver("Jambo", 25,1), 1000, 2001));
        cars.add(new Car("C1", 16, new Driver("Lamdo", 26,2), 1300, 2031));
        cars.add(new Car("C2", 17, new Driver("Grisho", 27,3), 1200, 2051));
        cars.add(new Car("C2", 18, new Driver("Negro", 28,2), 1400, 2041));
        cars.add(new Car("D1", 19, new Driver("Bombo", 29,1), 1300, 2041));
    }

    private void EngineRepair(Car car, double upgradePower){
        double newPower = (car.getPower() * (100 + upgradePower)) / 100;
        car.setPower(newPower);
    }

    private void RecruitDriver(Car car){
        Driver newDriver = car.getDriver();
        car.setDriver(newDriver);
    }

    private void AddPrice(Car car, double addPrice){
        double newPrice = (car.getPrice() * (100 + addPrice)) / 100;
        car.setPrice(newPrice);
    }

    private void CheckDriversExperience(){
        for (Car c : cars){
            Driver driver = c.getDriver();

            if (driver.getExperience() < 5 && driver.getAge() > 25){
                driver.setExperience(driver.getExperience() + 1);
            }
        }
    }
}
