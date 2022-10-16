import java.io.*;
import java.util.*;

public class ThreeSum {
    public static int[] ans=new int[3];
    public static boolean threeSum(int[] a,int k){
        int n=a.length;
        for(int i=0;i+1<n;i++){
        int lo=i+1;
        int hi=n-1;
        while(lo<=hi){
            if(a[i]+a[lo]+a[hi]==k){
                ans[0]=a[i];
                ans[1]=a[lo];
                ans[2]=a[hi];
                
                return true;
            }
            if(a[i]+a[lo]+a[hi]<k) lo++;
            else if(a[i]+a[lo]+a[hi]>k) hi--;
        }
        }
        return false;
    }
    public static void main(String[] args) {
        //check if sum of three integers is equal to target
        //using two pointer
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k=sc.nextInt();
        Arrays.sort(a);
        if(threeSum(a,k)){
            System.out.println("YES "+ans[0]+" "+ans[1]+" "+ans[2]);
        }
        else
            System.out.println("No three elements exists in the array with sum as target");
        
}
}