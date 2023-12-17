package object.javabean;

public class Test {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setName("Mike"); // 设置学生的名字
        s1.setScore(100.0); // 设置学生的分数
        System.out.println(s1.getName());
        System.out.println(s1.getScore());


        StudentOperator op = new StudentOperator(s1);
        op.printpass();
    }
}

class Student1 {
    private String name;
    private double score;

    public String getName() {
        return name;
    }

    public Student1() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}



class StudentOperator{

    private Student1 student;
    public StudentOperator(Student1 student){
        this.student = student;
    }


    public void printpass(){
        if (student.getScore()>=60){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}