package HomeWork9;

//Класс наследник от Животного
public class Dog extends Animals {
    /*
1. В классе собака определить имя, порода,средний вес.
В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать. При этом, в консоли
должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
     */
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String color, int maxLife, String typeFood, String name, String breed, double averageWeight) {
        super(color, maxLife, typeFood);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    //Mетоды: лаять, кусать, бегать, играть, прыгать.
    public String bark(String name) {
        return name + " лает";
    }

    public String bite(String name) {
        return name + " кусает";
    }

    public String run (String name) {
        return name + " бегает";
    }

    public String play (String name) {
        return name + " играет";
    }

    //переопределяем метод из родительского класса, что бы вывести инфу из класса Dog
    //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    public String toString(){
        String result = super.toString();
        result  = result + " Имя: "+ name + " Порода: " + breed + " Средний вес: " + averageWeight;
        return result;
    }

    // Переопределить методы,
    // которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.
    public String makeSound (){
        return "Гав-гав";
    }

    public String playing (){
        return "Бежит за костью";
    }
}
