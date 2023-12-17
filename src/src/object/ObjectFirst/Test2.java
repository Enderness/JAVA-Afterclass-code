package object.ObjectFirst;

public class Test2 {
    public static void main(String[] args) {
        //1.类建议使用英文单词，首字母大写，变量建议使用驼峰命名法
        //2.类中的变量称为成员变量
        //3.成员变量本身存在默认值
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.chinese);
        System.out.println(s.math);

        //4.一个代码文件中，多个class类，一个用public修饰

        //5.对象与对象不会影响，
        Student s1 = new Student();
        s1.name ="张三";

        Student s2 = new Student();
        s2.name ="李四";

        System.out.println(s1.name);

    }

}
