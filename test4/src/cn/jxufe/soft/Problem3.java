package cn.jxufe.soft;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Credit credit = null;

        boolean continueExchange = true;

        try {
            System.out.print("请输入初始积分：");
            int initialPoint = scanner.nextInt();

            credit = new Credit(initialPoint);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
            continueExchange = false;
        }

        while (continueExchange) {
            try {
                System.out.print("请输入要兑换的积分：");
                int pointsToExchange = scanner.nextInt();

                credit.exchangePoint(pointsToExchange);

                System.out.print("是否继续兑换？（是“y”/否“n”）：");
                String continueChoice = scanner.next().toLowerCase();

                continueExchange = continueChoice.equals("y");
            } catch (InsufficientPointException e) {
                System.out.println("InsufficientPointException: " + e.getMessage());
                continueExchange = false;
            } catch (NegativePointException e) {
                System.out.println("NegativePointException: " + e.getMessage());
                continueExchange = false;
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage());
                continueExchange = false;
            }
        }
    }
}


class InsufficientPointException extends Exception {
    public InsufficientPointException(String message) {
        super(message);
    }
}

class NegativePointException extends Exception {
    public NegativePointException(String message) {
        super(message);
    }
}

class Credit {
    private int point;

    public Credit(int initialPoint) {
        if (initialPoint < 0) {
            throw new IllegalArgumentException("初始积分不能为负数。");
        }
        this.point = initialPoint;
    }

    public void exchangePoint(int pointsToExchange) throws InsufficientPointException, NegativePointException {
        if (pointsToExchange < 0) {
            throw new NegativePointException("不允许使用负数进行兑换。");
        }

        if (pointsToExchange > this.point) {
            throw new InsufficientPointException("兑换分数不足。");
        }

        this.point -= pointsToExchange;
        System.out.println("成功兑换了 " + pointsToExchange + " 积分。剩余积分：" + this.point);
    }

    public int getPoint() {
        return point;
    }
}