package cn.jxufe.soft;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {


        Circle c1 = new Circle();
        double radius = c1.getR();
        double circumference = c1.getH();
        double area = c1.getS();

        System.out.println("半径为" + radius);
        System.out.println("面积为" + area);
        System.out.println("周长为" + circumference);

        c1.Point();



    }
}


class Circle {

    private int x;
    private int y;
    private int r;

    public double getR() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入半径");
        r = scanner.nextInt();
        return r;
    }

    public double getH() {
        return 2 * Math.PI * r;
    }

    public double getS() {
        return Math.PI * r * r;
    }

    public void Point(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入x坐标");
        x = scanner.nextInt();
        System.out.println("请输入y坐标");
        y = scanner.nextInt();


        if(x*x+y*y<=r*r){

            System.out.println("点在圆内");
        }else{

            System.out.println("点在圆外");
        }


    }
}
