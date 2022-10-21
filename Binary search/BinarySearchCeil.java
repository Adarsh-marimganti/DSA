import java.io.*;
import java.util.*;


public class BinarySearchCeil {
    public static int BSCeil(int[] a,int n,int k){
        int lo=0;
        int hi=n-1;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]<=k){
                 lo=mid+1;
            }
            else if(a[mid]>k){
              hi=mid-1;  
              ans=a[mid];
            } 
        }
        return ans;
    }
    public static void main(String[] args){
        //binary search ceil
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        int ans=BSCeil(a,n,k);
        if(ans!=-1)
            System.out.println("Ceil of "+k+" is "+ans);
        else
            System.out.println("No element greater than "+k);
    }
}