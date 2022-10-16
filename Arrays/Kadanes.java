//package Arrays;
import java.util.*;
public class Kadanes {
    public static int kadanes(int[] a){
        int maxSum=0;
        for(int i=0;i<a.length;i++){
            maxSum+=a[i];
            maxSum=Math.max(maxSum,0);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        //get maximum sub-array sum
        //kadanes algorithm
        //O(n)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(kadanes(a));
}
}
