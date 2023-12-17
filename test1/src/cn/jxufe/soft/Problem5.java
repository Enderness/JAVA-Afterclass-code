package cn.jxufe.soft;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int k = scanner.nextInt();
        scanner.close();

        long[] fibonacci = new long[k];


        fibonacci[0] = 1;
        fibonacci[1] = 1;


        for (int i = 2; i < k; i++)
        {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }


        System.out.println("前 " + k + " 项斐波那契数列为：");
        for (int i = 0; i < k; i++)
        {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();



        if (k >= 2) {
            double bizhi = (double) fibonacci[k - 1] / fibonacci[k - 2];
            System.out.println("第 " + (k - 1) + " 项和第 " + k + " 项的比值为：" + bizhi);
        }
    }
}