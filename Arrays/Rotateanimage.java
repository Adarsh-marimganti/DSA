import java.io.*;
import java.util.*;

public class Rotateanimage {
    public static void main(String[] args) {
        //rotate a matrix
        //take transpose then swap columns
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
        //interchanging the left and right columns
        int lo=0;
        int ri=m-1;
        while(lo<=ri){
            for(int i=0;i<n;i++){
            int t=a[i][lo];
                a[i][lo]=a[i][ri];
                a[i][ri]=t;
                }
            lo++;
            ri--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
}
}