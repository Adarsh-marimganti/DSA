import java.io.*;
import java.util.*;
class Pair{
    int at;
    char type;
    Pair(int x,char y){
        at=x;
        type=y;
    }
}
public class MinimumPlatforms {
    public static int findPlatform(int a[], int d[], int n){
       int ans=0;
       ArrayList<Pair> p=new ArrayList<>();
       for(int i=0;i<n;i++) p.add(new Pair(a[i],'a'));
       for(int i=0;i<n;i++) p.add(new Pair(d[i],'d'));
       Collections.sort(p,new customComparator());
       int c=0;
       for(Pair t:p){
           if(t.type=='a'){
               c++;
               ans=Math.max(ans,c);
           }
           else{
               c--;
           }
       }
       return ans;
    }
    public static void main(String[] args) {
        //minimum number of platforms required for the railway station so that no train is kept waiting.
        //assuming it on number line
        //O(nlogn), O(n)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) b[i]=sc.nextInt();
        System.out.println(findPlatform(a,b,n));
}
}
class customComparator implements Comparator<Pair>{
    public int compare(Pair a,Pair b){
        return a.at-b.at;
    }
}