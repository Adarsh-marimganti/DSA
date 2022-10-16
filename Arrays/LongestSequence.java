import java.io.*;
import java.util.*;
public class LongestSequence {
    public static int longestSequence(int[] a,HashSet<Integer> hs){
        int n=a.length;
        int longestStreak=0;
        int currentStreak=0;
        for(int i=0;i<n;i++){
            int x=a[i];
            if(!hs.contains(x-1)){
                currentStreak=1;
            }
            else{
                while(hs.contains(x+1)){
                    currentStreak+=1;
                    x++;
                }
            }
            longestStreak=Math.max(longestStreak,currentStreak);
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        //longest consecutive sequence
        //using a hash set 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            hs.add(a[i]);
        }
        System.out.println(longestSequence(a,hs));        
}

}
