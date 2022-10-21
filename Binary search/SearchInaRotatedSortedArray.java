import java.io.*;
import java.util.*;


public class SearchInaRotatedSortedArray {
    
    public static int BS(int[] a,int n,int k){
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==k) return mid;
            if(a[lo]<=a[mid]){
                if(k>=a[lo] && k<=a[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else {
                if(k>=a[mid] && k<=a[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        //find element in a sorted and rotated array
        //O(logn), O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        int ans=BS(a,n,k);
        if(ans!=-1)
            System.out.println("Element found at "+ans);
        else
            System.out.println("Element not found");
    }
}