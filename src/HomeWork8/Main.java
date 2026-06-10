package HomeWork8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый параметр: ");
        String str1 = in.nextLine();
        System.out.println("Введите второй параметр: ");
        String str2 = in.nextLine();

        String result = Strings.processStrings(str1, str2);
        System.out.println("Результат: " + result);
        System.out.println("*******************************");

 /*       2.1 В тексте после символа каждого слова с индексом k вставить заданную подстроку. Используемые методы (split(), substring())
        Вынести это в отдельный метод с сигнатурой public String (int k, String text)
 */

        String textOrig = "Каждая строка, создаваемая с помощью оператора new,литерала (заключенная в двойные апострофы) и ли метода класса,\n" +
                "создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что\n" +
                "его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки\n" +
                "всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и\n" +
                "хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";

        String newText = Strings.insertWord(textOrig,2,"_новое слово");
        System.out.println(newText);

        }
}