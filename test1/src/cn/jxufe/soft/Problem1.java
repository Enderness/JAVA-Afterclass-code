package cn.jxufe.soft;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入起始值m：");
        int m = scanner.nextInt();

        System.out.print("请输入结束值n：");
        int n = scanner.nextInt();

       chuyi5he6(m, n);

    }
    public static void chuyi5he6(int m, int n)
    {
        int count = 0;
        for (int i = m; i <= n; i++)
        {
            if (i % 5 == 0 && i % 6 == 0)
            {
                System.out.print(i + "\t");
                count++;

                if (count == 10)
                {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }

}
