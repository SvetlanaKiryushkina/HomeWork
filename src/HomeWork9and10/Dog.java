package HomeWork9and10;

//Класс наследник от Животного
public class Dog extends Animal {
    /*
1. В классе собака определить имя, порода,средний вес.
В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать. При этом, в консоли
должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
     */
    private final String name;
    private final String breed; //порода
    private final double averageWeight;

    public Dog(String color, int maxLife, String typeFood, String name, String breed, double averageWeight) {
        super(color, maxLife, typeFood);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    //Mетоды: лаять, кусать, бегать, играть, прыгать.
    public String bark(String name) {
        return name + " лает";
    }

    public String bite(String name) {
        return name + " кусает";
    }

    public String run(String name) {
        return name + " бегает";
    }

    public String play(String name) {
        return name + " играет";
    }

    //переопределяем метод из родительского класса, что бы вывести инфу из класса Dog
    //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    public String toString() {
        String result = super.toString();
        result = result + " Имя: " + name + " Порода: " + breed + " Средний вес: " + averageWeight;
        return result;
    }

    // Переопределить методы,
    // которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.
    @Override
    public String makeSound() {
        return "Гав-гав";
    }

    @Override
    public String playing() {
        return "Бежит за костью";
    }

    /*
    HW10
    1. Переопределить метод equals и hashcode в классах Птица и Собака из предыдущего задания.
     */

    public boolean equals(Object obj) {
        //проверяем является ли наш обьект типом Dog (собакой)
        if (!(obj instanceof Dog)) {
            return false;
        }
        //приведение типов
        Dog dog = (Dog) obj;
        //Сравниваем конкретные поля Dog с нашим обьектом

        if (name.equals(dog.getName())
                && breed.equals(dog.getBreed())
                && averageWeight == dog.getAverageWeight()){
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = (int) averageWeight + name.hashCode() + breed.hashCode();
        return result;
    }
}
