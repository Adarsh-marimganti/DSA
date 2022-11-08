import java.io.*;
import java.util.*;

public class MinimumInsertions {
    public static ArrayList<String> ml=new ArrayList<>();
    public static void subSequences(String s,String ans){
        if(s.length()==0){
            ml.add(ans);
            return;
        }
        subSequences(s.substring(1),ans+s.charAt(0));
        subSequences(s.substring(1),ans);
    }
    public static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        if(sb.reverse().toString().equals(s)) return true;
        return false;
    }
    public static int countMin(String s){
        subSequences(s,"");
        int max=0;
        for(String st:ml){
            if(isPalindrome(st) && st.length()>max){
                max=st.length();
            }
        }
        return s.length()-max;
    }
    public static void main(String[] args){
        //minimum insertions to make a string as a palindrome
        //O(n*n*n),O(1)
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(countMin(s));
    }
}