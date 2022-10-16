import java.io.*;
import java.util.*;
public class FourSum {
    public static int[] ans=new int[4];
    public static boolean fourSum(int[] a,int k){
        int n=a.length;
        for(int i=0;i+2<n;i++){
            for(int j=i+1;j+1<n;j++){
        int lo=j+1;
        int hi=n-1;
        while(lo<=hi){
            if(a[i]+a[j]+a[lo]+a[hi]==k){
                ans[0]=a[i];
                ans[1]=a[j];
                ans[2]=a[lo];
                ans[3]=a[hi];
                
                return true;
            }
            if(a[i]+a[j]+a[lo]+a[hi]<k) lo++;
            else if(a[i]+a[j]+a[lo]+a[hi]>k) hi--;
        }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //check if sum of four integers is equal to target
        //using two pointer
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k=sc.nextInt();
        Arrays.sort(a);
        if(fourSum(a,k)){
            System.out.println("YES "+ans[0]+" "+ans[1]+" "+ans[2]+" "+ans[3]);
        }
        else
            System.out.println("No three elements exists in the array with sum as target");
        
}

}
