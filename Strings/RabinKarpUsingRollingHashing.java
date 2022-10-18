public import java.io.*;
import java.util.*;


public class RabinKarpUsingRollingHashing {
    public static int p = 33;
    public static int k = 10000009;    //(int)(1e7+9)

    public static int countPattern(String pattern,String txt){
        int m = pattern.length();
        int n = txt.length();
        int p1= p;
        int hA=0,hB=0;         //hA for hashing of text and hB for pattern
        int count=0;
        for(int i=0;i<=m-1;i++){
          int x = txt.charAt(i);
          int y = pattern.charAt(i);
          hA = (hA + (x*p1)%k)%k;
          hB = (hB + (y*p1)%k)%k;
          p1 = (p1*p)%k;
        }
        if(hA == hB)    count++;
        int p2=p;
        for(int i=m;i<=n-1;i++){
            int x = txt.charAt(i-m);       //remove x from hA first ele to window
            int y = txt.charAt(i);         //add x to hA new ele to window
            hA = (hA  - (x*p2)%k + (y*p1)%k + k)%k;
            hB = (hB*p)%k;
            p1 = (p1*p)%k;
            p2 = (p2*p)%k;
            if(hA == hB)    count++;
        }
        return count;
    }


    public static void main(String[] args){
        //Rabin Karp String matching algorithm
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.println(countPattern(a,b));
          
    }
} sd {
    
}
