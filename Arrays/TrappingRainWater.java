import java.io.*;
import java.util.*;
public class TrappingRainWater {
    public static int trappingWater(int[] a,int n){
        int[] lmax=new int[n];
        int[] rmax=new int[n];
        int max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max)
                max=a[i];
            lmax[i]=max;
            
        }
        max=a[n-1];
        for(int i=n-1;i>=0;i--){
            if(a[i]>max)
                max=a[i];
            rmax[i]=max;
            
        }
        // for(int i=0;i<n;i++) System.out.print(lmax[i]+" ");
        // System.out.println();
        // for(int i=0;i<n;i++) System.out.print(rmax[i]+" ");
        int water=0;
        for(int i=0;i<n;i++){
            water+=Math.min(lmax[i],rmax[i])-a[i];
        }
        return water;
    }
    public static void main(String[] args) {
        //trapping rain water
        //O(n+n+n), O(n+n)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(trappingWater(a,n));
}
}
