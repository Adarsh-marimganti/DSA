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
public class StockSpan {

    public static void main(String[] args) {
        //stock span
        //stock on that day is price of the stock is less than or equal to its price on the current day
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] a=new int[n];
            Stack st=new Stack();
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            st.push(Integer.MAX_VALUE);
            int[] lmax=new int[n];
            for(int i=0;i<n;i++){
                while(st.peek()!=Integer.MAX_VALUE && a[st.peek()]<=a[i]) st.pop();
                lmax[i]=st.peek();
                st.push(i);
            }
            int[] stock=new int[n];
            stock[0]=1;
            for(int i=1;i<n;i++){
                if(lmax[i]==Integer.MAX_VALUE) stock[i]=i+1; 
                 else stock[i]=i-lmax[i];   
            }
            for(int i=0;i<n;i++) System.out.print(stock[i]+" ");
            System.out.println();
    }
}