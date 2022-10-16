import java.io.*;
import java.util.*;
    public class LeftSmallandRightGreater {
        public static int[] ans=new int[3];
        public static int getElement(int[] a,int n){
            int[] lmax=new int[n];
            int[] rmin=new int[n];
            int max=a[0];
            for(int i=0;i<n;i++){
                if(a[i]>max) max=a[i];
                lmax[i]=max;
            }
            int min=a[n-1];
            for(int i=n-1;i>=0;i--){
                if(a[i]<min) min=a[i];
                rmin[i]=min;
            }
            for(int i=1;i<n-1;i++){
                if(lmax[i]==rmin[i]) return a[i];
            }
            return -1;
        }
        public static void main(String[] args) {
            //first element in array such that all of its left elements are smaller and right elements to it are greater
            //O(n),O(n)
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            System.out.print(getElement(a,n));
    }
    }
