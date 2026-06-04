package HomeWork9;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Белый", 12, "Мясо",
                "Бобик", "Дворняжка", 4.5);

        System.out.println(dog.toString());
        System.out.println(dog.bark(dog.getName()));
        System.out.println(dog.bite(dog.getName()));
        System.out.println(dog.run(dog.getName()));
        System.out.println(dog.play(dog.getName()));

        System.out.println(dog.makeSound("Гав-гав"));
        System.out.println(dog.playing("во что-то"));
        System.out.println("********************************");

        Bird bird = new Bird("Черная", 1, "Пшено", "Ворона", 2);
        System.out.println(bird.toString());
        System.out.println(bird.makeSound());
        System.out.println(bird.playing());
        System.out.println(bird.peck(bird.getFamily()));
        System.out.println(bird.incubatingChicks(bird.getFamily()));

    }
}
