package object.ObjectFirst;

public class Student {

    String  name;
    double chinese;
    double math;
    public void printTotalScore(){
        System.out.println(name+"总成绩"+(chinese+math));
    }
    public void printAvgScore(){
        System.out.println(name+"平均成绩"+(chinese+math)/2.0);
    }

}
