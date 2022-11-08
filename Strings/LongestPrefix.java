import java.io.*;
import java.util.*;

public class LongestPrefix {
    public static String longestPrefix(String[] a) {
        if(a.length==0) return "";
        String prefix=a[0];
        for(int i=1;i<a.length;i++){
            while(a[i].indexOf(prefix)!=0) prefix=prefix.substring(0,prefix.length()-1);
        }
        return prefix;
    }

    public static void main(String[] args){
        //longest common prefix
        //O(n*n),O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         String[] a=new String[n];
        for(int i=0;i<n;i++) a[i]=sc.next();
        System.out.print(longestPrefix(a));
    }
}