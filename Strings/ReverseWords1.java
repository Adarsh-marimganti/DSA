import java.io.*;
import java.util.*;

public class ReverseWords1 {
    public static String reverse(String s){
        char[] c=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char ch=c[i];
            c[i]=c[j];
            c[j]=ch;
            i++;
            j--;
        }
        return String.valueOf(c);
    }
    public static String reverseWords(String s){
        String[] str=s.split("\\.");
        String ans="";
        for(int i=0;i<str.length;i++){
            //System.out.println(str[i]);
            str[i]=reverse(str[i]);
            ans+=str[i];
            ans=ans+".";
        }
        return ans;
    }
    public static void main(String[] args){
        //reverse words in a string
        //using .split(".") to split string into array
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=reverseWords(s);
        System.out.println(s);
    }
}