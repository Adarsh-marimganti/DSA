import java.io.*;
import java.util.*;

public class CabinetPartitioning {
    public static int BSC(int[] arr, int n,int max, int sum,int key){
        int lo=max;
        int hi=sum;
        int ans=0;
        while(lo<=hi){
           int mid=(lo+hi)/2;
           if(checkf(arr,n,key,mid)){
               hi=mid-1;
               ans=mid;
           }
            else
                lo=mid+1;
        }
        return ans;
    }
    public static boolean checkf(int arr[], int n, int key, int val){
        int cnt=1;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]+sum>val){
                cnt++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return (cnt<=key);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //divide the work for k workers such that it takes minimum time
            int siz=sc.nextInt();
            int key=sc.nextInt();
            int arr[]=new int[siz];
            for(int i=0;i<siz;i++){
                arr[i]=sc.nextInt(); 
            }
            int max=arr[0];
            
            for(int i=1;i<siz;i++){
                  max=Math.max(max,arr[i]);
                }
            int sum=arr[0];
            for(int i=1;i<siz;i++){
                 sum+=arr[i];
                }
           
            System.out.println(BSC(arr,siz,max,sum,key));  
        
    }
    
}