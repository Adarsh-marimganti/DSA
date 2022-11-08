import java.io.*;
import java.util.*;
class Stack{
    ArrayList<Integer> al;
    int i;
    Stack(){
        al=new ArrayList<Integer>();
        i=-1;
    }
    void push(int e){
        al.add(e);
        i++;
    }
    boolean isEmpty(){
        return (i==-1);
    }
    int pop(){
        int e=al.get(i);
        al.remove(al.size()-1);
        i--;
        return e;
    }
    int peek(){
        return al.get(i);
    }
    int size(){
        return i+1;
    }
    void print(){
        System.out.println("From bottom to top");
        for(int e:al) System.out.print(e+" ");
    }
}
public class ReverseAStack{
    public static Stack insertAtBottom(Stack s,int e){
        if(s.isEmpty())
            s.push(e);
        else{
            int u=s.pop();
            insertAtBottom(s,e);
            s.push(u);
        }
        return s;
    }
    public static Stack reverse(Stack s){
        if(!s.isEmpty()){
            int u=s.pop();
            reverse(s);
            s=insertAtBottom(s,u);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        int n=sc.nextInt();
        for(int i=0;i<n;i++) s.push(sc.nextInt());
        System.out.println("Before reverse function");
        s.print();
        s=reverse(s);
        System.out.println();
        System.out.println("After reverse function");
        s.print();
    }
}