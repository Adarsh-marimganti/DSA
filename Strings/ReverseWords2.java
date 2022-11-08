import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class ReverseWords2 {
   public static String reverseWords(String s){
        String[] str=s.split("\\.");
        int i=0,j=str.length-1;
        while(i<=j){
            String t=str[i];
            str[i]=str[j];
            str[j]=t;
            i++;
            j--;
        }
        String ans="";
        for( i=0;i<str.length;i++){
            ans+=str[i];
            ans+=".";
        }
        return ans.substring(0,ans.length()-1);
    }
    public static void main(String[] args){
        //reverse words in a string
        //using .split(".") to split string into array
        //O(n), O(n)
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=reverseWords(s);
        System.out.println(s);
    }
}