package HomeWork9and10;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Белый", 12, "Мясо",
                "Бобик", "Дворняжка", 4.5);

        System.out.println(dog);
        System.out.println(dog.bark(dog.getName()));
        System.out.println(dog.bite(dog.getName()));
        System.out.println(dog.run(dog.getName()));
        System.out.println(dog.play(dog.getName()));

        System.out.println(dog.makeSound());
        System.out.println(dog.playing());
        System.out.println("********************************");

        Bird bird = new Bird("Черная", 1, "Пшено", "Ворона", 2);
        System.out.println(bird);
        System.out.println(bird.makeSound());
        System.out.println(bird.playing());
        System.out.println(bird.peck(bird.getFamily()));
        System.out.println(bird.incubatingChicks(bird.getFamily()));

        /*
        1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы.
        (Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.)
         */

        System.out.println("Массив животных");

        Animal dog1 = new Dog("Black", 4, "All", "Щарик", "собака", 4);
        Animal dog2 = new Dog("Blue", 2, "Мясо", "Rex", "dog", 5);
        Animal bird2 = new Bird("Коричневый", 5, "Хищник", "Воробей", 5);
        Zoo zoo = new Zoo();//создали новый зоопарк

        //добавляем в него животных
        zoo.addAnimal(dog);
        zoo.addAnimal(bird);
        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(bird2);

        /*
        1.7 Получить всех животных из зоопарка. Пройтись по всем животным в зоопарке и вызвать методы (издание звуков,
        животное играет).
        У вас должны вывестись соответствующие реализации для 3 собак и для трёх птиц(Выполнять это в методе Main)
         */

        Animal[] animalsInZoo = zoo.getAnimals();

        for (Animal a : animalsInZoo) {
            System.out.println(a + " " + a.makeSound() + " " + a.playing());
        }

        System.out.println("Удаление животных");
        zoo.deletedAnimal(2);
        Animal[] animalDeleted = zoo.getAnimals();
        for (Animal a : animalDeleted) {
            System.out.println(a + " " + a.makeSound() + " " + a.playing());
        }

        System.out.println("методы equals и hashcode");
        Dog dogForEquals = new Dog("Белый", 12, "Мясо",
                "Бобик", "Дворняжка", 4.5);

        System.out.println(dog.equals(dogForEquals));//у двух объектов одинаковые поля, должны получить true
        System.out.println(dog.equals(dog1));//у двух объектов разные поля, должны получить false

        Bird birdForEquals = new Bird("Черная", 1, "Пшено", "Ворона", 2);
        System.out.println(bird.equals(birdForEquals));

        System.out.println(dog.hashCode());
        System.out.println(dogForEquals.hashCode());

        System.out.println(bird.hashCode());
        System.out.println(birdForEquals.hashCode());
    }
}