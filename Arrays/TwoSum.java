import java.io.*;
import java.util.*;

public class TwoSum {
    public static int[] ans=new int[2];
    public static boolean twoSum(int[] a,int k){
        int n=a.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            if(a[lo]+a[hi]==k){
                ans[0]=a[lo];
                ans[1]=a[hi];
                return true;
            }
            if(a[lo]+a[hi]<k) lo++;
            else if(a[lo]+a[hi]>k) hi--;
        }
        return false;
    }
    public static void main(String[] args) {
        //check if sum of two integers is equal to target
        //using two pointer
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k=sc.nextInt();
        Arrays.sort(a);
        if(twoSum(a,k)){
            System.out.println("YES "+ans[0]+" "+ans[1]);
        }
        else
            System.out.println("No pair exists in the array with sum as target");
        
}
}