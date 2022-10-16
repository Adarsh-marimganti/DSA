import java.io.*;
import java.util.*;

public class Subset {
    public static void subsetgen(int[] a,int n,ArrayList<Integer> al,int idx){
        if(idx==a.length){
           for(int t:al){
               System.out.print(t+" ");
           } 
            System.out.println();
            return;
        }
        al.add(a[idx]);
        subsetgen(a,n,al,idx+1);
        al.remove(al.size()-1);
        subsetgen(a,n,al,idx+1);
    }
     
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<>();
        subsetgen(a,n,al,0);
    }
}