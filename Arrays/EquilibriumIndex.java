import java.io.*;
import java.util.*;
public class EquilibriumIndex {
    public static int equilibriumIndex(int[] pre) {
        
        int n=pre.length;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+pre[i];
        }
        if(0==pre[n-1]-pre[0]) return 0;
        for(int i=1;i<n-1;i++){
            if(pre[i-1]==pre[n-1]-pre[i]) return i;
        }
        
        if(0==pre[n-2]) return n-1;
        return -1;
    }
    public static void main(String[] args) {
        //getting the index position at which sum on left is equal to the sum on right
        //using prefix sum
        //O(n)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(equilibriumIndex(a));
}
}