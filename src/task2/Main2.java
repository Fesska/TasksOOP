package task2;

import java.util.Arrays;
import java.util.Scanner;

import static classes.Block2.*;
import static classes.Block2.sameAscii;
import static extensions.Menu.block2Show;

public class Main2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice;

        while (true)
        {
            System.out.println("\n");
            userChoice = block2Show();

            switch (userChoice)
            {
                case 1 -> {
                    System.out.println("\n");
                    System.out.println("Введите номер дома: ");
                    int num = Integer.parseInt(input.nextLine());
                    System.out.println("Длину улицы (кол-во домов): ");
                    int len = Integer.parseInt(input.nextLine());
                    System.out.println("Противоположный дом: " + oppositeHouse(num, len));
                }
                case 2 -> {
                    System.out.println("\n");
                    System.out.println("Введите имя и фамилию (через пробел): ");
                    String name = input.nextLine();
                    System.out.println("А теперь наоборот: " + nameShuffle(name));
                }
                case 3 -> {
                    System.out.println("\n");
                    System.out.println("Введите исходную цену");
                    int cost = Integer.parseInt(input.nextLine());
                    System.out.println("Введите величину скидки: ");
                    float percent = Float.parseFloat(input.nextLine());
                    System.out.println("Цена с учетом скидки: " + discount(cost, percent));
                }
                case 4 -> {
                    System.out.println("Введите элементы массива (через пробел): ");
                    String line = input.nextLine();
                    String [] elements = line.split(" ");
                    int [] intArray = Arrays.stream(elements).mapToInt(Integer::parseInt).toArray();
                    System.out.println("Результат операции: " + differenceMaxMin(intArray));
                }
                case 5 -> {
                    System.out.println("\n");
                    System.out.println("Введите первое число: ");
                    int a = Integer.parseInt(input.nextLine());
                    System.out.println("Введите второе число: ");
                    int b = Integer.parseInt(input.nextLine());
                    System.out.println("Введите третье число: ");
                    int c = Integer.parseInt(input.nextLine());
                    System.out.println("Введено одинаковых чисел: " + equal(a, b, c));
                }
                case 6 -> {
                    System.out.println("\n");
                    System.out.println("Введите любую строку ");
                    String str = input.nextLine();
                    System.out.println("Ваша строка в обратном порядке: " + reverse(str));

                }
                case 7 -> {
                    System.out.println("\n");
                    System.out.println("Введите зарплату первого программиста: ");
                    int first = Integer.parseInt(input.nextLine());
                    System.out.println("Введите зарплату второго программиста: ");
                    int second = Integer.parseInt(input.nextLine());
                    System.out.println("Введите зарплату третьего программиста: ");
                    int third = Integer.parseInt(input.nextLine());
                    System.out.println("Результат: " + programmers(first, second, third));
                }
                case 8 -> {
                    System.out.println("\n");
                    System.out.println("Введите любую строку: ");
                    String str = input.nextLine();
                    System.out.println("Результат: " + getXO(str));
                }
                case 9 -> {
                    System.out.println("\n");
                    System.out.println("Вы что-нибудь слышали о бомбе?: ");
                    String str = input.nextLine();
                    System.out.println(bomb(str));
                }
                case 10 -> {
                    System.out.println("\n");
                    System.out.println("Введите первую строку: ");
                    String str1 = input.nextLine();
                    System.out.println("Введите вторую строку: ");
                    String str2 = input.nextLine();
                    System.out.println("Результат: " + sameAscii(str1, str2));
                }
                default -> System.out.println("Ошибка! Введите один из пунктов меню.");
            }
            if (userChoice == 0) break;
        }
    }
}
