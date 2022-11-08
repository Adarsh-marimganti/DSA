import java.io.*;
import java.util.*;

public class Permutations {
    public static String swap(String s,int i,int j){
        char[] c=s.toCharArray();
        char t=c[i];
        c[i]=c[j];
        c[j]=t;
        s=String.valueOf(c);
        return s;
    }
    public static void permutations(String s,int l,int r){
        if(l==r){
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            permutations(s,l+1,r);
            s=swap(s,l,i);
        }
    }
    public static void main(String[] args){
        //Permutations of a string
        //using backtracking
        //run a loop from from l to r, swap l with i
        //call permutations fro l+1
        //swap back from i to l
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        permutations(s,0,s.length()-1);
    }
}