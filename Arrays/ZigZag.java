public import java.io.*;
import java.util.*;

public class ZigZag {
    public static void zigZag(int a[], int n) {
        Arrays.sort(a);
        for(int i=1;i+1<n;i+=2){
            int t=a[i];
            a[i]=a[i+1];
            a[i+1]=t;
        }
    }
    public static void main(String[] args) {
        //convert array in the fiven format
        //arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]
        //first sort then swap all elements in pairs excluding first element
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        zigZag(a,n);
        System.out.println("After zig-zag arrangement:- ");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
}
} 
