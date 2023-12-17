package textbook.test;

public class TestMax {

    public static void main(String[] args) {

        int i = 5;
        int j = 2;
        int k=max(i, j);
        System.out.println(k);

    }

    public static int max(int i, int j){

        int result;
        if(i > j)
        {
            result = i;
        }
        else
        {
            result = j;

        }
        return result;
    }


}
