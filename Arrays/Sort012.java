import java.io.*;
import java.util.*;

public class Sort012 {
    public static void sort012(int a[], int n){
        int zc=0;
        int oc=0;
        int tc=0;
        for(int i=0;i<n;i++){
            if(a[i]==0) zc++;
            else if(a[i]==1) oc++;
            else if(a[i]==2) tc++;
        }
        int i=0;
        while(i<n){
            if(zc>0){
                zc--;
                a[i]=0;
            }
            else if(oc>0){
                oc--;
                a[i]=1;
            }
            else if(tc>0){
                tc--;
                a[i]=2;
            }
            i++;
        }
        
    }
    public static void main(String[] args) {
        //sort array consisting of 0,1 and 2
        //using zero count,one count and two count
        //O(n+n), O(n)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        sort012(a,n);
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
}
}