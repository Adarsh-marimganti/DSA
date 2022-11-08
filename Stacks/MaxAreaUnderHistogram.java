import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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
public class MaxAreaUnderHistogram{
    public static void main(String[] args){
        //find the maximum rectangular area under histogram
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int[] lmin=new int[n];
        int[] rmin=new int[n];
        int area=0;
        Stack st=new Stack();
        st.push(Integer.MIN_VALUE);
        for(int i=0;i<n;i++){
            while(st.peek()!=Integer.MIN_VALUE && a[st.peek()]>a[i]) st.pop();
            if(st.peek()==Integer.MIN_VALUE) lmin[i]=0;
            else lmin[i]=st.peek();
            st.push(i);
        }
        //for(int i=0;i<n;i++) System.out.print(lmin[i]+" ");
        //System.out.println();
        st=new Stack();
        st.push(Integer.MIN_VALUE);
        for(int i=n-1;i>=0;i--){
            while(st.peek()!=Integer.MIN_VALUE && a[st.peek()]>a[i]) st.pop();
            if(st.peek()==Integer.MIN_VALUE) rmin[i]=n;
            else rmin[i]=st.peek();
            st.push(i);
        }
        //for(int i=0;i<n;i++) System.out.print(rmin[i]+" ");
        for(int i=0;i<n;i++) area=Math.max(area,a[i]*(rmin[i]-lmin[i]-1));
        System.out.println(area);
    }
}