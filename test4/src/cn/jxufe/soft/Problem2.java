package cn.jxufe.soft;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught in main: " + e.getMessage());
        }
    }

    public static void method1() {
        try {
            method2();
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught in method1: " + e.getMessage());
            // 处理method1中的异常逻辑，或者将异常继续抛出
            throw e;
        }
    }

    public static void method2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

        int a = input.nextInt();

        if (a < 0) {
            // 如果输入的值为负数，抛出IllegalArgumentException
            throw new IllegalArgumentException("Input must be a positive integer.");
        } else {
            System.out.println("You entered: " + a);
        }
    }
}
