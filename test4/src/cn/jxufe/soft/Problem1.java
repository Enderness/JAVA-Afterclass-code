package cn.jxufe.soft;

public class Problem1 {
    public static void main(String[] args) {
        try {
            int num1 = 1, num2 = 0;
            int num3 = num1 / num2; // 异常提示：除数不能为0
        } catch (ArithmeticException e) {
            System.out.println("异常提示：" + e.getMessage());
        }

        try {
            Object obj = null;
            String str = obj.toString(); // 异常提示：空指针异常
        } catch (NullPointerException e) {
            System.out.println("异常提示：" + e.getMessage());
        }

        try {
            int[] array = new int[10];
            int elem = array[-5]; // 异常提示：数组元素的索引不在0到len-1的范围内
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常提示：" + e.getMessage());
        }
    }


}
