package HomeWork11;

public class RobotSapper implements Robot, RobotInjener {
/*
РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал,
включение робота (boolean isOn)
 */

    private final String model;
    private final int power;
    private final int numberChassis;
    private final String material;
    private final boolean isOn;

    public RobotSapper(String model, int power, int numberChassis, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.numberChassis = numberChassis;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public void isON() {

    }

    @Override
    public void isOFF() {

    }

    //1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.)
    @Override
    public void uniquePossibility() {
        System.out.println("Сапер сапёрит");

    }

    @Override
    public void createItem() {
        System.out.println("РоботСапёр создаёт приспособление для разминирования");
    }
}
