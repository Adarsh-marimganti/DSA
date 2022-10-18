import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class LongestPalindrome {
    public static int expand(String s,int l,int r){
        int n=s.length();
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    public static String longestPalindrome(String s){
        int start=0;
        int end=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            int e=expand(s,i,i+1);
            int o=expand(s,i,i);
            int ml=Math.max(e,o);
            if(ml>max){
                max=ml;
                start=i-(ml-1)/2;
                end=i+ml/2;
            }
        }
        return s.substring(start,end+1);
    }
    public static void main(String[] args){
        //longest palindroic substring
        //expanding from index to get the length of palindrome formed from that index
        //
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=longestPalindrome(s);
        System.out.println("Maximum length is: "+s.length());
        System.out.println(s);
    }
}