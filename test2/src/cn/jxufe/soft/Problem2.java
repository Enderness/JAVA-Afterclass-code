package cn.jxufe.soft;

import java.sql.SQLOutput;
import java.util.Scanner;

class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this(3, 1, 0, 0);
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * (Math.tan(Math.PI / n)));
    }
}


public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("多边形边数:");
        int n = in.nextInt();
        System.out.println("多边形边长:");
        double side = in.nextDouble();

        System.out.println("多边形边数");
        int n1 = in.nextInt();
        System.out.println("多边形边长");
        double side1 = in.nextDouble();
        System.out.println("中点x坐标");
        double x = in.nextDouble();
        System.out.println("中点y坐标");
        double y = in.nextDouble();
        in.close();
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(n,side);
        RegularPolygon r3 = new RegularPolygon(n1,side1,x,y);
        System.out.printf("%.2f %.2f\n",r1.getPerimeter(), r1.getArea());
        System.out.printf("%.2f %.2f\n",r2.getPerimeter(), r2.getArea());
        System.out.printf("%.2f %.2f\n",r3.getPerimeter(), r3.getArea());
    }
}

