package cn.jxufe.soft;


import java.util.*;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

class StopWatch{
    private Date startTime;
    private Date endTime;
    public StopWatch() {
        startTime = new Date();
    }
    public void start(){
        startTime = new Date();
    }
    public void stop(){
        endTime = new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }

}

public class  Problem1 {

    public static void selectsort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; ++i) {
            int k = i;
            for (int j = i + 1; j < n; ++j)
                if (a[j] < a[k])
                    k = j;
            if (i != k) {
                int tem = a[k];
                a[k] = a[i];
                a[i] = tem;
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = 100000;
        int[] arr = new int[num];
        Random ran = new Random();
        for (int i = 0; i < num; ++i)
            arr[i] = ran.nextInt(num);

        StopWatch watch = new StopWatch();
        selectsort(arr);
        watch.stop();
        System.out.println(watch.getElapsedTime() + "ms");
        cin.close();
    }

}
