package classes.task;

public class Block2
{
    public static int oppositeHouse(int houseNum, int streetLen)
    {
        return 1; //TODO
    }

    public static String nameShuffle(String name)
    {
        String firstName = name.split(" ")[0];
        String lastName = name.split(" ")[1];
        return lastName + " " + firstName;
    }

    public static float discount(int cost, float disc)
    {
        return cost * ((100 - disc)/100);
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
        int eqCount = 0;

        /*if(a == b) eqCount++;
        if(a == c) eqCount++;
        if(b == c) eqCount++;*/
        return 1; //TODO
    }
}
