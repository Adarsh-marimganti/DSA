import java.util.*;
class Queue{
    ArrayList<Integer> al;
    int front;
    int rear;
    Queue(){
        al=new ArrayList<Integer>();
        front=-1;
        rear=-1;
    }
    void enqueue(int e){
        if(front==-1 && rear==-1){
            front=0;
            rear=0;
        }
        al.add(e);
        rear++;
    }
    int peek(){
        return al.get(front);
    }
    int dequeue(){
        int e=al.get(front);
        front++;
        return e;
    }
    boolean isEmpty(){
        return (front==-1 && rear==-1);
    }
}
public class QueueImplementation{
    public static void main(String[] args){
        //Queue implementation
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Queue q=new Queue();
        for(int i=n-1;i>=0;i--) q.enqueue(a[i]);
        while(!q.isEmpty()) System.out.print(q.dequeue()+" ");
    }
}