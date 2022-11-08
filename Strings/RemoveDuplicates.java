import java.io.*;
import java.util.*;

public class RemoveDuplicates {
    public static String removeDups(String s) {
        String ans="";
        boolean[] a=new boolean[125];
        for(int i=0;i<s.length();i++){
            if(!a[(int) s.charAt(i)]){
                a[(int) s.charAt(i)]=true;
                ans+=s.charAt(i);
            }
        }
        return ans;
       }
    public static void main(String[] args){
        //remove duplicates from a string leaving the first occurence of the character
        //O(n),O(1)
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(removeDups(s));
    }
}