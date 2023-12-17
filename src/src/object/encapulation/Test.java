package object.encapulation;



public class Test {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setScore(60);
        System.out.println(s1.getScore());
        s1.printpass();

    }
}
