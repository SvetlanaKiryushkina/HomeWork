package HomeWork11;

public class RobotStroitel implements Robot, RobotInjener {

    /*
    РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства,
 материал, включение робота (boolean isOn.)
     */

    private final String model;
    private final int power;
    private final String country;
    private final String stroikaUnit;
    private final String material;
    private final boolean isOn;

    public RobotStroitel(String model, int power, String country, String stroikaUnit, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.stroikaUnit = stroikaUnit;
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
        System.out.println("Строитель строит");

    }

    @Override
    public void createItem() {
        System.out.println("Робот строитель создаёт бетон");
    }
}
