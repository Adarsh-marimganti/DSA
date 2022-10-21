import java.io.*;
import java.util.*;

public class FindMedian {
    public static double findMedianSortedArrays(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        int t=n+m;
        int c=t/2;
        double ans=0;
        if(t%2!=0){
            int p1=0;
            int p2=0;
            int me=-1;
            for(int i=0;i<=c;i++){
                if(p1<n && p2<m){
                    if(a[p1]<b[p2]){
                        me=a[p1];
                        p1++;
                    }
                    else{
                        me=b[p2];
                        p2++;
                    }
                }
                else if(p1<n && p2>=m){
                    me=a[p1];
                    p1++;
                }
                else if(p1>=n && p2<m){
                    me=b[p2];
                    p2++;
                }
            }
            ans=(double) me;
        }
        else{
            int p1=0;
            int p2=0;
            int me=-1;
            int p=-1;
            for(int i=0;i<=c;i++){
                p=me;
                if(p1<n && p2<m){
                    if(a[p1]<b[p2]){
                        me=a[p1];
                        p1++;
                    }
                    else{
                        me=b[p2];
                        p2++;
                    }
                }
                else if(p1<n && p2>=m){
                    me=a[p1];
                    p1++;
                }
                else if(p1>=n && p2<m){
                    me=b[p2];
                    p2++;
                }
                
            }
            ans=(double) (p+me)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        //Find Median of two sorted arrays
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++) a[i]=sc.nextInt();
        double ans=findMedianSortedArrays(a,b);
        System.out.println(ans);
    }
    
}