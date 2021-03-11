package extensions;

import java.util.Scanner;

public class Menu
{
    public static int block1Show()
    {
        int userChoice;
        Scanner input = new Scanner(System.in);

        System.out.println("БФИ1801 Алешин С. ПЗ: Блок №1");
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
        System.out.println("****************************");

        userChoice = Integer.parseInt(input.nextLine());
        return userChoice;
    }

    public static int block2Show()
    {
        int userChoice;
        Scanner input = new Scanner(System.in);

        System.out.println("БФИ1801 Алешин С. ПЗ: Блок №2");
        System.out.println("****************************");
        System.out.println("Доступные методы:");
        System.out.println("1. Номер противоположного дома");
        System.out.println("2. Поменять имя и фамилию местами");
        System.out.println("3. Расчет цены с учетом скидки");
        System.out.println("4. Разница между наибольшим и наименьшим в массиве");
        System.out.println("5. Подсчет одинаковых цифр");
        System.out.println("6. Строка в обратном порядке");
        System.out.println("7. Разница в зарплате программистов");
        System.out.println("8. Проверка равенства X и O в строке");
        System.out.println("9. Бомба?");
        System.out.println("10. Сумма ASCII");
        System.out.println("0. Выход");
        System.out.println("****************************");

        userChoice = Integer.parseInt(input.nextLine());
        return userChoice;
    }
}
