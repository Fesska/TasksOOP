package com.company;

import java.util.Scanner;

public class Menu
{
    public static int block1Show()
    {
        int userChoice;
        Scanner input = new Scanner(System.in);

        System.out.println("Практические задачи: Блок №1");
        System.out.println("****************************");
        System.out.println("Доступные методы:");
        System.out.println("1. Конвертация минут в секунды");
        System.out.println("2. Подсчет очков баскетбольного матча");
        System.out.println("3. Подсчет очков футбольной команды");
        System.out.println("4. Проверка делимости на 5");
        System.out.println("5. Логический оператор &&");
        System.out.println("6. Покраска стен");
        System.out.println("7. Исправленный код (возведение в квадрат)");
        System.out.println("8. Выгода?");
        System.out.println("9. Кадры в минуту");
        System.out.println("10. Реализация оператора модуля");
        System.out.println("0. Выход");

        userChoice = input.nextInt();
        return userChoice;
    }
}
