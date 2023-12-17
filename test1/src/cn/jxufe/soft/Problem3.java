package cn.jxufe.soft;

import java.util.Scanner;

public class Problem3 {

public static void main(String[] args)
{

    Scanner scanner = new Scanner(System.in);

    System.out.print("请输入一个1到15的整数:");
    int n = scanner.nextInt();
    scanner.close();

    if (n >= 1 && n <= 15)
    {
        for (int i = 1; i <= n; i++)
        {

            for (int j = n; j > i; j--)
            {
                System.out.print("\t");
            }

            for (int j = i; j >= 1; j--)
            {
                System.out.print(j + "\t");
            }

            for (int j = 2; j <= i; j++)
            {
                System.out.print(j + "\t");
            }

            System.out.println();
        }
    }

}

}