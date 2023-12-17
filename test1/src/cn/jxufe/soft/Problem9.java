package cn.jxufe.soft;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入战士的数量 N：");
        int N = scanner.nextInt();
        System.out.print("请输入轮回数 M：");
        int M = scanner.nextInt();

        int[] soldiers = new int[N];
        for (int i = 0; i < N; i++)
        {
            soldiers[i] = i + 1;
        }

        int count = N;
        int index = 0;
        System.out.print("战士出列的顺序：");
        for (; count > 0; count--) {
            index = (index + M - 1) % N;
            System.out.print(soldiers[index] + " ");

            for (int i = index; i < count - 1; i++)
            {
                soldiers[i] = soldiers[i + 1];
            }

        }

    }
}
