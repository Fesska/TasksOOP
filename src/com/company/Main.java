package com.company;

import static com.company.Menu.block1Show;
import static classes.task.Block1.*;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int userChoice;

        while (true)
        {
            System.out.println("\f");
            userChoice = block1Show();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("\f");
                    System.out.println("Введите количество минут: ");
                    int min = input.nextInt();
                    int result = convert(min);
                    System.out.println("Количество секунд: " + result);
                }
                case 0 -> {
                    input.close();
                    return;
                }
            }
        }
    }
}
