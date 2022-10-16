import java.io.*;
import java.util.*;
public class RearrangeArray {
    public static void rearrange(int a[], int n){
        int maxi=n-1;
        int mini=0;
        //max element should be greater by 1 than last element
        int maxe=a[n-1]+1;
        for(int i=0;i<n;i++){
            //even
            if(i%2==0){
                a[i]=a[i]+(a[maxi]%maxe)*maxe;
                maxi--;
            }
            //odd
            else{
                a[i]=a[i]+(a[mini]%maxe)*maxe;
                mini++;
            }
        }
        // for(int i=0;i<a.length;i++){
            
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println();
        for(int i=0;i<a.length;i++){
            
            a[i]=(a[i]/maxe);
        }
        
    }
    public static void main(String[] args) {
        //given a sorted array
        //rearrange the array in such a way that maximum and minimum elements are arranged alternatively
        //using extra space O(n) , O(n)
        //using formula O(n+n), O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        rearrange(a,n);
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
}
}

