package classes.task;

import java.util.Locale;

public class Block2
{
    public static int oppositeHouse(int houseNum, int streetLen)
    {
        return ((2 * streetLen + 1) - houseNum);
    }

    public static String nameShuffle(String name)
    {
        String firstName = name.split(" ")[0];
        String lastName = name.split(" ")[1];
        return lastName + " " + firstName;
    }

    public static float discount(int cost, float disc)
    {
        return (cost*(100 - disc))/100;
    }

    public static int differenceMaxMin(int [] array)
    {
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int j : array) {
            if (j < min) min = j;
            if (j > max) max = j;
        }

        return max - min;
    }

    public static int equal(int a, int b, int c)
    {
        if (a == b && a == c) return 3;
        if (a == b || a == c || b == c) return 2;
        else return 0;
    }

    public static String reverse(String reference)
    {
        String revString = "";

        for (int i = reference.length() - 1; i >= 0; i--)
        {
            revString += reference.charAt(i);
        }

        return revString;
    }

    public static int programmers(int fstSalary, int secSalary, int trdSalary)
    {
        return Math.max(Math.max(fstSalary, secSalary), trdSalary)
                - Math.min(Math.min(fstSalary, secSalary), trdSalary);
    }

    public static boolean getXO(String reference)
    {
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < reference.length(); i++)
        {
            if (String.valueOf(reference.charAt(i)).equalsIgnoreCase("o")) oCount++;
            if (String.valueOf(reference.charAt(i)).equalsIgnoreCase("x")) xCount++;
        }

        return xCount == oCount;
    }

    public static String bomb(String reference)
    {
        if (reference.toLowerCase(Locale.ROOT).contains("bomb")) return "ПРИГНИСЬ!";
        else return "Расслабься, бомбы нет.";
    }

    public static boolean sameAscii(String str1, String str2)
    {
        return str1.chars().sum() == str2.chars().sum();
    }
}
