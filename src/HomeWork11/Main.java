package HomeWork11;

public class Main {
    public static void main(String[] args) {

        /*
1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод
отремантировать робота (результаты выполнения методы выведите в консоль)
         */

        RobotSapper robotSapper = new RobotSapper("LG", 1200,
                200, "Металл", true);
        RobotSapper robotSapper2 = new RobotSapper("LGT", 150,
                90, "Металл", true);
        RobotStroitel robotStroitel = new RobotStroitel("QW", 2500,
                "USA", "ХЗ", "металл", true);
        RobotKitchen robotKitchen = new RobotKitchen("LG", false, "что-то там",
                "BLR", 5000);

        robotKitchen.repair();

        /*
1.6 Создать 3 выставки (массива) роботов в классе Main.
Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель).
Вторая выставка- только для инженерных роботов.
Третья выставка- для роботов сапёров.
Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров,
вызвав метод createItem на каждом Роботе, который есть на выставке.
         */
        Robot[] expositionOne = {robotKitchen, robotSapper, robotStroitel};
        RobotInjener[] expositionTwo = {robotSapper, robotStroitel};
        RobotSapper[] expositionThree = {robotSapper, robotSapper2};

        System.out.println("Выставка 1");
        for (Robot one : expositionOne) {
            one.uniquePossibility();
        }

        System.out.println("Выставка 2");
        for (RobotInjener two : expositionTwo) {
            two.uniquePossibility();
            two.createItem();
        }

        System.out.println("Выставка 3");
        for (RobotSapper three : expositionThree) {
            three.uniquePossibility();
            three.createItem();
        }
    }
}
