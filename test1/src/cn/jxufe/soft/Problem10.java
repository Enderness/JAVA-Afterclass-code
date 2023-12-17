package cn.jxufe.soft;

import java.util.ArrayList;
import java.util.List;

public class Problem10{
    public static void main(String[] args)
    {
        List<Boolean> lights = new ArrayList<>(101);

        for (int i = 0; i <= 100; i++)
        {
            lights.add(i, false);
        }

        for (int i = 1; i <= 100; i++)
        {
            int sqrt_i = (int) Math.sqrt(i);
            if (sqrt_i * sqrt_i == i)
            {
                lights.set(i, true);
            }
        }

        System.out.print("开着的灯的编号有：");
        for (int i = 1; i <= 100; i++)
        {
            if (lights.get(i))
            {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }
}