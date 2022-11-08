import java.io.*;
import java.util.*;

public class IsRotated {
    public static boolean isRotated(String str1, String str2){
        // Your code here
        if(str1.length()!=str2.length()) return false;
        int n=str2.length();
        String cl=str2.substring(n-2,n)+str2.substring(0,n-2);
        String acl=str2.substring(2,n)+str2.substring(0,2);
        if(str1.equals(cl) || str1.equals(acl)) return true;
        return false;
    }
    public static void main(String[] args){
        //check if second string is equal to first string either by rotating 2 places clockwise or 2 places anti clock             wise
        //O(1),O(n+n)
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(isRotated(s1,s2));
    }
}