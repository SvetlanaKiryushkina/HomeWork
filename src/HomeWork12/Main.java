package HomeWork12;

public class Main {
    public static void main(String[] args) {

    /*
    1.5 Создать 2 объекта класса Garage.
    Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.
     */

        Car car = new Car("Reno", 125);
        Car carMini = new Car("Mini Cuper", 200);
        Motorcycle motorcycle = new Motorcycle("Мотик", 2);
        Motorcycle motorcycle2 = new Motorcycle("Байк", 78);

        Garage<Car> carGarage = new Garage<>(carMini);
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle2);

        carGarage.addVehicle(carMini);
        motorcycleGarage.addVehicle(motorcycle2);
        motorcycleGarage.addVehicle(motorcycle);
        carGarage.addVehicle(car);
    }
}
