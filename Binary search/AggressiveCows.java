import java.io.*;
import java.util.*;


public class AggressiveCows {
    public static boolean isValid(int[] a,int n,int k,int mid){
        int cur=a[0];
        k--;
        for(int i=1;i<n;i++){
            if(a[i]-cur>=mid){
                k--;
                cur=a[i];
            }
        }
        if(k<=0) return true;
        return false;
    }
    public static int largestMinDistance(int[] a,int n,int k){
        int lo=a[0];
        int hi=a[n-1]-a[0];
        int ans=-1;
        while(lo<=hi){
            int mid=((lo+hi)/2);
            if(isValid(a,n,k,mid)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        //find the largest minimum distance between cows
        //O(n*logn), O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        int ans=largestMinDistance(a,n,k);
        System.out.println(ans);
    }
}