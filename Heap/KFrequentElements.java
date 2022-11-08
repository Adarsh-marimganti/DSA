import java.io.*;
import java.util.*;
public class KFrequentElements{
    public static int[] topKFrequent(int[] a, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i])){
                int c=hm.get(a[i])+1;
                hm.put(a[i],c);
            }
            else
                hm.put(a[i],1);
        }
        // System.out.println("Before Soring");
        // for(Map.Entry<Integer,Integer> m: hm.entrySet()){
        //     System.out.println(m.getKey()+" "+m.getValue());
        // }
        Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(es);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b){
        return b.getValue()-a.getValue();
    }
        });
        int[] ans=new int[k];
        int j=0;
        //System.out.println("After sorting");
        for(Map.Entry<Integer,Integer> m: list){
            if(j<k){
                ans[j]=m.getKey();
                j++;
            }
            //System.out.println(m.getKey()+" "+m.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        //K most frequent elements
        //Using Map
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        int[] ans=topKFrequent(a,k);
        for(int i=0;i<k;i++) System.out.print(ans[i]+" ");
    }
}