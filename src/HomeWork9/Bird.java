package HomeWork9;

//класс наследник от Животных
public class Bird extends Animals {

    /*
Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь,
клевать, высиживать птенцов.
При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением
(пример: Воробей поёт).
     */

    private String family;
    private double maxFlightAltitude;

    public Bird(String color, int maxLife, String typeFood, String family, double maxFlightAltitude) {
        super(color, maxLife, typeFood);
        this.family = family;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public double getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public void setMaxFlightAltitude(double maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

    //переопределяем метод из родительского класса, что бы вывести инфу из класса Птицы
    //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    public String toString(){
        String result = super.toString();
        result  = result + " Семейство: "+ family + " Мах.высота полета: " + maxFlightAltitude;
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
    public String makeSound (){
        return "Чик-чирик";
    }

    public String playing (){
        return "Машет крыльями";
    }
}
