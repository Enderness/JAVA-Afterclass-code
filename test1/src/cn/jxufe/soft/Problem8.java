package cn.jxufe.soft;


public class Problem8 {
    public static void main(String[] args)
    {
        for (int i = 100; i <= 1000000; i++)
        {
            if (isPrimeNum(i) && isPalinNum(i))
            {
                System.out.println(i + " 是回文素数");
            }
        }
    }

    public static boolean isPrimeNum(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalinNum(int num)
    {
        int originalNum = num;
        int reverseNum = 0;
        while (num != 0)
        {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reverseNum;
    }
}