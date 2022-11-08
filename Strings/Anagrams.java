import java.io.*;
import java.util.*;

public class Anagrams {
    public static boolean isAnagram(String s1,String s2){
        int[] a = new int[125];
        int[] b = new int[125];
        for(int i=0;i<s1.length();i++){
            a[(int) s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            b[(int) s2.charAt(i)]++;
        }
        for(int i=97;i<a.length;i++) if(a[i]!=b[i]) return false;
        return true;
    }
    public static void main(String[] args){
        //check anagarams
        //string which id formed by rearranging the letters of another
        //using two count arrays,lowerCase, 97-122
        //O(n+m+125), O(n+m)
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(isAnagram(a,b))
            System.out.println("Given strings are anagrams");
        else
            System.out.println("Given strings are not anagrams");
    }
}