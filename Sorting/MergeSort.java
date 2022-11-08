import java.io.*;
import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] a,int lo,int hi){
        if(lo==hi) return;
        int mid=(lo+hi)/2;
        mergeSort(a,lo,mid);
        mergeSort(a,mid+1,hi);
        merge(a,lo,hi);
    }
    public static void merge(int[] a,int lo,int hi){
        int[] temp=new int[hi-lo+1];
        int mid=(lo+hi)/2;
        int p1=lo;
        int p2=mid+1;
        int k=0;
        while(p1<=mid && p2<=hi){
            if(a[p1]<a[p2]){
                temp[k]=a[p1];
                k++;
                p1++;
            }
            else{
                temp[k]=a[p2];
                k++;
                p2++;
            }
        }
        while(p1<=mid){
            temp[k]=a[p1];
            p1++;
        }
        while(p2<=hi){
            temp[k]=a[p2];
            p2++;
        }
        for(int i=0;i<(hi-lo+1);i++){
            a[lo+i]=temp[i];
        }
    }
    public static void main(String[] args) {
        //Merge sort
        //using divide and conquer
        //O(nlogn), O(n)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        mergeSort(a,0,n-1);
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
        System.out.println();
}
}