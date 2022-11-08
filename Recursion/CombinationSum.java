import java.io.*;
import java.util.*;
public class CombinationSum{
    public static void subsetsWithSum(int[] a,int idx,int target,int n,ArrayList<Integer> al){
        if(idx>=n){
            if(target==0){
                for(int e:al) System.out.print(e+" ");
                System.out.println();
            }
            return;
        }
        if(a[idx]<=target){
            al.add(a[idx]);
            subsetsWithSum(a,idx,target-a[idx],n,al);
            al.remove(al.size()-1);
        }
        
        subsetsWithSum(a,idx+1,target,n,al);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        subsetsWithSum(a,0,k,n,al);
    }
} 