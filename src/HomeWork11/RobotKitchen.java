package HomeWork11;

public class RobotKitchen implements Robot {

    //РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).

    private final String model;
    private final int power;
    private final String country;
    private final String cookingUnit;
    private boolean isOn;

    public RobotKitchen(String model, boolean isOn, String cookingUnit, String country, int power) {
        this.model = model;
        this.isOn = isOn;
        this.cookingUnit = cookingUnit;
        this.country = country;
        this.power = power;
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
        System.out.println("повар готовит");
    }

    @Override
    public void repair() {
        Robot.super.repair();
    }

    public void changeIsOn() {
        if (isOn = true) {
            this.isOn = false;
            System.out.println("Робот выключился");
        } else {
            this.isOn = true;
            System.out.println("Робот включился");
        }
    }
}
