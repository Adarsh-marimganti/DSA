import java.io.*;
import java.util.*;


public class BinarySearchFloor {
    public static int BSFloor(int[] a,int n,int k){
        int lo=0;
        int hi=n-1;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]<=k){
                 lo=mid+1;
                ans=a[mid];
            }
            else if(a[mid]>k) hi=mid-1;
        }
        return ans;
    }
    public static void main(String[] args){
        //binary search
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        int ans=BSFloor(a,n,k);
        if(ans!=-1)
            System.out.println("Floor of "+k+" is "+ans);
        else
            System.out.println("No element lesser than "+k);
    }
}