package object.thisdemo;

public class Student {
    double score;
    public void printThis() {
        System.out.println(this);

    }

    public void PrintPass(double score) {
        if(this.score > score) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

    }
}
