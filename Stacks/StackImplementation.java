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
}
public class StackImplementation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        int n=sc.nextInt();
        for(int i=0;i<n;i++) s.push(sc.nextInt());
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}