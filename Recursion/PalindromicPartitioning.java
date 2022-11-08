import java.io.*;
import java.util.*;
public class PalindromicPartitioning{
    public static void palindromicPartitions(String s,int idx,ArrayList<String> al,int n){
        if(idx==n){
            for(String st:al) System.out.print(st+" ");
            System.out.println();
            return;
        }
        for(int i=idx;i<n;i++){
            if(isPalindrome(s.substring(idx,i+1))){
                al.add(s.substring(idx,i+1));
                palindromicPartitions(s,i+1,al,n);
                al.remove(al.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> al=new ArrayList<>();
        palindromicPartitions(s,0,al,s.length());
    }
}