import java.io.*;
import java.util.*;

public class ROT13{
    public static char rot13(char c){
        if(c>='a' && c<='z'){
            int a=(int) c;
            if(a+13<123) c=(char) (a+13);
            else
            c=(char) ((a+13)%123 + 96);
        }
        else if(c>='A' && c<='Z'){
            int a=(int) c;
            if(a+13<92) c=(char) (a+13);
            else{
                c=(char) (((a+13)%92)+64);
            }
        }
        return  c;
    }
    public static String Rot13(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            ans+=rot13(s.charAt(i));
        }
        return ans;
    }
    public static void main(String[] args){
        //move every character of a string by 13 places
        //O(n),O(1)
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Rot13(s));
    }
}