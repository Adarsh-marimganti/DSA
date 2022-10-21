import java.io.*;
import java.util.*;

public class SearchInMatrix {
     public static boolean searchMatrix(int[][] a, int k) {
        int n=a.length;
        int m=a[0].length;
        int lo=0;
        int hi=(n*m)-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid/m][mid%m]==k) return true;
            if(a[mid/m][mid%m]<k) lo=mid+1;
            if(a[mid/m][mid%m]>k) hi=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        //Search in a matrix
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int ans=searchMatrix(a,b);
        System.out.println(ans);
    }
    
}