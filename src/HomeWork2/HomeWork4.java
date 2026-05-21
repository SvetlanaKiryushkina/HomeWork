package HomeWork2;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        //Задача 1. На вход даны 3 числа. Вывести в консоль только четные числа

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        System.out.println("Введите y");
        int y = sc.nextInt();
        System.out.println("Введите z");
        int z = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Число х четное и равно " + x);
        }
        if (y % 2 == 0) {
            System.out.println("Число y четное и равно " + y);
        }
        if (z % 2 == 0) {
            System.out.println("Число z четное и равно " + z);
        }
        System.out.println("**********************************");

        //Задание 2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5 (используйте оператор % для
        //проверки деления без остатка)

        if (x % 2 == 0 && x % 5 == 0) {
            System.out.println("Число " + x + " " + "делится и на 2 и на 5");
        }
        if (y % 2 == 0 && y % 5 == 0) {
            System.out.println("Число " + y + " " + "делится и на 2 и на 5");
        }
        if (z % 2 == 0 && z % 5 == 0) {
            System.out.println("Число " + z + " " + "делится и на 2 и на 5");
        }
        System.out.println("**********************************");

        /*
        Задача 3.Дано 15/a=result, где a-число, которое вводится с командной строки, result-результат вычисления.
        Написать программу, которая будет выводит разный текст, в зависимости от значения result.
        В случае result=3, вывести: "Результат деления равен 3" В случае result=5 вывести: "Результат деления равен 5"
        В других случаях вывести: "Результат деления равен дробному числу". При этом в последнем случае вывести
        точный результат деления (использовать приведение типов)
        Для выполнения задания использовать оператор switch- case
         */
        Scanner sctwo = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sctwo.nextInt();
        double result= 15 / (double)a;
        int intResult = (int) result;

        switch (intResult) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу: " + result);
                break;
        }
    }
}
