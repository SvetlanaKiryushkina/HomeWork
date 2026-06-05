package HomeWork9and10;

public class Zoo {

    /*
    1.3 Создать класс Зоопарк в котором будут жить наши животные. В качестве поля в новом классе будет
массив из животных (private Animal[]animals).
     */
    public Animal[] animals = new Animal[0];

    public Zoo() {
    }

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    /*
    1.4 Реализовать метод в классе зоопарк по добавлению нового животного. Сигнатура метода
будет такая: public void addAnimal(Animal animal); Данный метод должен будет скопировать текущий массив с животными
в новый массив с животными. Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное.
Полученный массив нужно перезаписать в поле animals в классе Зоопарк.
     */

    public void addAnimal(Animal newAnimal) {
        Animal[] newArrayAnimals = new Animal[this.animals.length + 1];

        // скопировать текущий массив с животными
        System.arraycopy(this.animals, 0, newArrayAnimals, 0, this.animals.length);

        newArrayAnimals[newArrayAnimals.length - 1] = newAnimal;
        this.animals = newArrayAnimals;
    }

    //1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.
    public Animal[] getAnimals() {
        return animals;
    }

    //удаление
    public void deletedAnimal(int id) {
        Animal[] newArrayWithDel = new Animal[this.animals.length - 1];

        int newArrayIndex = 0; // Индекс для нового массива

        for (Animal animal : animals) {
            // Если ID животного НЕ совпадает копируем его
            if (animal.getId() != id) {
                newArrayWithDel[newArrayIndex] = animal;
                newArrayIndex++;
            }
        }
        this.animals = newArrayWithDel;
    }
}
