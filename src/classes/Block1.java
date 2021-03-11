package classes;

public class Block1
{
    public static int convert(int minutes)
    {
        return minutes * 60;
    }

    public static int points(int x2Count, int x3Count)
    {
        return x2Count * 2 + x3Count * 3;
    }

    public static int footballPoints(int win, int los, int draw)
    {
        return win * 3 + draw;
    }

    public static boolean divisibleByFive(int value)
    {
        return value%5 == 0;
    }

    public static boolean and(boolean a, boolean b)
    {
        return a && b;
    }

    public static int howManyWall(int wallPaintAmount, int width, int height)
    {
        return wallPaintAmount / (width * height);
    }

    public static int squared(int a)
    {
        return a * a;
    }

    public static boolean profitableGamble(float prob, int prize, int pay)
    {
        return (prob * prize) > pay;
    }

    public static int frames (int fps, int minutes)
    {
        return fps * minutes * 60;
    }

    public static int mod(int a, int b)
    {
        return a - ((a / b) * b);
    }
}
