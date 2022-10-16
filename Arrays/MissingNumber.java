import java.io.*;
import java.util.*;
public class MissingNumber {
    public static int MissingNumber(int a[], int n) {
        for(int i=0;i<a.length;i++){
            int cur=Math.abs(a[i]);
            if(cur-1<a.length){
                a[cur-1]=-1*a[cur-1];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>0)
            return i+1;
        }
        return n;
    }
    public static void main(String[] args) {
        //missing integer (array consists of numbers from 1 to n) n is given
        //using indexes as boolean array
        //if visited then make it as negative
        // O(n), O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(MissingNumber(a,n));
}
}

