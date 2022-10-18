import java.io.*;
import java.util.*;

public class RecursivelyRemoveDuplicates {
    public static String rremove(String s) {
        String ans="";
        int n=s.length();
        int i=0;
        while(i<n){
            if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                
                while(i<n-1 && s.charAt(i)==s.charAt(i+1))
                    i++;
            }
            else{
            ans+=s.charAt(i);
            }
            i++;
        }
        return ans;
    }
    public static String removeDuplicates(String s){
        String s1="";
        while(s1.length()!=s.length()){
            s1=s;
            s=rremove(s);
        }
        return s;
    }
    public static void main(String[] args){
        //recursively remove all duplicates
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(removeDuplicates(s));
    }
}