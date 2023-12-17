package object.constructor;

import object.constructor.Student;

public class Test {
    public static void main(String[] args) {



        String name; double score;
        Student s2 = new Student("张三", 100);

        Student s1 = new Student( );
        s1.name = "张三";
        s1.score = 100;


        Student s3 = new Student(name = "张三", score = 100);

        System.out.println(s3.name);
        System.out.println(s3.score);
    }
}
