package textbook.test;

import java.util.Scanner;

public class computerAreaWithConstant
{
    public static void main(String[] args)
    {
        final double PI = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = PI * radius * radius;

        System.out.println("The area of the circle is " + area);

    }

}
