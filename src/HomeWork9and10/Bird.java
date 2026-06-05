package HomeWork9and10;

//класс наследник от Животных
public class Bird extends Animal {

    /*
Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь,
клевать, высиживать птенцов.
При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением
(пример: Воробей поёт).
     */

    private final String family;
    private final double maxFlightAltitude;

    public Bird(String color, int maxLife, String typeFood, String family, double maxFlightAltitude) {
        super(color, maxLife, typeFood);
        this.family = family;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public String getFamily() {
        return family;
    }

    public double getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    //переопределяем метод из родительского класса, что бы вывести инфу из класса Птицы
    //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    public String toString() {
        String result = super.toString();
        result = result + " Семейство: " + family + " Мах. полет: " + maxFlightAltitude;
        return result;
    }

    //В классе птица создать методы-петь, клевать, высиживать птенцов.
    public String sing(String family) {
        return family + " поет";
    }

    public String peck(String family) {
        return family + " клюёт";
    }

    public String incubatingChicks(String family) {
        return family + " высиживает птенцов";
    }

    // Переопределить методы,
    // которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.
    public String makeSound() {
        return "Чик-чирик";
    }

    public String playing() {
        return "Машет крыльями";
    }

    /*
    HW10
    1. Переопределить метод equals и hashcode в классах Птица и Собака из предыдущего задания.
     */

    public boolean equals(Object obj) {
        if (!(obj instanceof Bird bird)) {
            return false;
        }
        return family.equals(bird.getFamily()) && maxFlightAltitude == bird.getMaxFlightAltitude();
    }

    public int hashCode() {
        int result = (int) maxFlightAltitude + family.hashCode();
        return result;
    }
}
