package cn.jxufe.soft;
import java.util.Scanner;


public class Problem6
{
    public static double Sqrt(long n)
    {

        double lastGuess = n;
        double nextGuess;

        do
        {
            nextGuess = 0.5 * (lastGuess + n / lastGuess);
        } while (Math.abs(2 * nextGuess * lastGuess - lastGuess * lastGuess) > 0.0000001);

        return nextGuess;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数: ");
        long number = scanner.nextLong();

        if (number < 0)
        {
            System.out.println("输入一个整数:");
        }

        else
        {
            double result = Sqrt(number);
            System.out.println("古巴比伦法计算的平方根为: " + result);
        }

        scanner.close();


    }
    }