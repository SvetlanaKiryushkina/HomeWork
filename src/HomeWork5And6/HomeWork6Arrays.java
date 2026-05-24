package HomeWork5And6;

public class HomeWork6Arrays {
    public static void main(String[] args) {

     /*
Задание 1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each
      */
        int[] array = {7, 3, 10, 5, 9, 56, 569, 52, 87, 1};
        System.out.println("Созданный массив:");
        for (int b : array) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Измененный массив:");
        for (int a : array) { //задаем переменную, только для цикла, через : указываем название массива который будем перебирать
            System.out.print(a + " ");
        }
        System.out.println();

        /*
Задание 2. Создать массив из 5 чисел и заполните этот массив вручную. Создайте второй массив с размерностью больше
на 1 чем первый массив. Необходимо скопировать первый массив со всеми значениями во второй массив.
Последний элемент во втором массиве пусть будет 0. Выведите второй массив в консоль с помощью цикла for each.
         */
        System.out.println("Задание 2");
        int[] arrayOne = {125, 45, 6, 458, 1};
        int[] arrayTwo = new int[arrayOne.length + 1];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
        }
        arrayTwo[arrayTwo.length - 1] = 0;

        for (int value : arrayTwo) {
            System.out.print(value + " ");
        }
        System.out.println();

    /*
Задание 3. Создать массив вручную. Заменить максимальный и минимальный элемент массива.
Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
     */
        System.out.println("Задание 3");
        int[] arrayMM = {12, -5, 45, 3, 27, -10};
        int min = arrayMM[0];
        int max = arrayMM[0];
        //находим мин и мах
        for (int i = 0; i < arrayMM.length; i++) {
            if (arrayMM[i] < min) min = arrayMM[i];
            if (arrayMM[i] > max) max = arrayMM[i];
        }

        //пробегаемся по массиву и заменяем значения
        for (int i = 0; i < arrayMM.length; i++) {
            if (arrayMM[i] == min) arrayMM[i] = -1000;
            if (arrayMM[i] == max) arrayMM[i] = 1000;
        }

        //Выводим изменённый массив
        for (int value : arrayMM) {
            System.out.print(value + " ");
        }
        System.out.println();

         /*
Задание 4. Создать массив (вручную). Отсортировать элементы массива в порядке возрастания.
Вывести полученный массив. Выполнить с помощью цикла for
         */
        System.out.println("Задание 4");
        int[] arrayPuzirek = {4, 8, 12, 2};
        for (int i = 0; i < arrayPuzirek.length - 1; i++) {
            for (int j = 0; j < arrayPuzirek.length - 1 - i; j++) {
                if (arrayPuzirek[j] > arrayPuzirek[j + 1]) {
                    int temp = arrayPuzirek[j];
                    arrayPuzirek[j] = arrayPuzirek[j + 1];
                    arrayPuzirek[j + 1] = temp;
                }
            }

        }
        System.out.print("Отсортированный массив: ");
        for (int j : arrayPuzirek) {
            System.out.print(j + " ");
        }
    }
}



