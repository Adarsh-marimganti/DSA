import java.io.*;
import java.util.*;

public class TwiceCheck {
    public static int twiceCheck(int[] a,int n){
        int lo=0;
        int hi=n-1;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid%2==0){
            if(a[mid]==a[mid+1]){
                lo=mid+2;
            }
            else{
                hi=mid-2;
                ans=hi;
            }
            }
            else{
                if(a[mid]==a[mid-1])
                    lo=mid+1;
                else
                    hi=mid-1;
            }
        }
        return a[lo];
    }
    public static void main(String[] args) {
        //Given a sorted array where every element appears twice except one element
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int ans=twiceCheck(a,n);
        System.out.println(ans);
    }
    
}