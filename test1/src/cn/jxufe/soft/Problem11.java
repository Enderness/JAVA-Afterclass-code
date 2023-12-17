package cn.jxufe.soft;

public class Problem11 {
    public static void main(String[] args)
    {
        int a = 11;
        int b = 20;
        int[] digitCounts = new int[10];


        for (int i = a; i <= b; i++)
        {

            int num = i;
            while (num > 0)
            {
                int digit = num % 10;
                digitCounts[digit]++;
                num /= 10;
            }

        }


        for (int i = 0; i < 10; i++)
        {
            System.out.print(digitCounts[i] + " ");
        }

    }
}