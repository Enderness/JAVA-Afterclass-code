package cn.jxufe.soft;

public class Problem7 {
    public static boolean isPerNum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }


    public static boolean isUglyNum1(int num) {
        for (int i = 2; i <= 5; i++) {
            while (num % i == 0) {
                num = num / i;
            }
        }

        return num == 1;
    }



    public static void findPerNum() {
        for (int num = 1; num <= 999; num++) {
            if (isPerNum(num)) {
                System.out.print(num+"\t");
            }
        }
    }

    public static void findUglyNum() {
        for (int num = 1; num <= 999; num++) {
            if (isUglyNum1(num)) {
                System.out.print(num+"\t");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("完数:");
        findPerNum();

        System.out.println("\n"+"丑数:");
        findUglyNum();
    }
}