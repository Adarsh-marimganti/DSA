import java.io.*;
import java.util.*;
public class PythagoreanTriplet {
    public static int[] ans=new int[3];
    public static boolean pythagoreanTriplet(int[] arr,int n){
        boolean bool[]=new boolean[10000000+1];
        for(int i=0;i<n;i++){
            int c=arr[i]*arr[i];
            bool[c]=true;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a=arr[i]*arr[i];
                int b=arr[j]*arr[j];
                if(bool[a+b]){
                    ans[0]=arr[i];
                    ans[1]=arr[j];
                    ans[2]=(int) Math.sqrt(a+b);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //triplet (a, b, c) that satisfies a^2 + b^2 = c^2
        //1 <= a[i] <= 1000
        //O(n*n),O(10^6)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        if(pythagoreanTriplet(a,n))
            System.out.print(ans[0]+" "+ans[1]+" "+ans[2]);
        else
            System.out.println("No pythagorean triplet found");
}
}
