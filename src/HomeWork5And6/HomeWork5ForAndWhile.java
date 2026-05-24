package HomeWork5And6;

import java.util.Scanner;

public class HomeWork5ForAndWhile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Задание 1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");

/*  Задание 2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого.
(Используйте цикл while).Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте
в эту переменную сумму чисел.
 */
        System.out.println("Введите первое положительное число a: ");
        int a = in.nextInt();
        System.out.println("Введите второе положительное число b: ");
        int b = in.nextInt();
        int sum = 0;

        if (a % 2 == 0 && b % 2 == 0) {

            int start = Math.min(a, b);
            int end = Math.max(a, b);

            int current = start;
            while (current <= end) {
                sum += current; // Добавляем текущее число к сумме
                current++;
            }

            System.out.println("Сумма всех чисел от " + start + " до " + end + " равна: " + sum);
        } else System.out.println("Одно из чисел не является положительным");
/*
Задание 3. Ввести число с консоли, которое не заканчивается на 0.Вывести число в обратном порядке.
Использовать оператор %.
*/
        System.out.println("Введите число x");
        int x = in.nextInt();
        int nt;
        if (x % 10 == 0) {
            System.out.println("Введенное число заканчивается на 0");
        } else {
            System.out.print("Число наоборот ");
            while (x > 0) {
                nt = x % 10;//получили послед.цифру
                System.out.print(nt + " ");
                x = x / 10; // Убираем последнюю цифру
            }
        }
        System.out.println(" ");

//Задание 4. Ввести число с консоли, которое не заканчивается на 0. Вывести чётные и нечётные числа
//через while and if. Использовать оператор %.

        System.out.println("Введите число c");
        int c = in.nextInt();
        int vr;
        if (c % 10 == 0) {
            System.out.println("Число не соответствует условию и заканчивается на 0");
        } else {
            int copyNumber = c;
            System.out.println("Четные числа: ");
            while (copyNumber > 0) {
                vr = copyNumber % 10;//получили послед.цифру
                if (vr % 2 == 0) {
                    System.out.print(vr + " ");
                }
                copyNumber = copyNumber / 10; // Убираем последнюю цифру
            }
            System.out.println(" ");
            int copyTwo = c;
            System.out.println("Нечетные числа: ");
            while (copyTwo > 0) {
                int vr1 = copyTwo % 10;
                if (vr1 % 2 != 0) {
                    System.out.print(vr1 + " ");
                }
                copyTwo = copyTwo / 10;
            }
        }
    }
}