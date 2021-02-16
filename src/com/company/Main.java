package com.company;

import static com.company.Menu.block1Show;
import static classes.task.Block1.*;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
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
                case 0 -> {
                    input.close();
                    return;
                }
            }
        }
    }
}
