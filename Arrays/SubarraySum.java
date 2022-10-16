import java.io.*;
import java.util.*;
public class SubarraySum {
    
    public static int[] ans=new int[2];
    public static boolean subarraySum(int[] a,int k){
        int i=0;
        int j=0;
        int sum=0;
        int n=a.length;
        while(j<n){
            if(sum<k){
                sum+=a[j];
                if(sum!=k)
                j++;
            }
            else if(sum==k){
                ans[0]=i;
                ans[1]=j;
                return true;
            }
            else if(sum>k){
                while(sum>k){
                    sum=sum-a[i];
                    i++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //subarray with given sum
        //Using sliding window
        // O(n), O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        if(subarraySum(a,k)){
            System.out.println(ans[0]+" "+ans[1]);
        }
        else{
            System.out.println("No subarray exists with the given sum");
        }
}

}
