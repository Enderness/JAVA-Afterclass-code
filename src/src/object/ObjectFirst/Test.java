package object.ObjectFirst;

public class Test {
    public static void main(String[] args)
    {

        Student s1 = new Student();
        s1.name ="波妞";
        s1.chinese = 100;
        s1.math =100;
        s1.printAvgScore();
        s1.printTotalScore();

        Student s2 = new Student();
        s2.name ="波仔";
        s2.chinese = 100;
        s2.math =60;
        s2.printAvgScore();
        s2.printTotalScore();



    }
}
