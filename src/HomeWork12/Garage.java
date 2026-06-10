package HomeWork12;

public class Garage<T extends Vehicle> {

    //1. Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle.

    private final T vehiclesInside;

    //конструктор
    public Garage(T vehiclesInside) {
        this.vehiclesInside = vehiclesInside;
    }

   /*
    2. Реализовать метод, который будет разрешать или запрещать въезд в гараж в зависимости от
     количества выбросов транспортного средства. (Boolean isEntryPermitted());
     Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.
     */

    public Boolean isEntryPermitted(Vehicle vehicle) {
        Integer emissions = vehicle.getNumberOfEmissions();

        return emissions < 100;
    }

    //
    public void addVehicle(Vehicle vehicle) {
        if (isEntryPermitted(vehicle)) {
            System.out.println(vehicle + " добавлен в гараж");
        } else {
            System.out.println(vehicle + " не добавлен в гараж, выхлоп больше 100");
        }
    }

    @Override
    public String toString() {
        return "Гараж для " + vehiclesInside;
    }
}
