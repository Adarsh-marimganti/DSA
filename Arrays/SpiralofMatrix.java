import java.io.*;
import java.util.*;

public class SpiralofMatrix {
    public static int[][] spiral(int n){
        int c=1;
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=n-1;
        int d=0;
        int[][] a=new int[n][n];
        while(top<=bottom && left<=right){
            if(d==0){
                for(int i=left;i<=right;i++){
                    a[top][i]=c;
                    c++;
                }
                d++;
                top++;
            }
            else if(d==1){
                for(int i=top;i<=bottom;i++){
                    a[i][right]=c;
                    c++;
                }
                d++;
                right-=1;
            }
            else if(d==2){
                for(int i=right;i>=left;i--){
                    a[bottom][i]=c;
                    c++;
                }
                d++;
                bottom-=1;
            }
            else if(d==3){
                for(int i=bottom;i>=top;i--){
                    a[i][left]=c;
                    c++;
                }
                d++;
                d=(d%4);
                left++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        //spiralling of a matrix
        //O(n*n)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        a=spiral(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}