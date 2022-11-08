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
        al.add(rear,e);
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
    void print(){
        for(int i=front;i<rear;i++) System.out.print(al.get(i)+" ");
    }
}
public class MaximumOfAllSubArraysOfSizeK{
    public static int getMax(int[] a,int k,int i){
        int max=Integer.MIN_VALUE;
        for(int j=i;j<i+k;j++) max=Math.max(a[j],max);
        return max;
    }
    public static void main(String[] args){
        //Queue implementation
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Queue q=new Queue();
        ArrayList<Integer> al=new ArrayList<Integer>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            q.enqueue(a[i]);
            max=Math.max(a[i],max);
        }
        al.add(max);
        for(int i=1;i<=n-k;i++){
            int r=q.dequeue();
            q.enqueue(a[i+k-1]);
            if(max==r){
                max=getMax(a,k,i);
            }
            max=Math.max(a[i+k-1],max);
            al.add(max);
        }
        for(int e:al) System.out.print(e+" ");
    }
}