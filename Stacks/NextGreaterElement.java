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
public class NextGreaterElement{
    public static void main(String[] args){
        //return next greater element on right
        //if no greater element return -1
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int[] rmax=new int[n];
        Stack st=new Stack();
        st.push(Integer.MAX_VALUE);
        for(int i=n-1;i>=0;i--){
            while(st.peek()<a[i]) st.pop();
            rmax[i]=st.peek();
            st.push(a[i]);
        }
        for(int i=0;i<n;i++) System.out.print(rmax[i]+" ");
    }
}