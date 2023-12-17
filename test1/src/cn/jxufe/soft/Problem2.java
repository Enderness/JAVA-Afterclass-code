package cn.jxufe.soft;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args)
    {
        for (int a = 1; a <= 9; a++)
        {
            for (int b = 0; b <= 9; b++)
            {
                for (int c = 0; c <= 9; c++)
                {
                    if (100 * a + 10 * a + a + 100 * b + 10 * b + b + 100 * c + 10 * c + c ==  1000 * a + 100 * b + 10 * b + c)
                    {
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    }
                }
            }
        }
    }
}
