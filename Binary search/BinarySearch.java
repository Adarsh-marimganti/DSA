import java.io.*;
import java.util.*;


public class BinarySearch {
    public static int binarySearch(int[] a,int n,int k){
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==k) return mid;
            if(a[mid]<k) lo=mid+1;
            else if(a[mid]>k) hi=mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        //binary search
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        int ans=binarySearch(a,n,k);
        if(ans!=-1)
            System.out.println("element found at "+ans);
        else
            System.out.println("element not found");
    }
}