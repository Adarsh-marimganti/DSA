import java.io.*;
import java.util.*;

public class LongestSubstrDistinctChars {
   static int longestSubstrDistinctChars(String s){
        int i=0,j=0;
        char[] a=s.toCharArray();
        int n=a.length;
        HashSet<Character> set=new HashSet<>();
        int c=0;
        int ml=0;
        while(i<=j && i<n && j<n){
            if(!set.contains(a[j])){
                set.add(a[j]);
                c++;
                ml=Math.max(ml,c);
                j++;
            }
            else{
                set.remove(a[i]);
                i++;
                c--;
            }
        }
        return ml;
}
    public static void main(String[] args){
        //longest sub string with distinct characters
        //O(n),O(1)
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(longestSubstrDistinctChars(s));
    }
}