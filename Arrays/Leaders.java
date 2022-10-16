import java.io.*;
import java.util.*;
public class Leaders {
    public static void main(String[] args) {
        //Leaders in an array
        //elements which are greater than equal to all the elements on right
        //O(n), O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int max=a[n-1];
        System.out.print(a[n-1]+" ");
        for(int i=n-2;i>=0;i--){
            if(a[i]>=max){
                System.out.print(a[i]+" ");
                max=a[i];
            }
        }
}
}