package cn.jxufe.soft;

public class Problem12 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            if (isSumEqual(i, 10, 22) && isSumEqual(i, 16, 22) && isSumEqual(i, 12, 22)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isSumEqual(int num, int base, int targetSum) {
        int sum = 0;
        while (num > 0) {
            sum += num % base;
            num /= base;
        }
        return sum == targetSum;
    }
}