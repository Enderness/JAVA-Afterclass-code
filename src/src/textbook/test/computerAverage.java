package textbook.test;

import java.util.Scanner;

public class computerAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        double num1 = input.nextDouble();
        Double num2 = input.nextDouble();
        Double num3 = input.nextDouble();

        Double average = (num1 + num2 + num3) / 3;

        System.out.println("The average is " + average);

    }

}
