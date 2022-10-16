import java.io.*;
import java.util.*;
public class MergetwoSortedArrays {
    public static int[] insertion(int[] array){
         int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }
        return array;
    }
    public static void Sort(int[] a,int[] b,int n,int m){
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]<b[j]) i++;
            else{
                int t=a[i];
                a[i]=b[j];
                b[j]=t;
                b=insertion(b);
                i++;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }
        for(int k=0;k<m;k++){
            System.out.print(b[k]+" ");
        }
    }
    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void usingGap(int[] a,int[] b,int n,int m){
        int gap=(n+m)/2;
        
        while(gap>0){
            int i=0;
            int j=gap;
            while(j<(n+m)){
                if(j<n && i<n){
                    if(a[i]>a[j]){
                        int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                } 
                else if(j>=n && i<n){
                    if(a[i]>b[j-n]){
                        int t=a[i];
                        a[i]=b[j-n];
                        b[j-n]=t;
                    }
                }
                else if(i>=n && j>=n){
                    if(b[i-n]>b[j-n]){
                        int t=b[i-n];
                        b[i-n]=b[j-n];
                        b[j-n]=t;
                    }
                }
                i++;
                j++;
            }
            if(gap==1) gap=0;
            else
            gap=gap/2;
        }
        for(int k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }
        for(int k=0;k<m;k++){
            System.out.print(b[k]+" ");
        }
    }
    public static void main(String[] args) {
        //merge two sorted arrays without using extra space
        //using insertion sort algorithm O(n*m), O(1)
        //using gap method O((n+m)log(n+m)), O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++) b[i]=sc.nextInt();
        //using insertion sort
        //Sort(a,b,n,m);
        
        //using gap method
        usingGap(a,b,n,m);
}
}