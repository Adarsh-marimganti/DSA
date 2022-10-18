import java.io.*;
import java.util.*;

public class IsRotatedString{
   public static int isRotated(String s1, String s2)
    {
        if(s1.length()!=s2.length()) return -1;
        int n=s1.length();
        for(int i=0;i<s2.length();i++){
            String p=s2.substring(i+1,n)+s2.substring(0,i+1);
            if(p.equals(s1))
            return i+1;
        }
        return -1;
    }
    public static boolean isRotatedBool(String a,String b){
        if(a.length()!=b.length()) return false;
        a=a+a;
        if(a.indexOf(b)!=-1) return true;
        return false;
    }
    public static void main(String[] args){
        //check if two strings are rotation of each other or not
        //O(n),O(n)
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int l=isRotated(a,b);
        //alternative method
        // boolean bol=isRotatedBool(a,b);
        // if(bol) System.out.println("Yes");
        // else System.out.println("No");
        if(l!=-1)
        System.out.print("Rotate string left by "+l+" places");
        else
            System.out.println("Strings are not rotation of each other");
    }
}