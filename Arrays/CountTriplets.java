import java.io.*;
import java.util.*;
public class CountTriplets {
    public static int countTriplet(int a[], int n) {
        boolean[] b=new boolean[1000000+1];
        for(int i=0;i<n;i++){
            b[a[i]]=true;
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x=a[i]+a[j];
                if(b[x]) c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        //count the triplets
        //sum of two elements is equal to the third element are known as triplets
        //O(n*n)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(countTriplet(a,n));
}
}