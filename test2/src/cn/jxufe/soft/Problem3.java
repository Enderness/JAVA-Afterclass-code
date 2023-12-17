package cn.jxufe.soft;

public class Problem3 {
    public static void main(String[]  args){
        Queue qu = new Queue();
        for (int i = 0;i < 20;i++)
            qu.enqueue(i);
        while (!qu.empty()){
            System.out.print(qu.dequeue() + " ");
        }
    }
}
class Queue {
    private  int[] elements;
    private int size;
    public static final int DE = 8;

    public Queue(){
        this(DE);
    }
    public Queue(int capacity){
        elements = new int[capacity];
    }
    public void enqueue(int value){

        if (size >= elements.length)
        {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size] = value;
        size++;
    }
    public int dequeue(){
        int key = elements[0];

        for (int i = 0;i < size;i++)
        {
            elements[i] = elements[i+1];
        }
        size--;
        return key;
    }
    public boolean empty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
}
