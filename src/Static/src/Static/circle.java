package Static;

public class circle {

    private double radius;
    public static String name= "circleqq";
    public String name2;


    public String getName2() {
        return name2;
    }
    public void setName2(String name2) {
        this.name2 = name2;
    }

    public static String  getName(){
       return name;
   }


    public circle(double radius){
        this.radius = radius;
    }

    public  double FindArea(){
        return 3.14*radius*radius;
    }
    public void display(){
        System.out.println("radius is : "+radius);
    }

}
