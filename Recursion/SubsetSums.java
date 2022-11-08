import java.io.*;
import java.util.*;
public class SubsetSums{
    public static void subsetSums(int[] a,int n,int sum,int i){
        if(i>=n){
            System.out.println(sum);
            return;
        }
        sum+=a[i];
        subsetSums(a,n,sum,i+1);
        sum-=a[i];
        subsetSums(a,n,sum,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        subsetSums(a,n,0,0);
    }
}