package textbook.test;

import java.util.Random;

public class EstimatePi {
    public static void main(String[] args) {
        int totalPoints = 100000000;  // 总随机点数
        int pointsInsideCircle = 0;  // 落在圆内的点数

        Random random = new Random();
        for (int i = 0; i < totalPoints; i++) {
            double x = random.nextDouble();  // 在[0,1)范围内生成随机x坐标
            double y = random.nextDouble();  // 在[0,1)范围内生成随机y坐标

            // 计算点到原点的距离
            double distance = Math.sqrt(x * x + y * y);

            // 如果点在单位圆内，则计数加一
            if (distance <= 1) {
                pointsInsideCircle++;
            }
        }

        // 使用蒙特卡洛方法估算圆周率
        double pi = 4.0 * pointsInsideCircle / totalPoints;
        System.out.println("Estimated value of pi: " + pi);
    }
}