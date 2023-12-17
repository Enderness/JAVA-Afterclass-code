package textbook.test;

public class solveNumbersComputer {
    public static void main(String[] args) {
        // 定义方程变量
        int a, b, c, d;

        // 解方程组
        for (a = 0; a <= 8; a++) {
            for (b = 0; b <= 8; b++) {
                for (c = 0; c <= 14; c++) {
                    for (d = 0; d <= 6; d++) {
                        if (a + b == 8 && c - d == 6 && a + c == 14 && b + d == 10) {
                            System.out.println("a = " + a);
                            System.out.println("b = " + b);
                            System.out.println("c = " + c);
                            System.out.println("d = " + d);
                            return;
                        }
                    }
                }
            }
        }
    }
}
