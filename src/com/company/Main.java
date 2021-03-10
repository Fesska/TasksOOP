package com.company;

import static com.company.Menu.block1Show;
import static com.company.Menu.block2Show;
import static classes.task.Block1.*;
import static classes.task.Block2.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void block1Tasks()
    {
        Scanner input = new Scanner(System.in);
        int userChoice;

        while (true)
        {
            System.out.println("\n");
            userChoice = block1Show();

            switch (userChoice)
            {
                case 1 -> {
                    System.out.println("\n");
                    System.out.println("Введите количество минут: ");
                    int min = input.nextInt();
                    System.out.println("Количество секунд: " + convert(min));
                }
                case 2 -> {
                    System.out.println("\n");
                    System.out.println("Введите кол-во двухочковых бросков: ");
                    int x2Count = input.nextInt();
                    System.out.println("Введите кол-во трехочковых бросков: ");
                    int x3Count = input.nextInt();
                    System.out.println("Очков набрано за матч: " + points(x2Count, x3Count));
                }
                case 3 -> {
                    System.out.println("\n");
                    System.out.println("Введите кол-во побед");
                    int win = input.nextInt();
                    System.out.println("Введите кол-во поражений: ");
                    int los = input.nextInt();
                    System.out.println("Введите кол-во ничьих: ");
                    int draw = input.nextInt();
                    System.out.println("Набранные очки команды: " + footballPoints(win, los, draw));
                }
                case 4 -> {
                    System.out.println("\n");
                    System.out.println("Введите число: ");
                    int value = input.nextInt();
                    System.out.println("Ответ: " + divisibleByFive(value));
                }
                case 5 -> {
                    System.out.println("\n");
                    System.out.println("Введите значение операнда А (true или false): ");
                    boolean a = input.nextBoolean();
                    System.out.println("Введите значение операнда B (true или false): ");
                    boolean b = input.nextBoolean();
                    System.out.println("Результат логической операции: " + and(a, b));
                }
                case 6 -> {
                    System.out.println("\n");
                    System.out.println("Сколько можно покрасить (кв. м.)? ");
                    int amount = input.nextInt();
                    System.out.println("Введите ширину стены: ");
                    int width = input.nextInt();
                    System.out.println("Введите высоту стены: ");
                    int height = input.nextInt();
                    System.out.println("С таким кол-вом краски можно покрасить стен:"
                            + howManyWall(amount, width, height));
                }
                case 7 -> {
                    System.out.println("\n");
                    System.out.println("Код исправлен! Введите число, которое нужно возвести в квадрат: ");
                    int value = input.nextInt();
                    System.out.println("Результат: " + squared(value));
                }
                case 8 -> {
                    System.out.println("\n");
                    System.out.println("Введите значение prob: ");
                    float prob = input.nextFloat();
                    System.out.println("Введите значение prize: ");
                    int prize = input.nextInt();
                    System.out.println("Введите значение pay: ");
                    int pay = input.nextInt();
                    System.out.println("Результат: " + profitableGamble(prob, prize, pay));
                }
                case 9 -> {
                    System.out.println("\n");
                    System.out.println("Введите значение FPS: ");
                    int fps = input.nextInt();
                    System.out.println("Введите кол-во минут: ");
                    int mins = input.nextInt();
                    System.out.println("Кол-во кадров за введенное кол-во минут: " + frames(fps, mins));
                }
                case 10 -> {
                    System.out.println("\n");
                    System.out.println("Введите делимое: ");
                    int a = input.nextInt();
                    System.out.println("Введите делитель: ");
                    int b = input.nextInt();
                    System.out.println("Остаток от деления: " + mod(a, b));
                }
                default -> {
                    System.out.println("Ошибка! Введите один из пунктов меню.");
                }
            }
            if (userChoice == 0) break;
        }
    }

    public static void block2Tasks()
    {
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
                    int percent = Integer.parseInt(input.nextLine());
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
                default -> {
                    System.out.println("Ошибка! Введите один из пунктов меню.");
                }
            }
            if (userChoice == 0) break;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int userChoice;

        while(true)
        {
            System.out.println("БФИ1801 Алешин Сергей, практические задания по дисциплине ООП");
            System.out.println("*********************");
            System.out.println("Выберите блок задач: ");
            System.out.println("1. 1-10");
            System.out.println("2. 11-20");
            System.out.println("0. Выход");
            System.out.println("*********************");
            userChoice = input.nextInt();

            switch (userChoice)
            {
                case 1 -> block1Tasks();
                case 2 -> block2Tasks();

                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("Ошибка! Введите один из пунктов меню.");
                }
            }
        }
    }
}
