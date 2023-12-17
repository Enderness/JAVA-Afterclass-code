package Static;

public class StaticTest {

  public static void main(String[] args) {
    circle c1 = new circle(10);
    circle c2 = new circle(20);
    //类变量，一次改变全改变
    c1.name = "circle1";

    c2.name2 = "circle2";
    c2.display();
    c1.display();

    System.out.println(c1.FindArea());
    System.out.println(c2.FindArea());
    //类方法
    System.out.println(circle.name);
    System.out.println("-----------------");
    System.out.println(c1.getName());
    System.out.println(c2.getName2());
    System.out.println(c2.getName());


  }

}