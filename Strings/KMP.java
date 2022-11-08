import java.io.*;
import java.util.*;

public class KMP{
    public static int start;
    public static int end;
    public static int[] generateLPS(String p){
        int m=p.length();
        int[] lps=new int[m];
        char[] c=p.toCharArray();
        int len=0;
        int i=1;
        while(i<m){
            if(c[i]==c[len]){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0)
                    len=lps[len-1];
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        //to create lps array with 1st element as -1 for easier implementation
        int[] t=new int[m+1];
        t[0]=-1;
        for(i=0;i<m;i++) t[i+1]=lps[i];
        return t;
    }
    public static boolean KMPalgorithm(String a,String b){
        int n=a.length();
        int m=b.length();
        char[] s=a.toCharArray();
        char[] p=b.toCharArray();
        int[] lps=new int[m+1];
        lps=generateLPS(b);
        int i=0,j=0;
        while(i<n){
            if(s[i]==p[j]){
                i++;
                j++;
            }
            else{
                if(lps[j]!=-1) j=lps[j];
                else i++;
            }
            if(j==m){
                start=i-m;
                end=i-1;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        //KMP string matching algorithm
        //two strings of lengths a(n) amd b(m) are given check whether b is present in a or not?
        //O(n+m),O(m)
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        boolean t=KMPalgorithm(a,b);
        if(t) System.out.println("Pattern found at "+start+" to "+end);
        else System.out.println("Pattern not found");
    }
}