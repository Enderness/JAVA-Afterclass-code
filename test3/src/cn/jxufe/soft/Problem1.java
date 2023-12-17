package cn.jxufe.soft;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        point1 p1 = new point1();
        point1 p2 = new point1();

        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("两点之间的距离为:" + distance);
    }
}



class point1 {
    private int x;
    private int y;

    public int getX() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个或第二个点x坐标");
        x = scanner.nextInt();
        return x;
    }

    public int getY() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个或第二个点y坐标");
        y = scanner.nextInt();
        return y;
    }

}
