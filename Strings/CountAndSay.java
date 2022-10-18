import java.io.*;
import java.util.*;

public class CountAndSay{
    public static String countAndSayUtil(String s){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            int c=0;
            int j=i;
            while(j<s.length()){
                if(s.charAt(i)==s.charAt(j)) c++;
                else break;
                j++;
            }
            sb.append(c+"");
            sb.append(s.charAt(i)+"");
            i=j;
            
        }
        return sb.toString();
    }
    public static String countAndSay(int n) {
        if(n==1) return "1";
        int i=2;
        String s="1";
        while(i<=n){
            s=countAndSayUtil(s);
            i++;
        }
        return s;
    }
    public static void main(String[] args){
        //countAndSay(1) = "1"
        //countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into           a different digit string
        //O(n*n),O(1)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countAndSay(n));
    }
}