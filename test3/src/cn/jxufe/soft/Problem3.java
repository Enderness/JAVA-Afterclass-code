package cn.jxufe.soft;

public class Problem3 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(1, 1);
        MyPoint point3 = new MyPoint(2, 5);

        Triangle2D triangle1 = new Triangle2D(point1, point2, point3);

        // 输出三角形的面积和周长
        System.out.println("三角形1的面积: " + triangle1.getArea());
        System.out.println("三角形1的周长: " + triangle1.getPerimeter());

        // 检查点是否在三角形内
        MyPoint testPoint = new MyPoint(1, 2);
        System.out.println("测试点是否在三角形1内部? " + triangle1.contains(testPoint));

        // 创建第二个三角形
        MyPoint point4 = new MyPoint(0, 0);
        MyPoint point5 = new MyPoint(3, 3);
        MyPoint point6 = new MyPoint(6, 0);
        Triangle2D triangle2 = new Triangle2D(point4, point5, point6);

        // 检查第二个三角形是否在第一个三角形内
        System.out.println("三角形2是否在三角形1内部? " + triangle1.contains(triangle2));

        // 检查两个三角形是否重叠
        System.out.println("三角形1和三角形2是否重叠? " + triangle1.overlaps(triangle2));
    }
}


 class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
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

    public double distance(MyPoint point) {
        double dx = this.x - point.getX();
        double dy = this.y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);
        return side1 + side2 + side3;
    }

    public boolean contains(MyPoint p) {
        double area1 = getArea(p1, p2, p);
        double area2 = getArea(p2, p3, p);
        double area3 = getArea(p3, p1, p);
        double totalArea = getArea();
        return area1 + area2 + area3 <= totalArea;
    }

    private double getArea(MyPoint p1, MyPoint p2, MyPoint p3) {
        return Math.abs((p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY())) / 2);
    }

    public boolean contains(Triangle2D t) {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    public boolean overlaps(Triangle2D t) {
        return contains(t.p1) || contains(t.p2) || contains(t.p3);
    }
}
