package main;

import java.util.Random;

public class Singleton
{
    private static Random random;

    public static Random getInstanceBottom()
    {
        if(random == null)
        {
            random = new Random();
        }
        return random;
    }
}
