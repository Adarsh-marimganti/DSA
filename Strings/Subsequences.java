import java.util.*;
public class Subsequences {
    public static ArrayList<String> ml=new ArrayList<>(); 
    public static void subSequences(String s,String ans){ 
        if(s.length()==0){
            ml.add(ans);
            return;
        } 
        subSequences(s.substring(1),ans+s.charAt(0)); 
        subSequences(s.substring(1),ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<Character> l=new ArrayList<>();
        subSequences(s,"");
        int maxl=0;
        for(String st: ml){
            System.out.println(st);
        }
}
}
