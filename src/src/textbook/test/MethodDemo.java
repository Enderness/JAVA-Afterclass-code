package textbook.test;

public class MethodDemo {
    public static int sum(int i1, int i2){
        int result = 0;

        for (int i = i1; i <= i2; i++){
            result += i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(sum(1, 10));
        System.out.println(sum(20, 37));
        System.out.println(sum(100, 200));

        //直接接收sum函数的值
        int z =sum(1, 10);
        System.out.println(z);

    }

}
